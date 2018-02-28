package br.edu.up.SistemaHospedagemArqSoft.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import br.edu.up.SistemaHospedagemArqSoft.entity.Cliente;
import br.edu.up.SistemaHospedagemArqSoft.entity.Ticket;
import br.edu.up.SistemaHospedagemArqSoft.service.ServiceException;
import br.edu.up.SistemaHospedagemArqSoft.service.TicketService;

public class TesteSuporte {
	
	@Test
	public void DeveriaCriarTicket() {
		
		Cliente c =new Cliente();
		c.setDominio("teste.com.br");
		c.setNome("Tadeu");
		c.setId(666);
		Ticket t = new Ticket();
		t.setId(null);
		t.setCliente(c);
		t.setAssunto("dados de Acesso");
		t.setSetor("Tecnico");
		
		
		try {
			new TicketService().abrir(t);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(true, t.getId() != null);
	}
}
