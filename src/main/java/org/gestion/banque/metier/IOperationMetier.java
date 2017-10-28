package org.gestion.banque.metier;

import java.util.List;

import org.gestion.banque.entity.Compte;
import org.gestion.banque.entity.Operation;

public interface IOperationMetier {
	public Operation addOperation(Operation op, String codeCpte, Long codeEmp);
	public void verser(String codeCpte, double mt, Long codeEmp);
	public void retirer(String codeCpte, double mt, Long codeEmp);
	public void virer(String codeCpte1,String codeCpte2, double mt, Long codeEmp);
	public List<Operation> consulterOperationCompte(String codeCpte);
	public Compte consulterCompte(String codeCpte);
}
