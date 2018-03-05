package br.edu.up.SistemaHospedagemArqSoft.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {

	static EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("crm");
	
	public static EntityManager getInstance() {
		return emf.createEntityManager();
	}
}
