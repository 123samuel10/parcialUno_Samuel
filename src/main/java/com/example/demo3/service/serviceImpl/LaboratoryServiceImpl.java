package com.example.demo3.service.serviceImpl;

public class LaboratoryServiceImpl {
    private ClientServiceImpl clientService;
    private SaleServiceImpl saleService;
    public LaboratoryServiceImpl(){
        this.clientService=new ClientServiceImpl();
        this.saleService=new SaleServiceImpl();
    }

    public SaleServiceImpl getSaleService() {
        return saleService;
    }

    public ClientServiceImpl getClientService() {
        return clientService;
    }
}
