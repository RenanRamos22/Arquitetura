package br.edu.up.sistemadevendas.facade;

import br.edu.up.sistemadevendas.entity.Cliente;
import br.edu.up.sistemadevendas.service.ClienteService;
import br.edu.up.sistemadevendas.service.ServiceException;

public class VendasFacade {

private ClienteService cService;
	
	public VendasFacade() {
		this.cService = new ClienteService();
	}
	
	public void salvarCliente(Cliente c) throws ServiceException { 
		
		cService.salvar(c);
	}
}