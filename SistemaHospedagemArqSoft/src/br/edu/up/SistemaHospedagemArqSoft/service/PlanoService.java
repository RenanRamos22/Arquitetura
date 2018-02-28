package br.edu.up.SistemaHospedagemArqSoft.service;

import br.edu.up.SistemaHospedagemArqSoft.dao.Dao;
import br.edu.up.SistemaHospedagemArqSoft.dao.PlanoDao;
import br.edu.up.SistemaHospedagemArqSoft.entity.Plano;

public class PlanoService {

	public void salvar(Plano plano) {
		
		Dao<Plano> planoDao = new PlanoDao();
		planoDao.salvar(plano);
	}
}
