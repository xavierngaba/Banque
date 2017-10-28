package org.gestion.banque.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.gestion.banque.dao.IGroupeDAO;
import org.gestion.banque.entity.Employe;
import org.gestion.banque.entity.Groupe;

public class GroupeDaoImpl implements IGroupeDAO{

	@PersistenceContext
	private EntityManager em; 
	
	@Override
	public Groupe addGroupe(Groupe g) {
		em.persist(g);
		return g;
	}

	@Override
	public void addEmployeToGroup(Long codeEmp, Long codeGr) {
		Employe e = em.find(Employe.class, codeEmp);
		Groupe g = em.find(Groupe.class, codeGr);
		e.getGroupe().add(g);
		g.getEmployes().add(e);
	}

	@Override
	public List<Groupe> getGroupes() {
		Query query = em.createQuery("select g from Groupe g");
		return query.getResultList();
	}

}
