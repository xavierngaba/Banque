package org.gestion.banque.dao;

import java.util.List;

import org.gestion.banque.entity.Compte;
import org.gestion.banque.entity.Operation;

public interface IOperationDAO {
	public Operation addOperation(Operation op, String codeCpte, Long codeEmp);
	public void versement(String codeCpte, double mt, Long codeEmp);
	public void retrait(String codeCpte, double mt, Long codeEmp);
	public void virement(String codeCpte1,String codeCpte2, double mt, Long codeEmp);
	public List<Operation> consulterOperationCompte(String codeCpte);
	public Compte consulterCompte(String codeCpte);
}
