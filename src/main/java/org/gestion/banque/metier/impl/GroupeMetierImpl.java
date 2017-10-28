package org.gestion.banque.metier.impl;

import java.util.List;

import org.gestion.banque.dao.IGroupeDAO;
import org.gestion.banque.entity.Groupe;
import org.gestion.banque.metier.IGroupeMetier;

public class GroupeMetierImpl implements IGroupeMetier{

	private IGroupeDAO dao;
	
	public void setDao(IGroupeDAO dao) {
		this.dao = dao;
	}

	@Override
	public Groupe addGroupe(Groupe g) {
		// TODO Auto-generated method stub
		return dao.addGroupe(g);
	}

	@Override
	public void addEmployeToGroup(Long codeEmp, Long codeGr) {
		dao.addEmployeToGroup(codeEmp, codeGr);
	}

	@Override
	public List<Groupe> getGroupes() {
		// TODO Auto-generated method stub
		return dao.getGroupes();
	}

}
