package banco;

import java.sql.*;
import java.util.List;

public class ContaDAO {
		
		private Connection conn;
		private String url;
		
		public ContaDAO(String username, String password) {
			url = "jdbc:mysql://localhost/products?user=" + username + "&password=" + password + "&useTimezone=true&serverTimezone=UTC";
		}
		
		public void create(Conta conta) throws SQLException {
			String sql = "insert into Banco (titular, saldo, status,numConta, tipoConta) values (?, ?, ?, ?, ?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, conta.getTitular());
			stmt.setFloat(2, conta.getSaldo());
			stmt.setBoolean(3, conta.getStatus());
			stmt.setInt(4, conta.getNumConta());
			stmt.setString(5, conta.getTipoConta());
			stmt.execute();
			stmt.close();
		}
		
		public List<Conta> read () {
			return null;
		}
		
		public void openConnection () throws SQLException {
			conn = DriverManager.getConnection(url);
		}
		public void closeConnection () throws SQLException {
			conn.close();
		}
		

	}



