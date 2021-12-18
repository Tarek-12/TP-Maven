package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;

public class ClientServiceImpl implements ClientService{
	
	ClientRepository clientRepository;
	
	@Override
	public Client save(Client c) {
		System.out.println("ServiceLayer: ClientServiceImpl Level...");
		return clientRepository.save(c);
	}
	public ClientServiceImpl() {
		System.out.println("Call ClientServiceImpl ...");
	}
	//Injection par setter
	public void setClientRepository(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	//Injection par constructor
	public ClientServiceImpl(ClientRepository clientRepository) {
		System.out.println("call ClientServiceImpl with clientRepository param...");
		this.clientRepository = clientRepository;
	}
	
}
