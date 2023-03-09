package com.example.demo3.service.serviceImpl;

import com.example.demo3.controller.ModelFactoryController;
import com.example.demo3.models.Sale;
import com.example.demo3.service.SaleService;

import java.util.ArrayList;

public class SaleServiceImpl implements SaleService {

    ArrayList<Sale>sales=new ArrayList<>();


    @Override
    public void addSale(String producto, int cantidad1, int precio1, String producto2, int cantidad2, int precio2,String producto3,int cantidad3,int precio3,ClientServiceImpl clientService,String nameSale) {
        clientService.getClients().stream().forEach(client -> {
            if (client.getName().equals(nameSale)) {
                sales.add(new Sale(producto,cantidad1,precio1,producto2,cantidad2,precio2,producto3,cantidad3,precio3,nameSale));
            }else {
                System.out.println("rectifica el nombre del cliente creado");
            }
        });

    }


    public ArrayList<Sale> getSales() {
        return sales;
    }

}
