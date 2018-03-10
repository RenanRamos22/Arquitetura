package br.edu.up.SistemaHospedagemArqSoft.dao;

import java.util.List;

import javax.persistence.EntityManager;

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

	}

	@Override
	public void excluir(Servico t) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Servico> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Servico buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
