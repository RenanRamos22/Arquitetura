package br.edu.up.SistemaHospedagemArqSoft.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import br.edu.up.SistemaHospedagemArqSoft.entity.Plano;
import br.edu.up.SistemaHospedagemArqSoft.service.PlanoService;
import br.edu.up.SistemaHospedagemArqSoft.service.ServiceException;

public class TestePlanoHosp {

	@Test
	public void DeveriaCriarPlano() {
		
		Plano p = new Plano();
		p.setId(null);
		p.setNome("Renan");
		p.setQtdDom(1);
		
		try {
			new PlanoService().salvar(p);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(true, p.getId() !=  null);
		
	}
	
}
