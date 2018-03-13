package br.edu.up.SistemaHospedagemArqSoft.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import br.edu.up.SistemaHospedagemArqSoft.entity.Plano;
import br.edu.up.SistemaHospedagemArqSoft.entity.Servico;

public class PlanoDao implements Dao<Plano> {

	@Override
	public void salvar(Plano t) {
		// TODO Auto-generated method stub
		EntityManager em = new Conexao().getInstance();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void alterar(Plano t) {
		EntityManager em = new Conexao().getInstance();
		em.getTransaction().begin();		
		em.merge(t);		
		em.getTransaction().commit();		
		em.close();			
	}

	@Override
	public void excluir(Plano t) {
		EntityManager em = new Conexao().getInstance();
		em.getTransaction().begin();
		Plano serv = em.find(Plano.class, t.getId());		
		em.remove(serv);
		em.getTransaction().commit();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Plano> listar() {
		EntityManager em = new Conexao().getInstance();
		Query q = em.createQuery("select p from Plano p");
		return q.getResultList();
	}

	@Override
	public Plano buscar(Integer id) {
		EntityManager em = new Conexao().getInstance();
		
		return em.find(Plano.class, id);
	}



}
