package org.gestion.banque.metier.impl;

import java.util.List;

import org.gestion.banque.dao.IGroupeDAO;
import org.gestion.banque.entity.Groupe;
import org.gestion.banque.metier.IGroupeMetier;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class GroupeMetierImpl implements IGroupeMetier{

	private IGroupeDAO groupeDao;
	
	public void setGroupeDao(IGroupeDAO dao) {
		this.groupeDao = dao;
	}

	@Override
	public Groupe addGroupe(Groupe g) {
		// TODO Auto-generated method stub
		return groupeDao.addGroupe(g);
	}

	@Override
	public void addEmployeToGroup(Long codeEmp, Long codeGr) {
		groupeDao.addEmployeToGroup(codeEmp, codeGr);
	}

	@Override
	public List<Groupe> getGroupes() {
		// TODO Auto-generated method stub
		return groupeDao.getGroupes();
	}

}
