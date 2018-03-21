package br.edu.up.SistemaHospedagemArqSoft.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.up.SistemaHospedagemArqSoft.entity.Cliente;
import br.edu.up.SistemaHospedagemArqSoft.facade.HospedagemFacade;
import br.edu.up.SistemaHospedagemArqSoft.service.ServiceException;

@Path("/clienteController")
public class ClienteRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cliente> listar(){
		return new HospedagemFacade().listar();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void salvar (Cliente cliente) {
		try {
			new HospedagemFacade().salvarCliente(cliente);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void alterar (Cliente cliente) {
		try {
			new HospedagemFacade().alterarCliente(cliente);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void remove (Cliente cliente) {
		try {
			new HospedagemFacade().excluirCliente(cliente);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
}
