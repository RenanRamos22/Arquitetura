package br.edu.up.SistemaHospedagemArqSoft.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

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
	public void deveriaGerenciarCliente() {
		deveriaCriarCliente();
		deveriaAlterarCliente();
		deveriaListarClientes();
		deveriaExcluirCliente();
	}
	
	
	
	
	public void deveriaCriarCliente() {
		
		System.out.println("---ENTROU NO CRIAR---");
		
	Cliente c = new Cliente();
	c.setId(null);
	c.setNome("Renan");
	c.setDominio("teste.com.br");
	
	try {
		//new ClienteService().salvar(c);
		
		new HospedagemFacade().salvarCliente(c);
		System.out.println("Criou: "+c.getNome()+" - Id:"+c.getId());
		System.out.println("");
	} catch (ServiceException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		id = c.getId();
	 assertEquals(true,c.getId() != null);
	 
	}
	
	
	public void deveriaAlterarCliente() {
		
		System.out.println("---ENTROU NO ALTERAR---");
		
		HospedagemFacade s = new HospedagemFacade();
		Cliente c = s.buscarCliente(id);
		c.setNome("outro");
		c.setDominio("teste.com.br");
		
		try {
			//new ClienteService().salvar(c);
			new HospedagemFacade().alterarCliente(c);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("");
			System.out.println("cliente com id: "+c.getId()+" alterou o nome para: "+c.getNome());
		 assertEquals(true,c.getId() != null);
		 
		}
	

	
	public void deveriaListarClientes() {
		
		System.out.println("---ENTROU NO lISTAR---");
		
		HospedagemFacade s = new HospedagemFacade();
		List<Cliente> clientes = s.listar();
		
		System.out.println("");
		System.out.println("Listando clientes:");
		for(Cliente cli: clientes) {
			System.out.println("Id: "+cli.getId()+" - Nome: "+cli.getNome());
		}
		System.out.println("");
		
		assertEquals(true, clientes.size() > 0);	
			
	}
	
	
	public void deveriaExcluirCliente() {
		
		System.out.println("---ENTROU NO EXCLUIR:---");
		
		HospedagemFacade s = new HospedagemFacade();
		Cliente c = s.buscarCliente(id);
		
	
		try {
			System.out.println("excluiu: "+c.getNome()+" - id: "+c.getId());
			System.out.println("");
			
		new HospedagemFacade().excluirCliente(c);
		}catch (ServiceException e) {
			
			e.printStackTrace();
		}
		
		assertEquals(true, s.buscarCliente(id) == null);
		
	}
}
