package controller;

import model.Candidato;

public class CandidatoController {
	
	public int cadastrar(String nome, String Cpf, int cargo) {
		
		Candidato c = new Candidato(nome, Cpf, cargo);
		CandidatoDAO cDao = new CandidatoDAO();
		
		return (cDao.create(c));
		
		
	}
}
