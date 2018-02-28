package br.edu.up.SistemaHospedagemArqSoft.service;

import br.edu.up.SistemaHospedagemArqSoft.dao.Dao;
import br.edu.up.SistemaHospedagemArqSoft.dao.PlanoDao;
import br.edu.up.SistemaHospedagemArqSoft.entity.Plano;

public class PlanoService {

	public void salvar(Plano plano) throws ServiceException {
		
		if (plano.getNome() == null) {
			throw new ServiceException("O nome do plano não pode ficar em branco");
		}
		Dao<Plano> planoDao = new PlanoDao();
		planoDao.salvar(plano);
	}
}
