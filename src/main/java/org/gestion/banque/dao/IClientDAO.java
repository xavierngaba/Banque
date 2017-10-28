package org.gestion.banque.dao;

import java.util.List;

import org.gestion.banque.entity.Client;

public interface IClientDAO {
  public Client addClient(Client c);
  public Client consulterClient(Long codeCli);
  public List<Client> consulterClients(String mc);
}
