package br.edu.up.SistemaHospedagemArqSoft.service;

import br.edu.up.SistemaHospedagemArqSoft.dao.Dao;
import br.edu.up.SistemaHospedagemArqSoft.dao.ServicoDao;
import br.edu.up.SistemaHospedagemArqSoft.entity.Servico;

public class ServicoService {

	public void criar(Servico servico) throws ServiceException {
		
		if(servico.getNome() == null) {
			throw new ServiceException("Digite um nome para o serviço");
		}
		
		Dao<Servico> ticketDao = new ServicoDao();
		ticketDao.salvar(servico);
	}
}
