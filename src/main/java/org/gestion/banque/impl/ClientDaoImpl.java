package org.gestion.banque.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.gestion.banque.dao.IClientDAO;
import org.gestion.banque.entity.Client;

public class ClientDaoImpl implements IClientDAO{
	@PersistenceContext
	private EntityManager em; 
	
	@Override
	public Client addClient(Client c) {
		em.persist(c);
		return c;
	}

	@Override
	public Client consulterClient(Long codeCli) {
		Client cli = em.find(Client.class, codeCli);
		if(cli == null) throw new RuntimeException("Client inexistant");
		return cli;
	}

	@Override
	public List<Client> consulterClients(String mc) {
		Query query = em.createQuery("select c from Client c where c.nomClient like :x");
		query.setParameter("x", "%"+mc+"%");
		return query.getResultList();
	}

}
