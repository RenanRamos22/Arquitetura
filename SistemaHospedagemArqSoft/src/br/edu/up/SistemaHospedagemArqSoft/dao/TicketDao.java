package br.edu.up.SistemaHospedagemArqSoft.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.edu.up.SistemaHospedagemArqSoft.entity.Ticket;

public class TicketDao implements Dao<Ticket> {

	@Override
	public void salvar(Ticket t) {
		
		EntityManager em = Conexao.getInstance();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void alterar(Ticket t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluir(Ticket t) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Ticket> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
