package br.edu.up.sistemadevendas.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


import br.edu.up.sistemadevendas.entity.Cliente;
import br.edu.up.sistemadevendas.facade.VendasFacade;
import br.edu.up.sistemadevendas.service.ClienteService;
import br.edu.up.sistemadevendas.service.ServiceException;

public class TesteCliente {

	@Test
	public void deveriaCadastrarUmCliente() {
		
		Cliente c = new Cliente();
		c.setId(null);
		c.setNome("Teste2");
		c.setIdade(30);
		
		try {
		//	new ClienteService().salvar(c);
			new VendasFacade().salvarCliente(c);	
			
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		
		assertEquals(true, c.getId() != null);
		
		c = new Cliente();
		c.setId(null);
		c.setNome("Cleverson");
		c.setIdade(17);
		
		try {
			//new ClienteService().salvar(c);
			new VendasFacade().salvarCliente(c);
			
		} catch (ServiceException e) {
			//e.printStackTrace();
		}
		
		
		assertEquals(false, c.getId() != null);
			
	}
	
}

