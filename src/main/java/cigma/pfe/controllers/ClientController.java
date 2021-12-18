package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;

public class ClientController {
	
	ClientService clientService;
	
	public Client save(Client c) {
		System.out.println("ClientController Level...");
		return clientService.save(c);
	}
	
	//Injection par setter
	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}
		
	//Injection par constructor
	public ClientController(ClientService clientService) {
		System.out.println("call ClientController with clientService param...");
		this.clientService = clientService;
	}
	public ClientController() {
		System.out.println("Call ClientController ...");
	}
}
