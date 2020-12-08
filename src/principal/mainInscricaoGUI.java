package principal;

import java.sql.Connection;

import javax.swing.JOptionPane;

import connection.ConnectionFactory;
import view.InscricaoGUI;

public class MainInscricaoGUI {
	
	public static void main(String[] args) {
		
		Connection con = null;
		con = ConnectionFactory.getConnection();
		if(con!=null) {
			JOptionPane.showInternalMessageDialog(null, "Sucesso na conexão!!", "Sucesso", 1, null);
		}
		
		InscricaoGUI tela = new InscricaoGUI();
		
	}
}
