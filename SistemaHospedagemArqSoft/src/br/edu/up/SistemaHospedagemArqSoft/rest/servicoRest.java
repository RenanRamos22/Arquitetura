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

import br.edu.up.SistemaHospedagemArqSoft.entity.Servico;
import br.edu.up.SistemaHospedagemArqSoft.facade.HospedagemFacade;
import br.edu.up.SistemaHospedagemArqSoft.service.ServiceException;

@Path("/servicoController")
public class servicoRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Servico> listar(){
		return new HospedagemFacade().listarServico();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void salvar (Servico servico) {
		try {
			new HospedagemFacade().salvarServico(servico);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void alterar (Servico servico) {
		try {
			new HospedagemFacade().alterarServico(servico);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void remover(Servico servico) {
		try {
			new HospedagemFacade().excluirServico(servico);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
}
