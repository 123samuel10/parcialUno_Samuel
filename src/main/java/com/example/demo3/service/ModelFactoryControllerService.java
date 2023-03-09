package com.example.demo3.service;

import com.example.demo3.service.serviceImpl.ClientServiceImpl;

public interface ModelFactoryControllerService {
    void add(String name,String age,String mail,int amount);
    void addSale(String producto, int cantidad1, int precio1, String producto2, int cantidad2, int precio2,String producto3,int cantidad3,int precio3, ClientServiceImpl clientService, String nameSale);
}
