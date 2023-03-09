package com.example.demo3.models;

import com.example.demo3.service.serviceImpl.ClientServiceImpl;

public class Sale {
    private String producto;
    private String producto2;
   private String producto3;
    private int cantidad1;
    private int cantidad2;
    private int cantidad3;
    private int precio1;
    private int precio2;
    private int precio3;
    private String nameSale;

    public Sale(String producto, int cantidad1, int precio1, String producto2, int cantidad2, int precio2,String producto3,int cantidad3,int precio3,String  nameSale){
        this.producto=producto;
        this.cantidad1=cantidad1;
        this.precio1=precio1;
        this.producto2=producto2;
        this.cantidad2=cantidad2;
        this.precio2=precio2;
        this.producto3=producto3;
        this.cantidad3=cantidad3;
        this.precio3=precio3;
        this.nameSale=nameSale;

    }




    public int getPrecio3() {
        return precio3;
    }

    public int getCantidad3() {
        return cantidad3;
    }

    public String getProducto3() {
        return producto3;
    }

    public String getNameSale() {
        return nameSale;
    }

    public int getPrecio2() {
        return precio2;
    }

    public int getPrecio1() {
        return precio1;
    }

    public int getCantidad2() {
        return cantidad2;
    }

    public int getCantidad1() {
        return cantidad1;
    }

    public String getProducto2() {
        return producto2;
    }

    public String getProducto() {
        return producto;
    }
}
