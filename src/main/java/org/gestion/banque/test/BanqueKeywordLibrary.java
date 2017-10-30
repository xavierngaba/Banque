package org.gestion.banque.test;


import java.util.Date;
import org.gestion.banque.entity.Client;
import org.gestion.banque.entity.Compte;
import org.gestion.banque.entity.CompteCourant;
import org.gestion.banque.entity.Employe;
import org.gestion.banque.metier.IClientMetier;
import org.gestion.banque.metier.ICompteMetier;
import org.gestion.banque.metier.IEmployeMetier;
import org.gestion.banque.metier.IGroupeMetier;
import org.gestion.banque.metier.IOperationMetier;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@RobotKeywords
public class BanqueKeywordLibrary {
	
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";
	
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
	IClientMetier gestionnaireClient = (IClientMetier) context.getBean("ClientMetier");
	ICompteMetier gestionnaireCompte = (ICompteMetier) context.getBean("CompteMetier");
	IEmployeMetier gestionnaireEmploye = (IEmployeMetier) context.getBean("EmployeMetier");
	IGroupeMetier gestionnaireGroupe = (IGroupeMetier) context.getBean("GroupeMetier");
	IOperationMetier gestionnaireOperation = (IOperationMetier) context.getBean("OperationMetier");
	
	private Client cl;
	private Employe emp;
	private Compte cpte;
	
	/**
	 * Mots-clé pour ajouter un client
	 * @param nomClient
	 * @param adresseClient
	 */
	@RobotKeyword
	public void creerUnNouveauClient(String nomClient,String adresseClient){
		cl = gestionnaireClient.addClient(new Client(nomClient,adresseClient));
	}
	
	/**
	 * Mots-clé pour ajouter un employé
	 * @param nomEmploye
	 * @param codeEmployeSup
	 */
	@RobotKeyword
	private void creerUnNouvelEmploye(String nomEmploye,Long codeEmployeSup){
		emp = gestionnaireEmploye.addEmploye(new Employe(nomEmploye), codeEmployeSup);
	}
	
	
	/**
	 * Mots-clé pour creer un compte
	 * @param solde
	 * @param decouvert
	 * @param codeClient
	 * @param codeEmploye
	 */
	@RobotKeyword
	private void creerUnNouveauCompte(double solde,double decouvert,Long codeClient,Long codeEmploye){
		cpte = gestionnaireCompte.addCompte(new CompteCourant("Cpte1",new Date(),solde,decouvert), codeClient, codeEmploye);
	}
}
