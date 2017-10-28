package org.gestion.banque.metier.impl;

import java.util.List;

import org.gestion.banque.dao.IClientDAO;
import org.gestion.banque.entity.Client;
import org.gestion.banque.metier.IClientMetier;

public class ClientMetierImpl implements IClientMetier{

	private IClientDAO dao;
	
	public void setDao(IClientDAO dao) {
		this.dao = dao;
	}

	@Override
	public Client addClient(Client c) {
		dao.addClient(c);
		return c;
	}

	@Override
	public Client consulterClient(Long codeCli) {
		Client cli = dao.consulterClient(codeCli);
		return cli;
	}

	@Override
	public List<Client> consulterClients(String mc) {
		return dao.consulterClients(mc);
	}

}
