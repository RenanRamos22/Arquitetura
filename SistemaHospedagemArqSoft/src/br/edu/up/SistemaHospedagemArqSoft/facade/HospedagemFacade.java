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
	
	public HospedagemFacade() {
		this.cliService = new ClienteService();
		this.planService = new PlanoService();
		this.servService = new ServicoService();
	}
	
	public void salvarCliente(Cliente c) throws ServiceException{
		cliService.salvar(c);
	}

	public void salvarPlano(Plano p) throws ServiceException {
		// TODO Auto-generated method stub
		planService.salvar(p);
	}

	public void salvarServico(Servico t) throws ServiceException{
		// TODO Auto-generated method stub
		servService.criar(t);
	}

	public Cliente buscarCliente(Integer id) {
		return cliService.buscar(id);
	}

	public void alterarCliente(Cliente c) throws ServiceException{
		cliService.alterar(c);
		
	}

	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return cliService.listar();
	}

	public Plano buscarPlano(Integer id) {
		// TODO Auto-generated method stub
		return planService.buscar(id);
	}

	public void alterarPlano(Plano p) throws ServiceException{
		planService.alterar(p); 
		
		
	}

	public List<Plano> listarPlano() {
		// TODO Auto-generated method stub
		return planService.listar();
	}

	public Servico buscarServico(Integer id) {
		// TODO Auto-generated method stub
		return servService.buscar(id);
	}

	public void alterarServico(Servico serv) throws ServiceException{
		servService.alterar(serv); 
		// TODO Auto-generated method stub
		
	}
	public List<Servico> listarServico() {
		// TODO Auto-generated method stub
		return servService.listar();
	}

	public void excluirCliente(Cliente c) throws ServiceException{
		cliService.excluir(c);
	}

	public void excluirServico(Servico serv) throws ServiceException{
		servService.excluir(serv);
		
	}
}
