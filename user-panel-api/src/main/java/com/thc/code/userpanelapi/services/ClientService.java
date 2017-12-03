package com.thc.code.userpanelapi.services;

import com.thc.code.userpanelapi.domain.Client;
import com.thc.code.userpanelapi.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client getClientByName(String name) {
        return clientRepository.getClientByName(name);
    }

    public List<Client> getAllClients() {
        return clientRepository.getClientsList();
    }

    public String createClient(Client client) {
        if (clientRepository.addClient(client)) {
            return "Cliente creado exitosamente";
        }

        return "Error al crear el cliente!";
    }
}
