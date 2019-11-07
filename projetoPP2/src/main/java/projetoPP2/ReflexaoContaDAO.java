package projetoPP2;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;

	import ufma.ecp.paradigmas.docentesigaa.Docente;
	
	public class ReflexaoContaDAO implements AbstractDAO<Conta> {
		
		private Connection conn;
		private PreparedStatement stmt;
		private final String url = "jdbc:mysql://localhost:3306/ProjetoPP?user=root&password=melquias123&useTimezone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false";

		
		
		public ReflexaoDocenteDAO(){
			try {
				conn = DriverManager.getConnection(url);
				System.out.println("Conectado!");
			}catch(SQLException e){
				throw new RuntimeException(e);
			}
		}
		
		@Override
		public void create(Conta conta) {
		}

		@Override
		public List<Conta> read() {			
			List<Conta> lista = new ArrayList<Conta>();
			String sql = "select * from conta";
			try {
				stmt = conn.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery();
				
				while(rs.next()) {
					lista.add(new Conta(rs.getString("titular"), rs.getString("tipoConta"), rs.getInt("numConta")));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			return lista;
		}
		
	}


}
