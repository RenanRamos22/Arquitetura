package br.edu.up.SistemaHospedagemArqSoft.service;

import java.util.List;

import br.edu.up.SistemaHospedagemArqSoft.dao.Dao;
import br.edu.up.SistemaHospedagemArqSoft.dao.PlanoDao;
import br.edu.up.SistemaHospedagemArqSoft.entity.Plano;

public class PlanoService {

	static Dao<Plano> planoDao = new PlanoDao();
	
	public void salvar(Plano plano) throws ServiceException {
		
		if (plano.getNome() == null) {
			throw new ServiceException("O nome do plano não pode ficar em branco");
		}
		
		planoDao.salvar(plano);
	}

	public Plano buscar(Integer id) {
		// TODO Auto-generated method stub
		return planoDao.buscar(id);
	}

	public void alterar(Plano p) throws ServiceException {
		
		planoDao.alterar(p);	
	}

	public List<Plano> listar() {
		// TODO Auto-generated method stub
		return planoDao.listar();
	}

	public void excluir(Plano p) throws ServiceException{
		planoDao.excluir(p);
		
	}
}
