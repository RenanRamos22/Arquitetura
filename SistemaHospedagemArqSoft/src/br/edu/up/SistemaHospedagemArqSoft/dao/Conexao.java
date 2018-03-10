package br.edu.up.SistemaHospedagemArqSoft.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {

	public static  EntityManagerFactory emf =
			Persistence.
			createEntityManagerFactory("crm");
	
	public EntityManager getInstance() {
		return emf.createEntityManager();
	}
}
