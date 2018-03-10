package br.edu.up.SistemaHospedagemArqSoft.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.up.SistemaHospedagemArqSoft.entity.Cliente;




public class ClienteDao implements Dao<Cliente>{

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
		EntityManager em = new Conexao().getInstance();
		em.getTransaction().begin();		
		em.merge(t);		
		em.getTransaction().commit();		
		em.close();			
	}

	@Override
	public void excluir(Cliente t) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> listar() {
		EntityManager em = new Conexao().getInstance();
		Query q = em.createQuery("select c from Cliente c");
		return q.getResultList();
	}

	@Override
	public Cliente buscar(Integer id) {
    EntityManager em = new Conexao().getInstance();
		
		return em.find(Cliente.class, id);
	}

}
