package org.gestion.banque.dao;

import java.util.List;

import org.gestion.banque.entity.Compte;

public interface ICompteDAO {
	public Compte addCompte(Compte cp, Long codeCli, Long codeEmp);
	public List<Compte> getCompteByClient(Long codeCli);
	public List<Compte> getCompteByEmploye(Long codeEmp);
}
