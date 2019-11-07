package projetoPP2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class GenericTableModel<T> extends AbstractTableModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private AbstractDAO<T> dao;
	private List<T> dados;
	
	public GenericTableModel(AbstractDAO<T> dao) {
		this.dao = dao;
		dados = dao.read();
	}

	public int getColumnCount() {
		Object obj = dados.get(0);
		Class classe = obj.getClass();
		int conta = 0;
		for (Field f : classe.getDeclaredFields()) {
			if (f.isAnnotationPresent(ColunaAnnotation.class)) {
				conta ++;
			}
		}
		return conta;
	}
	
    public String getColumnName(int col) {
    	Object obj = dados.get(0);
		Class classe = obj.getClass();
		for (Field f : classe.getDeclaredFields()) {
			if (f.isAnnotationPresent(ColunaAnnotation.class)) {
				ColunaAnnotation a = f.getDeclaredAnnotation(ColunaAnnotation.class);
				if (a.posicao() == col) {
					return a.nome();
				}
			}
		}
		return null;
	}				

	public int getRowCount() {
		return dados.size();
	}

	 public Object getValueAt(int lin, int col) {
	        T obj = dados.get(lin);
	        Class classe = obj.getClass();
	        Field fields[] = classe.getDeclaredFields();
	        for (Field f : fields) {
				if (f.isAnnotationPresent(ColunaAnnotation.class)) {
					ColunaAnnotation annotation = f.getDeclaredAnnotation(ColunaAnnotation.class);
					if (annotation.posicao() == col) {
						String fieldName = f.getName();
						String methodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
						Method m;
						try {
							m = classe.getMethod(methodName);
							Object value = m.invoke(obj);
							return value;
						} catch (NoSuchMethodException | SecurityException | IllegalAccessException
								| IllegalArgumentException | InvocationTargetException e) {
							e.printStackTrace();
						}
					}
				}

			}
			return null;
		}

}
