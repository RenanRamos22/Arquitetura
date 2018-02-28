package br.edu.up.SistemaHospedagemArqSoft.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import br.edu.up.SistemaHospedagemArqSoft.entity.Plano;
import br.edu.up.SistemaHospedagemArqSoft.service.PlanoService;

public class TestePlanoHosp {

	@Test
	public void DeveriaCriarPlano() {
		
		Plano p = new Plano();
		p.setId(null);
		p.setNome("Simples");
		
		new PlanoService().salvar(p);
		
		assertEquals(true, p.getId() !=  null);
		
	}
	
}
