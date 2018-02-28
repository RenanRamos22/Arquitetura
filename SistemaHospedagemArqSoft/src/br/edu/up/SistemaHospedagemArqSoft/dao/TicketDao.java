package br.edu.up.SistemaHospedagemArqSoft.dao;

import java.util.List;

import br.edu.up.SistemaHospedagemArqSoft.entity.Ticket;

public class TicketDao implements Dao<Ticket> {

	@Override
	public void salvar(Ticket t) {
		// TODO Auto-generated method stub
		t.setId(1);
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
