package org.gestion.banque.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.gestion.banque.dao.IEmployeDAO;
import org.gestion.banque.entity.Employe;

public class EmployeDaoImpl implements IEmployeDAO{

	@PersistenceContext
	private EntityManager em; 
	
	@Override
	public Employe addEmploye(Employe e, Long codeSup) {
		if(codeSup != null){
			Employe sup = em.find(Employe.class, codeSup);
			e.setEmployeSup(sup);
		}
		em.persist(e);
		return e;
	}

	@Override
	public List<Employe> getEmployes() {
		Query query = em.createQuery("select e from Employe e");
		return query.getResultList();
	}

	@Override
	public List<Employe> getEmployesByGroupe(Long codeGr) {
		Query query = em.createQuery("select e from Employe e where e.groupes.codeGr=:x");
		query.setParameter("x", codeGr);
		return query.getResultList();
	}

}
