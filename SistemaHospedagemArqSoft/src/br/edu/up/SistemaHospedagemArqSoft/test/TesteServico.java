package br.edu.up.SistemaHospedagemArqSoft.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import br.edu.up.SistemaHospedagemArqSoft.entity.Cliente;
import br.edu.up.SistemaHospedagemArqSoft.entity.Servico;
import br.edu.up.SistemaHospedagemArqSoft.facade.HospedagemFacade;
import br.edu.up.SistemaHospedagemArqSoft.service.ServiceException;
import br.edu.up.SistemaHospedagemArqSoft.service.ServicoService;

public class TesteServico {
	
	static Integer id;
	
	@Test
	public void DeveriaCriarServico() {
		

		Servico t = new Servico();
		t.setId(null);
	    
		t.setNome("Dominio adicional2");
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
}
