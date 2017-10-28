package org.gestion.banque;

import org.gestion.banque.entity.Client;
import org.gestion.banque.metier.IClientMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		IClientMetier gestionnaireClient = (IClientMetier) context.getBean("ClientMetier");
		gestionnaireClient.addClient(new Client("C1","AD1"));
		gestionnaireClient.addClient(new Client("C2","AD2"));
	}
}
