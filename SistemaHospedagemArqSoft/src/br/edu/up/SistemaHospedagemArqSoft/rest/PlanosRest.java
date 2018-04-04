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

import br.edu.up.SistemaHospedagemArqSoft.entity.Plano;
import br.edu.up.SistemaHospedagemArqSoft.facade.HospedagemFacade;
import br.edu.up.SistemaHospedagemArqSoft.service.ServiceException;

@Path("/planoController")
public class PlanosRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Plano> listar(){
		return new HospedagemFacade().listarPlano();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void salvar (Plano plano) {
		try {
			if(plano.getId() == null) {
			new HospedagemFacade().salvarPlano(plano);
			} else {
				new HospedagemFacade().alterarPlano(plano);
			}
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void alterar (Plano plano) {
		try {
			new HospedagemFacade().alterarPlano(plano);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void remover (Plano plano) {
		try {
			new HospedagemFacade().excluirPlano(plano);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	@Path("/excluir")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void excluir (Plano plano) {
		try {
			new HospedagemFacade().excluirPlano(plano);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
}
