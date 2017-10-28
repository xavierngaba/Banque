package org.gestion.banque.metier.impl;

import java.util.List;

import org.gestion.banque.dao.ICompteDAO;
import org.gestion.banque.entity.Compte;
import org.gestion.banque.metier.ICompteMetier;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class CompteMetierImpl implements ICompteMetier{

	private ICompteDAO compteDao;
	
	public void setCompteDao(ICompteDAO dao) {
		this.compteDao = dao;
	}

	@Override
	public Compte addCompte(Compte cp, Long codeCli, Long codeEmp) {
		// TODO Auto-generated method stub
		return compteDao.addCompte(cp, codeCli, codeEmp);
	}

	@Override
	public List<Compte> getCompteByClient(Long codeCli) {
		// TODO Auto-generated method stub
		return compteDao.getCompteByClient(codeCli);
	}

	@Override
	public List<Compte> getCompteByEmploye(Long codeEmp) {
		// TODO Auto-generated method stub
		return compteDao.getCompteByEmploye(codeEmp);
	}

}
