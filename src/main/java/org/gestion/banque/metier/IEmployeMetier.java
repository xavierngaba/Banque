package org.gestion.banque.metier;

import java.util.List;

import org.gestion.banque.entity.Employe;

public interface IEmployeMetier {
	public Employe addEmploye(Employe e, Long codeSup);
	public List<Employe> getEmployes();
	public List<Employe> getEmployesByGroupe(Long codeGr);
}
