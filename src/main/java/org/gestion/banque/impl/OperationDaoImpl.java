package org.gestion.banque.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.gestion.banque.dao.IOperationDAO;
import org.gestion.banque.entity.Compte;
import org.gestion.banque.entity.Employe;
import org.gestion.banque.entity.Operation;

public class OperationDaoImpl implements IOperationDAO{

	@PersistenceContext
	private EntityManager em; 
	
	@Override
	public Operation addOperation(Operation op, String codeCpte, Long codeEmp) {
		Compte cp = consulterCompte(codeCpte);
		Employe emp = em.find(Employe.class, codeEmp);
		op.setCompte(cp);
		op.setEmploye(emp);
		em.persist(op);
		return op;
	}

	@Override
	public void versement(String codeCpte, double mt, Long codeEmp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retrait(String codeCpte, double mt, Long codeEmp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void virement(String codeCpte1, String codeCpte2, double mt, Long codeEmp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Operation> consulterOperationCompte(String codeCpte) {
		Query query = em.createQuery("select o from Operation o where o.compte.codeCompte =:x");
		query.setParameter("x", codeCpte);
		return query.getResultList();
	}
	
	@Override
	public Compte consulterCompte(String codeCpte) {
		Compte cp = em.find(Compte.class, codeCpte);
		if(cp == null ) throw new RuntimeException("Compte inexistant");
		return cp;
	}

}
