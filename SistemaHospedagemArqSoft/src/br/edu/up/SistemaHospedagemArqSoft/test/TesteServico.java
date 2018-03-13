package br.edu.up.SistemaHospedagemArqSoft.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;


import br.edu.up.SistemaHospedagemArqSoft.entity.Servico;
import br.edu.up.SistemaHospedagemArqSoft.facade.HospedagemFacade;
import br.edu.up.SistemaHospedagemArqSoft.service.ServiceException;


public class TesteServico {
	
	static Integer id;
	
	@Test
	public void DeveriaCriarServico() {
		
		System.out.println("---ENTROU NO CRIAR---");

		Servico t = new Servico();
		t.setId(null);
	    
		t.setNome("SSL 2");
	    t.setValor(15.00);
		t.setDescricao("mais um dominio");
		
		try {
			//new ServicoService().criar(t);
			new HospedagemFacade().salvarServico(t);
			System.out.println(t.getNome());
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		id = t.getId();
		assertEquals(true, t.getId() != null);
	}
	
	@Test
	public void deveriaAlterarServico() {
		
		System.out.println("---ENTROU NO ALTERAR---");
		
		HospedagemFacade s = new HospedagemFacade();
		Servico serv = s.buscarServico(id);
		serv.setNome("registro de dominio");
		serv.setValor(20.00);
		serv.setDescricao("outra descricao");
		
		try {
			//new ClienteService().salvar(c);
			new HospedagemFacade().alterarServico(serv);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			id = serv.getId();
			System.out.println("servico com id: "+serv.getId()+" alterou o nome para: "+serv.getNome());
		 assertEquals(true,serv.getId() != null);
		}
	
	@Test
	public void deveriaListarServico() {
		
		System.out.println("---ENTROU NO lISTAR---");
		
		HospedagemFacade s = new HospedagemFacade();
		List<Servico> servicos = s.listarServico();
		
		System.out.println("Listando Servicos:");
		
		for(Servico ser: servicos) {
			System.out.println("Id: "+ser.getId()+" - Nome: "+ser.getNome());
		}
		
		assertEquals(true, servicos.size() > 0);	
			
	}
	
	@Test
	public void deveriaExcluirCliente() {
		
		System.out.println("---ENTROU NO EXCLUIR:---");
		
		
		HospedagemFacade s = new HospedagemFacade();
		
		Servico serv = s.buscarServico(1);
		
		try {
			System.out.println("excluiu: Id: "+serv.getId()+" - Nome: "+serv.getNome());
		new HospedagemFacade().excluirServico(serv);
		}catch (ServiceException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		id = serv.getId();
		assertEquals(true, s.buscarServico(serv.getId()) == null);
	}
}
