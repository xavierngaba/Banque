package org.gestion.banque.metier.impl;

import java.util.List;

import org.gestion.banque.dao.IEmployeDAO;
import org.gestion.banque.entity.Employe;
import org.gestion.banque.metier.IEmployeMetier;

public class EmployeMetierImpl implements IEmployeMetier{

	private IEmployeDAO dao;
	
	public void setDao(IEmployeDAO dao) {
		this.dao = dao;
	}

	@Override
	public Employe addEmploye(Employe e, Long codeSup) {
		// TODO Auto-generated method stub
		return dao.addEmploye(e, codeSup);
	}

	@Override
	public List<Employe> getEmployes() {
		// TODO Auto-generated method stub
		return dao.getEmployes();
	}

	@Override
	public List<Employe> getEmployesByGroupe(Long codeGr) {
		// TODO Auto-generated method stub
		return dao.getEmployesByGroupe(codeGr);
	}

}
