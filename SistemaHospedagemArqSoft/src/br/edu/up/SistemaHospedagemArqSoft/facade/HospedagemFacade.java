package br.edu.up.SistemaHospedagemArqSoft.facade;

import java.util.List;

import br.edu.up.SistemaHospedagemArqSoft.entity.Cliente;
import br.edu.up.SistemaHospedagemArqSoft.entity.Plano;
import br.edu.up.SistemaHospedagemArqSoft.entity.Servico;
import br.edu.up.SistemaHospedagemArqSoft.service.ClienteService;
import br.edu.up.SistemaHospedagemArqSoft.service.PlanoService;
import br.edu.up.SistemaHospedagemArqSoft.service.ServiceException;
import br.edu.up.SistemaHospedagemArqSoft.service.ServicoService;

public class HospedagemFacade {

	private ClienteService cliService;
	private PlanoService planService;
	private ServicoService servService;
	
	//construtor
	public HospedagemFacade() {
		this.cliService = new ClienteService();
		this.planService = new PlanoService();
		this.servService = new ServicoService();
	}
	//**** TDD CLIENTE
	
	public void salvarCliente(Cliente c) throws ServiceException{
		cliService.salvar(c);
	}
	
	public void alterarCliente(Cliente c) throws ServiceException{
		cliService.alterar(c);
		
	}
	
	public List<Cliente> listar() {
		return cliService.listar();
	}
	
	public Cliente buscarCliente(Integer id) {
		return cliService.buscar(id);
	}
	
	public void excluirCliente(Cliente c) throws ServiceException{
		cliService.excluir(c);
	}
	
	//***** TDD PLANO
	
	public void salvarPlano(Plano p) throws ServiceException {
		planService.salvar(p);
	}
	
	public void alterarPlano(Plano p) throws ServiceException{
		planService.alterar(p); 
	}
	
	public List<Plano> listarPlano() {
		return planService.listar();
	}
	
	public Plano buscarPlano(Integer id) {
		return planService.buscar(id);
	}
	
	public void excluirPlano(Plano p) throws ServiceException{
		planService.excluir(p);
		
	}
	
	//*** TDD SERVICO
	public void salvarServico(Servico t) throws ServiceException{
		servService.criar(t);
	}
	
	public void alterarServico(Servico serv) throws ServiceException{
		servService.alterar(serv); 
	}
	
	public List<Servico> listarServico() {
		return servService.listar();
	}
	
	public Servico buscarServico(Integer id) {
		return servService.buscar(id);
	}

	public void excluirServico(Servico serv) throws ServiceException{
		servService.excluir(serv);
	}

	
}
