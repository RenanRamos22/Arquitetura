package br.edu.up.sistemadevendas.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.edu.up.sistemadevendas.entity.Cliente;

public class ClienteDao implements Dao<Cliente> {

	@Override
	public void salvar(Cliente c) {
		EntityManager em = Conexao.getInstance().createEntityManager();

		em.getTransaction().begin();
		
		em.persist(c);
		
		em.getTransaction().commit();
		
		em.close();	
		
	}

	@Override
	public void alterar(Cliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Cliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
