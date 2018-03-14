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
	public void deveriaGerenciarUmPlano() {
		DeveriaCriarPlano();
		deveriaAlterarPlano();
		deveriaListarPlano();
		deveriaExcluirPlano();	
	}
	
	
    public void DeveriaCriarPlano() {
		
		System.out.println("-- ENTROU NO CRIAR --");
		
		Plano p = new Plano();
		p.setId(null);
		p.setNome("Basico3");
		p.setQtdDom(1);
		
		try {
			//new PlanoService().salvar(p);
			new HospedagemFacade().salvarPlano(p);
			
			System.out.println("");
			System.out.println("Criou: "+p.getNome());
			System.out.println("");
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		id = p.getId();
		assertEquals(true, p.getId() !=  null);
		
	}
	
	
	public void deveriaAlterarPlano() {
		
		System.out.println("-- ENTROU NO ALTERAR --");
		
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
			System.out.println("");
			System.out.println("Nome: "+p.getNome());
			System.out.println("");
		 assertEquals(true,p.getId() != null);
		}
	

	
	public void deveriaListarPlano() {
		
		System.out.println("-- ENTROU NO LISTAR --");
		
		HospedagemFacade s = new HospedagemFacade();
		List<Plano> planos = s.listarPlano();
		
		for(Plano pla : planos) {
			
			System.out.println("Id: "+pla.getId()+" Nome: "+pla.getNome());
			
		}
		System.out.println("");
		
		assertEquals(true, planos.size() > 0);	
			
	}
	
	
	public void deveriaExcluirPlano() {
		
		System.out.println("-- ENTROU NO EXCLUIR --");
		
		HospedagemFacade s = new HospedagemFacade();
		Plano p = s.buscarPlano(66);
		
		try {
			System.out.println("");
			System.out.println("excluiu: "+p.getNome()+" - id: "+p.getId());
			System.out.println("");
			
			new HospedagemFacade().excluirPlano(p);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		//verifica no banco se o id setado la em cima ainda existe, se existir é porque não foi excluido
		assertEquals(true, s.buscarPlano(p.getId()) == null);
		
	}
	
	
	
}
