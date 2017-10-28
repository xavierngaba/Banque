package org.gestion.banque.metier.impl;

import java.util.List;

import org.gestion.banque.dao.IClientDAO;
import org.gestion.banque.entity.Client;
import org.gestion.banque.metier.IClientMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class ClientMetierImpl implements IClientMetier{

	private IClientDAO clientDao;
	
	public void setClientDao(IClientDAO dao) {
		this.clientDao = dao;
	}

	@Override
	public Client addClient(Client c) {
		clientDao.addClient(c);
		return c;
	}

	@Override
	public Client consulterClient(Long codeCli) {
		Client cli = clientDao.consulterClient(codeCli);
		return cli;
	}

	@Override
	public List<Client> consulterClients(String mc) {
		return clientDao.consulterClients(mc);
	}

}
