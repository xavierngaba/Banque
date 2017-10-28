package org.gestion.banque.metier.impl;

import java.util.List;

import org.gestion.banque.dao.ICompteDAO;
import org.gestion.banque.entity.Compte;
import org.gestion.banque.metier.ICompteMetier;

public class CompteMetierImpl implements ICompteMetier{

	private ICompteDAO dao;
	
	public void setDao(ICompteDAO dao) {
		this.dao = dao;
	}

	@Override
	public Compte addCompte(Compte cp, Long codeCli, Long codeEmp) {
		// TODO Auto-generated method stub
		return dao.addCompte(cp, codeCli, codeEmp);
	}

	@Override
	public List<Compte> getCompteByClient(Long codeCli) {
		// TODO Auto-generated method stub
		return dao.getCompteByClient(codeCli);
	}

	@Override
	public List<Compte> getCompteByEmploye(Long codeEmp) {
		// TODO Auto-generated method stub
		return dao.getCompteByEmploye(codeEmp);
	}

}
