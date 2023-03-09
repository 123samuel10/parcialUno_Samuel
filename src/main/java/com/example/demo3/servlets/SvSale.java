package com.example.demo3.servlets;

import com.example.demo3.controller.ModelFactoryController;
import com.example.demo3.service.serviceImpl.SaleServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "SvSale",urlPatterns = "/venta")

public class SvSale extends HttpServlet {


    ModelFactoryController mfc=ModelFactoryController.getInstance();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String nameSale=request.getParameter("nombreComprador");
        HttpSession session = request.getSession();
        session.setAttribute("mfc",mfc);
        response.sendRedirect("listSale.jsp");
        mfc.getLaboratory().getClientService().getClients().forEach(client -> {
            if (client.getName()!=nameSale) {
                HttpSession session1=request.getSession();
                session1.setAttribute("ERROR",mfc);

            }
        });
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String product1="Platano";
        int amount1=Integer.parseInt(req.getParameter("cantidad1"));
        int price=Integer.parseInt(req.getParameter("precio1"));
        String product2="Piña";
        int amount2=Integer.parseInt(req.getParameter("cantidad2"));
        int price2=Integer.parseInt(req.getParameter("precio2"));
        String product3="Piña";
        int amount3=Integer.parseInt(req.getParameter("cantidad3"));
        int price3=Integer.parseInt(req.getParameter("precio3"));
        String nameSale=req.getParameter("nombreComprador");
        mfc.addSale(product1,amount1,price,product2,amount2,price2,product3,amount3,price3,mfc.getLaboratory().getClientService(),nameSale);

        mfc.getLaboratory().getSaleService().getSales().stream().forEach(sale -> {
            if (sale!= null) {
                System.out.println("producto uno: "+sale.getProducto());
                System.out.println("cantidad uno: "+sale.getCantidad1());
                System.out.println("precio uno: "+sale.getPrecio1());
                System.out.println("---------------------");
                System.out.println("producto dos: "+sale.getProducto2());
                System.out.println("cantidad dos: "+sale.getCantidad2());
                System.out.println("precio dos: "+sale.getPrecio2());
                System.out.println("---------------------");
                System.out.println("producto tres: "+sale.getProducto3());
                System.out.println("cantidad tres: "+sale.getCantidad3());
                System.out.println("precio tres: "+sale.getPrecio3());
            }
        });

    }
}
