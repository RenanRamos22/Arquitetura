package br.edu.up.sistemadevendas.service;

import br.edu.up.sistemadevendas.dao.ClienteDao;
import br.edu.up.sistemadevendas.dao.Dao;
import br.edu.up.sistemadevendas.entity.Cliente;

public class ClienteService {

	public void salvar(Cliente cliente) {
		
		
		
		Dao<Cliente> clienteDao = new ClienteDao();
				clienteDao.salvar(cliente);
		
	}
}
