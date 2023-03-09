package com.example.demo3.controller;

import com.example.demo3.service.ModelFactoryControllerService;
import com.example.demo3.service.serviceImpl.ClientServiceImpl;
import com.example.demo3.service.serviceImpl.LaboratoryServiceImpl;

public class ModelFactoryController implements ModelFactoryControllerService {
    LaboratoryServiceImpl laboratory;



    private static class SingletonHolder {
        // El constructor de Singleton puede ser llamado desde aquí al ser protected
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }

    // Método para obtener la instancia de nuestra clase
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }

    public ModelFactoryController() {
        System.out.println("invocación clase singleton");
        laboratory = new LaboratoryServiceImpl();
    }

    @Override
    public void add(String name, String age, String mail, int amount) {
        laboratory.getClientService().add(name, age, mail, amount);
    }

    @Override
    public void addSale(String producto, int cantidad1, int precio1, String producto2, int cantidad2, int precio2,String producto3,int cantidad3,int precio3, ClientServiceImpl clientService, String nameSale) {
        laboratory.getSaleService().addSale(producto,cantidad1,precio1,producto2,cantidad2,precio2,producto3,cantidad3,precio3,clientService,nameSale);
    }

    public LaboratoryServiceImpl getLaboratory() {
        return laboratory;
    }
}
