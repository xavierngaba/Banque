package org.gestion.banque.metier;

import java.util.List;

import org.gestion.banque.entity.Client;

public interface IClientMetier {
	public Client addClient(Client c);

	public Client consulterClient(Long codeCli);

	public List<Client> consulterClients(String mc);
}
