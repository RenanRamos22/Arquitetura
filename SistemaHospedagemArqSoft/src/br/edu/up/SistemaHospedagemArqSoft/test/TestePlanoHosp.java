package br.edu.up.SistemaHospedagemArqSoft.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;


import br.edu.up.SistemaHospedagemArqSoft.entity.Plano;
import br.edu.up.SistemaHospedagemArqSoft.facade.HospedagemFacade;
import br.edu.up.SistemaHospedagemArqSoft.service.ServiceException;
 

public class TestePlanoHosp {

	static Integer id;
	

	@Test
	public void DeveriaCriarPlano() {
		
		System.out.println("-- ENTROU NO CRIAR --");
		
		Plano p = new Plano();
		p.setId(null);
		p.setNome("Basico3");
		p.setQtdDom(1);
		
		try {
			//new PlanoService().salvar(p);
			new HospedagemFacade().salvarPlano(p);
			System.out.println(p.getNome());
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		id = p.getId();
		assertEquals(true, p.getId() !=  null);
		
	}
	
	@Test
	public void deveriaAlterarPlano() {
		
		System.out.println("-- ETROU NO ALTERAR --");
		
		HospedagemFacade s = new HospedagemFacade();
		Plano p = s.buscarPlano(id);
		p.setNome("mais um");
		p.setQtdDom(3);		
		try {
			//new ClienteService().salvar(c);
			new HospedagemFacade().alterarPlano(p);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			id = p.getId();
			System.out.println(p.getNome());
		 assertEquals(true,p.getId() != null);
		}
	

	@Test
	public void deveriaListarPlano() {
		
		System.out.println("-- ENTROU NO LISTAR --");
		
		HospedagemFacade s = new HospedagemFacade();
		List<Plano> planos = s.listarPlano();
		
		for(Plano pla : planos) {
			System.out.println(pla.getNome());
		}
		assertEquals(true, planos.size() > 0);	
			
	}
	
	@Test
	public void deveriaExcluirPlano() {
		
		System.out.println("-- ENTROU NO EXCLUIR --");
		
		HospedagemFacade s = new HospedagemFacade();
		Plano p = s.buscarPlano(16);
		
		try {
			System.out.println("excluiu: "+p.getNome()+" - id: "+p.getId());
			
			new HospedagemFacade().excluirPlano(p);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		//verifica no banco se o id setado la em cima ainda existe, se existir é porque não foi excluido
		assertEquals(true, s.buscarPlano(p.getId()) == null);
	}
	
	
	
}
