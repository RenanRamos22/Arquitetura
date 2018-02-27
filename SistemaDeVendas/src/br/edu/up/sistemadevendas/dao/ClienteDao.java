package br.edu.up.sistemadevendas.dao;

import java.util.List;

import br.edu.up.sistemadevendas.entity.Cliente;

public class ClienteDao implements Dao<Cliente> {

	@Override
	public void salvar(Cliente c) {
		c.setId(1);
		
	}

	@Override
	public void alterar(Cliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Cliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
