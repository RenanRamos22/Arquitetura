package br.edu.up.SistemaHospedagemArqSoft.dao;

import br.edu.up.SistemaHospedagemArqSoft.entity.Cliente;
import br.edu.up.SistemaHospedagemArqSoft.entity.Plano;
import br.edu.up.SistemaHospedagemArqSoft.entity.Servico;

public class FactoryDao {

	//Construtores factory method
	public static Dao<Cliente> createClienteDao(){
		return new ClienteDao();
	}
	
	public static Dao<Plano> createPlanoDao(){
		return new PlanoDao();
	}
	public static Dao<Servico> createServicoDao(){
		return new ServicoDao();
	}
}
