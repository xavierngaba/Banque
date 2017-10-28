package org.gestion.banque.test;


import org.gestion.banque.metier.IClientMetier;
import org.gestion.banque.metier.ICompteMetier;
import org.gestion.banque.metier.IEmployeMetier;
import org.gestion.banque.metier.IGroupeMetier;
import org.gestion.banque.metier.IOperationMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BanqueKeywordLibrary {
	
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";
	
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
	IClientMetier gestionnaireClient = (IClientMetier) context.getBean("ClientMetier");
	ICompteMetier gestionnaireCompte = (ICompteMetier) context.getBean("CompteMetier");
	IEmployeMetier gestionnaireEmploye = (IEmployeMetier) context.getBean("EmployeMetier");
	IGroupeMetier gestionnaireGroupe = (IGroupeMetier) context.getBean("GroupeMetier");
	IOperationMetier gestionnaireOperation = (IOperationMetier) context.getBean("OperationMetier");
	
	
}
