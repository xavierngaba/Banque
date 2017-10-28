package org.gestion.banque.metier;

import java.util.List;

import org.gestion.banque.entity.Compte;

public interface ICompteMetier {
	public Compte addCompte(Compte cp, Long codeCli, Long codeEmp);
	public List<Compte> getCompteByClient(Long codeCli);
	public List<Compte> getCompteByEmploye(Long codeEmp);
}
