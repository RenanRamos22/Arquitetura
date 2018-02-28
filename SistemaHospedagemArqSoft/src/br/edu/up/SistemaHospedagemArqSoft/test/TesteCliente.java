package br.edu.up.SistemaHospedagemArqSoft.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.up.SistemaHospedagemArqSoft.entity.Cliente;
import br.edu.up.SistemaHospedagemArqSoft.service.ClienteService;

/*ATIVIDADE
 * 
 * DESENVOLVER 3 TDD'S - TRATAR 1 RN(REGRA DE NEGOCIO) EM CADA
 * 
 */

public class TesteCliente {

	@Test
	public void deveriaCriarCliente() {
	Cliente c = new Cliente();
	c.setId(null);
	c.setNome("Renan");
	c.setDominio("teste.com.br");
	
	new ClienteService().salvar(c);
	
	 assertEquals(true,c.getId() != null);
	}
}
