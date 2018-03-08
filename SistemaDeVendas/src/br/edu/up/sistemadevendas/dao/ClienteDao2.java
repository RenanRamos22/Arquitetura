package br.edu.up.sistemadevendas.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.edu.up.sistemadevendas.entity.Cliente;

public class ClienteDao2 implements Dao<Cliente>{
	
	@Override
	public void salvar(Cliente t) {
		EntityManager em = new Conexao().getInstance();

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


