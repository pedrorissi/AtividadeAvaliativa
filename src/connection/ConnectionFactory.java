package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectionFactory {
	
	private final static String url = "jdbc:sqlserver://localhost:1433;databaseuser=bdCandidato";
	private final static String userName="sa";
	private final static String password="12345";
	
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados!!", "Erro!!", 2, null);
		}
		return null;
	}
	
	public static void closeConnection(Connection con) {
		
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados", "Erro!", 2, null);
			}
		}
	}
	
	public static void closeConnection(Connection con, PreparedStatement stmt) {
		
		closeConnection(con);
		if(stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				JOptionPane.showInternalMessageDialog(null, "Erro ao finalizar a conexão!", "Erro!", 2);
			}
		}
	}
	
}
