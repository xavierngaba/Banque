package org.gestion.banque.metier;

import java.util.List;

import org.gestion.banque.entity.Groupe;

public interface IGroupeMetier {
	public Groupe addGroupe(Groupe g);
	public void addEmployeToGroup(Long codeEmp, Long codeGr);
	public List<Groupe> getGroupes();
}
