package br.edu.up.SistemaHospedagemArqSoft.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.edu.up.SistemaHospedagemArqSoft.entity.Plano;

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
		// TODO Auto-generated method stub

	}

	@Override
	public void excluir(Plano t) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Plano> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plano buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}



}
