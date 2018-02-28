package br.edu.up.SistemaHospedagemArqSoft.service;

import br.edu.up.SistemaHospedagemArqSoft.dao.Dao;
import br.edu.up.SistemaHospedagemArqSoft.dao.TicketDao;
import br.edu.up.SistemaHospedagemArqSoft.entity.Ticket;

public class TicketService {

	public void abrir(Ticket ticket) throws ServiceException {
		
		if(ticket.getAssunto() == null) {
			throw new ServiceException("Digite um Assunto");
		}
		
		Dao<Ticket> ticketDao = new TicketDao();
		ticketDao.salvar(ticket);
	}
}
