package com.example.demo3.service.serviceImpl;

import com.example.demo3.models.Client;

import com.example.demo3.service.ClientService;

import java.util.ArrayList;

public class ClientServiceImpl implements ClientService {
    ArrayList<Client>clients=new ArrayList<>();
    @Override
    public void add(String name, String age, String mail, int amount) {
        clients.add(new Client(name, age, mail, amount));
        System.out.println(clients);
    }


    public ArrayList<Client> getClients() {
        return clients;
    }
}
