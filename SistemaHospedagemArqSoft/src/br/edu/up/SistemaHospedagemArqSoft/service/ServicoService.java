package br.edu.up.SistemaHospedagemArqSoft.service;

import java.util.List;

import br.edu.up.SistemaHospedagemArqSoft.dao.Dao;
import br.edu.up.SistemaHospedagemArqSoft.dao.ServicoDao;
import br.edu.up.SistemaHospedagemArqSoft.entity.Servico;

public class ServicoService {

	static Dao<Servico> servicoDao = new ServicoDao();
	
	public void criar(Servico servico) throws ServiceException {
		
		if(servico.getNome() == null) {
			throw new ServiceException("Digite um nome para o servi�o");
		}
		
		
		servicoDao.salvar(servico);
	}

	public Servico buscar(Integer id) {
		// TODO Auto-generated method stub
		return servicoDao.buscar(id);
	}

	public void alterar(Servico serv) throws ServiceException{
		// TODO Auto-generated method stub
		servicoDao.alterar(serv);
	}

	public List<Servico> listar() {
		// TODO Auto-generated method stub
		return servicoDao.listar();
	}

	public void excluir(Servico serv) throws ServiceException{
		servicoDao.excluir(serv);
		
	}
}
