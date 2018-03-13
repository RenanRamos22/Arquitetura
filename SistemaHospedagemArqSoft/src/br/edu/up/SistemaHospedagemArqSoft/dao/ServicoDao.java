package br.edu.up.SistemaHospedagemArqSoft.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.up.SistemaHospedagemArqSoft.entity.Cliente;
import br.edu.up.SistemaHospedagemArqSoft.entity.Servico;

public class ServicoDao implements Dao<Servico> {

	@Override
	public void salvar(Servico t) {
		
		EntityManager em = new Conexao().getInstance();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void alterar(Servico t) {
		// TODO Auto-generated method stub
		EntityManager em = new Conexao().getInstance();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void excluir(Servico t) {
		EntityManager em = new Conexao().getInstance();
		em.getTransaction().begin();
		Servico serv = em.find(Servico.class, t.getId());		
		em.remove(serv);
		em.getTransaction().commit();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Servico> listar() {
		
		EntityManager em = new Conexao().getInstance();
		Query q = em.createQuery("select s from Servico s");
		return q.getResultList();
	}

	@Override
	public Servico buscar(Integer id) {
		EntityManager em = new Conexao().getInstance();
		
		return em.find(Servico.class, id);
	}

}
