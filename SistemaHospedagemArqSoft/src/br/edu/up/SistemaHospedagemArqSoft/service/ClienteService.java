package br.edu.up.SistemaHospedagemArqSoft.service;

import java.util.List;

import br.edu.up.SistemaHospedagemArqSoft.dao.ClienteDao;
import br.edu.up.SistemaHospedagemArqSoft.dao.Dao;
import br.edu.up.SistemaHospedagemArqSoft.entity.Cliente;


public class ClienteService {
	
	static Dao<Cliente> clienteDao = new ClienteDao();

	public void salvar(Cliente cliente) throws ServiceException  {
		
		if (cliente.getNome() == null) {
			throw new ServiceException("O Nome deve ser preenchido");
		}
		
	
	clienteDao.salvar(cliente);
	}
	
	public Cliente buscar(Integer i) {
		
		return clienteDao.buscar(i);
	}

	public void alterar(Cliente cliente)  throws ServiceException {
		
		clienteDao.alterar(cliente);		
	}

	public List<Cliente> listar() {
		
		return clienteDao.listar();
	}

	public void excluir(Cliente c) throws ServiceException{
		clienteDao.excluir(c);
		
	}
}
