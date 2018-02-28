package br.edu.up.SistemaHospedagemArqSoft.service;

import br.edu.up.SistemaHospedagemArqSoft.dao.ClienteDao;
import br.edu.up.SistemaHospedagemArqSoft.dao.Dao;
import br.edu.up.SistemaHospedagemArqSoft.entity.Cliente;

public class ClienteService {
	

	public void salvar(Cliente cliente) throws ServiceException  {
		
		if (cliente.getNome() == null) {
			throw new ServiceException("O Nome deve ser preenchido");
		}
		
	Dao<Cliente> clienteDao = new ClienteDao();
	clienteDao.salvar(cliente);
	}
}
