package br.edu.up.SistemaHospedagemArqSoft.dao;

import java.util.List;

import br.edu.up.SistemaHospedagemArqSoft.entity.Plano;

public class PlanoDao implements Dao<Plano> {

	@Override
	public void salvar(Plano t) {
		// TODO Auto-generated method stub
		t.setId(1);
	}

	@Override
	public void alterar(Plano t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluir(Plano t) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Plano> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
