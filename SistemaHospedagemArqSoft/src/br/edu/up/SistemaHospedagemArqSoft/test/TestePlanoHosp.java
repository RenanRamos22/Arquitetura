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
		
		HospedagemFacade s = new HospedagemFacade();
		List<Plano> planos = s.listarPlano();
		
//		for(int i = 0; i <= planos.size();i++) {
//			
//			System.out.println(planos. .getNome());
//		}
		
		for(Plano pla : planos) {
			System.out.println(pla.getNome());
		}
		assertEquals(true, planos.size() > 0);	
			
	}
	
}
