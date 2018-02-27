package br.edu.up.sistemadevendas.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.up.sistemadevendas.dao.ClienteDao;
import br.edu.up.sistemadevendas.entity.Cliente;
import br.edu.up.sistemadevendas.service.ClienteService;

public class TesteCliente {

	@Test
	public void deveriaCadastratUmCliente() {
		
		Cliente c = new Cliente();
		c.setId(null);
		c.setNome("Renan");
		
		new ClienteService().salvar(c);
		
		assertEquals(true,c.getId() != null);
		
	}
}
