package br.edu.up.SistemaHospedagemArqSoft.dao;

import java.util.List;

import javax.persistence.EntityManager;


import br.edu.up.SistemaHospedagemArqSoft.entity.Cliente;

public class ClienteDao implements Dao<Cliente>{

	@Override
	public void salvar(Cliente t) {
		EntityManager em = Conexao.getInstance();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void alterar(Cliente t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Cliente t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
