package com.example.demo3.util;

import com.example.demo3.controller.ModelFactoryController;
import com.example.demo3.models.Client;
import com.example.demo3.service.serviceImpl.ClientServiceImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    public static ArrayList<Client> productListSQL(){
        ArrayList<Client> productList = new ArrayList<>();
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/cliente";
        String user = "admin_user";
        String password = "admin";
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM clients");
            while (rs.next()){

               productList.add(new Client(rs.getString("name"),rs.getString("age"),rs.getString("mail"),Integer.parseInt(rs.getString("password"))));
                System.out.println(rs.getString("name") + " añadido con exito a la lista");
            }
            statement.close();
            return productList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void agregarProducto(Client client){
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/cliente";
        String user = "admin_user";
        String password = "admin";
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            ps = connection.prepareStatement("INSERT INTO clients VALUES (?,?,?,?)");
            ps.setString(1, client.getName());
            ps.setString(2, client.getAge());
            ps.setString(3, client.getMail());
            ps.setString(4, String.valueOf(client.getPassword()));
            ps.executeUpdate();
            System.out.println("Conexion realizada con exito");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (connection != null){
                    connection.close();
                }
            }catch (SQLException e){
                System.out.println(e);
            }
        }
    }
}
