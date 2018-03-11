package br.edu.up.SistemaHospedagemArqSoft.test;

import static org.junit.Assert.assertEquals;

import java.util.List;
import org.junit.Test;
import br.edu.up.SistemaHospedagemArqSoft.entity.Cliente;
import br.edu.up.SistemaHospedagemArqSoft.facade.HospedagemFacade;
import br.edu.up.SistemaHospedagemArqSoft.service.ServiceException;

/*ATIVIDADE
 * 
 * DESENVOLVER 3 TDD'S - TRATAR 1 RN(REGRA DE NEGOCIO) EM CADA
 * 
 */

public class TesteCliente {

	static Integer id;
	
	
	@Test
	public void deveriaCriarCliente() {
		
	Cliente c = new Cliente();
	c.setId(null);
	c.setNome("Deu boa filhaaaaaaao");
	c.setDominio("teste.com.br");
	
	try {
		//new ClienteService().salvar(c);
		new HospedagemFacade().salvarCliente(c);
	} catch (ServiceException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		id = c.getId();
	 assertEquals(true,c.getId() != null);
	}
	
	@Test
	public void deveriaAlterarCliente() {
		HospedagemFacade s = new HospedagemFacade();
		Cliente c = s.buscarCliente(id);
		c.setNome("alterou nome");
		c.setDominio("teste.com.br");
		
		try {
			//new ClienteService().salvar(c);
			new HospedagemFacade().alterarCliente(c);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			id = c.getId();
			System.out.println(c.getNome());
		 assertEquals(true,c.getId() != null);
		}
	

	@Test
	public void deveriaListarClientes() {
		
		HospedagemFacade s = new HospedagemFacade();
		List<Cliente> clientes = s.listar();
		
		for(Cliente cli: clientes) {
			System.out.println(cli.getNome());
		}
		
		assertEquals(true, clientes.size() > 0);	
			
	}
}
