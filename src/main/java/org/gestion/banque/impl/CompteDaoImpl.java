package org.gestion.banque.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.gestion.banque.dao.ICompteDAO;
import org.gestion.banque.entity.Client;
import org.gestion.banque.entity.Compte;
import org.gestion.banque.entity.Employe;

public class CompteDaoImpl implements ICompteDAO{

	@PersistenceContext
	private EntityManager em; 
	
	@Override
	public Compte addCompte(Compte cp, Long codeCli, Long codeEmp) {
		Client cli = em.find(Client.class, codeCli);
		Employe emp = em.find(Employe.class, codeEmp);
		cp.setClient(cli);
		cp.setEmploye(emp);
		em.persist(cp);
		return cp;
	}

	@Override
	public List<Compte> getCompteByClient(Long codeCli) {
		Query query = em.createQuery("select c from Compte c where c.client.codeClient=:x");
		query.setParameter("x",codeCli);
		return query.getResultList();
	}

	@Override
	public List<Compte> getCompteByEmploye(Long codeEmp) {
		Query query = em.createQuery("select c from Compte c where c.employe.codeEmp=:x");
		query.setParameter("x",codeEmp);
		return query.getResultList();
	}

}
