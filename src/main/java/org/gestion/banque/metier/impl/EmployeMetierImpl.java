package org.gestion.banque.metier.impl;

import java.util.List;

import org.gestion.banque.dao.IEmployeDAO;
import org.gestion.banque.entity.Employe;
import org.gestion.banque.metier.IEmployeMetier;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class EmployeMetierImpl implements IEmployeMetier{

	private IEmployeDAO employeDao;
	
	public void setEmployeDao(IEmployeDAO dao) {
		this.employeDao = dao;
	}

	@Override
	public Employe addEmploye(Employe e, Long codeSup) {
		// TODO Auto-generated method stub
		return employeDao.addEmploye(e, codeSup);
	}

	@Override
	public List<Employe> getEmployes() {
		// TODO Auto-generated method stub
		return employeDao.getEmployes();
	}

	@Override
	public List<Employe> getEmployesByGroupe(Long codeGr) {
		// TODO Auto-generated method stub
		return employeDao.getEmployesByGroupe(codeGr);
	}

}
