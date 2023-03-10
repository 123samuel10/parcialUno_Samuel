package com.example.demo3.service.serviceImpl;

import com.example.demo3.models.Client;

import com.example.demo3.service.ClientService;
import com.example.demo3.util.BaseDeDatos;

import java.util.ArrayList;

public class ClientServiceImpl implements ClientService {
    ArrayList<Client>clients=new ArrayList<>();
    @Override
    public void add(String name, String age, String mail, int amount) {
        Client client=new Client(name,age,mail,amount);
       clients.add(client);
       BaseDeDatos.agregarProducto(client);
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }
}
