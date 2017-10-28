package org.gestion.banque.dao;

import java.util.List;


import org.gestion.banque.entity.Groupe;

public interface IGroupeDAO {
	public Groupe addGroupe(Groupe g);
	public void addEmployeToGroup(Long codeEmp, Long codeGr);
	public List<Groupe> getGroupes();
}
