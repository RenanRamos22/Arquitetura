package br.edu.up.SistemaHospedagemArqSoft.service;

import br.edu.up.SistemaHospedagemArqSoft.dao.ClienteDao;
import br.edu.up.SistemaHospedagemArqSoft.dao.Dao;
import br.edu.up.SistemaHospedagemArqSoft.entity.Cliente;

public class ClienteService {
	

	public void salvar(Cliente cliente) {
	Dao<Cliente> clienteDao = new ClienteDao();
	clienteDao.salvar(cliente);
	}
}
