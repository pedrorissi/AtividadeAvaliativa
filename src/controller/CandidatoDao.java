package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connection.ConnectionFactory;
import model.Candidato;
import view.InscricaoGUI;

public class CandidatoDAO {
	
	
	public int create(Candidato c) {
		Connection con = null;
		PreparedStatement stmt = null;
		String sqlInsert = "INSERT INTO candidato (nome, cpf, cargo) VALUES(?,?,?)";
		
		con = ConnectionFactory.getConnection();
		
		try {
			stmt = con.prepareStatement(sqlInsert);
			stmt.setString(1, c.getNome());
			stmt.setString(2, c.getCpf());
			stmt.setInt(3, c.getCargo());
			stmt.execute();
			return 1;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro na inserção dos dados!!", "ERRO!", 2);
			return 0;
		}finally {
			ConnectionFactory.closeConnection(con, stmt);
		}

	}
}
