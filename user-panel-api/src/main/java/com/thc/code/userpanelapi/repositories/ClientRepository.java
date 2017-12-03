package com.thc.code.userpanelapi.repositories;

import com.thc.code.userpanelapi.domain.Client;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientRepository {

    private List<Client> clientsList = new ArrayList<>();

    public ClientRepository(){

        clientsList.add(new Client(001,"Client1", "", "Apellido1", "3571-457371", "Obispo Trejo 1119", "Facuc"));
        clientsList.add(new Client(002,"Client2", "", "Apellido2", "3571-457371", "Obispo Trejo 1119", "user1"));
        clientsList.add(new Client(003,"Client3", "", "Apellido3", "3571-457371", "Obispo Trejo 1119", "user2"));
        clientsList.add(new Client(004,"Client4", "", "Apellido4", "3571-457371", "Obispo Trejo 1119", "user3"));
        clientsList.add(new Client(005,"Client5", "", "Apellido5", "3571-457371", "Obispo Trejo 1119", "user4"));
        clientsList.add(new Client(006,"Client6", "", "Apellido6", "3571-457371", "Obispo Trejo 1119", "user5"));
        clientsList.add(new Client(007,"Client7", "", "Apellido7", "3571-457371", "Obispo Trejo 1119", "user6"));
    }


    public Client getClientByName(String name) {
        for (Client client : clientsList) {
            if (client.getName().equalsIgnoreCase(name)) {
                return client;
            }
        }

        return null;
    }

    public List<Client> getClientsList() {
        return clientsList;
    }

    public boolean addClient(Client client) {
        return clientsList.add(client);
    }
}
