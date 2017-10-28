package org.gestion.banque.metier.impl;

import java.util.Date;
import java.util.List;

import org.gestion.banque.dao.IOperationDAO;
import org.gestion.banque.entity.Compte;
import org.gestion.banque.entity.Operation;
import org.gestion.banque.entity.Retrait;
import org.gestion.banque.entity.Versement;
import org.gestion.banque.metier.IOperationMetier;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class OperationMetierImpl implements IOperationMetier{

	private IOperationDAO operationDao;
	
	public void setOperationDao(IOperationDAO dao) {
		this.operationDao = dao;
	}

	@Override
	public Operation addOperation(Operation op, String codeCpte, Long codeEmp) {
		// TODO Auto-generated method stub
		return operationDao.addOperation(op, codeCpte, codeEmp);
	}

	@Override
	public void verser(String codeCpte, double mt, Long codeEmp) {
		operationDao.addOperation(new Versement(new Date(),mt), codeCpte, codeEmp);
		Compte cp = operationDao.consulterCompte(codeCpte);
		cp.setSolde(cp.getSolde()+mt);
	}

	@Override
	public void retirer(String codeCpte, double mt, Long codeEmp) {
		operationDao.addOperation(new Retrait(new Date(),mt), codeCpte, codeEmp);
		Compte cp = operationDao.consulterCompte(codeCpte);
		cp.setSolde(cp.getSolde()-mt);
	}

	@Override
	public void virer(String codeCpte1, String codeCpte2, double mt, Long codeEmp) {
		retirer(codeCpte1, mt, codeEmp);
		verser(codeCpte2, mt, codeEmp);
	}

	@Override
	public List<Operation> consulterOperationCompte(String codeCpte) {
		// TODO Auto-generated method stub
		return operationDao.consulterOperationCompte(codeCpte);
	}

	@Override
	public Compte consulterCompte(String codeCpte) {
		// TODO Auto-generated method stub
		return operationDao.consulterCompte(codeCpte);
	}

}
