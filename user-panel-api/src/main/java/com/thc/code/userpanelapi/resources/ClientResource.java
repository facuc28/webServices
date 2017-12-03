package com.thc.code.userpanelapi.resources;

import com.thc.code.userpanelapi.domain.Client;
import com.thc.code.userpanelapi.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client")
public class ClientResource {

    @Autowired
    private ClientService clientService;

    @RequestMapping("/{name}")
    public Client getClient(@PathVariable("name") String name) {
        return clientService.getClientByName(name);
    }

    @RequestMapping("/all")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @PostMapping("/add")
    public String createClient(@RequestBody Client client) {
      return clientService.createClient(client);
    }
}
