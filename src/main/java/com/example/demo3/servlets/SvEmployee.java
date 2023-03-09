package com.example.demo3.servlets;

import java.io.*;

import com.example.demo3.controller.ModelFactoryController;
import com.example.demo3.service.serviceImpl.ClientServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import javax.swing.*;

import static java.awt.SystemColor.window;

@WebServlet(name = "SvEmployee", urlPatterns = "/register-employee")
public class SvEmployee extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }
    ModelFactoryController mfc=ModelFactoryController.getInstance();
   // ClientServiceImpl clientService=new ClientServiceImpl();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        session.setAttribute("mfc",mfc);
        response.sendRedirect("listClients.jsp");




    }

    @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("firstName");
        String age = req.getParameter("age");
        String mail = req.getParameter("mail");
        int password= Integer.parseInt(req.getParameter("password"));
        //clientService.add(name,age,mail,password);
        mfc.add(name,age,mail,password);



        mfc.getLaboratory().getClientService().getClients().stream().forEach(client -> {
            if (client != null) {
                System.out.println("nombre: "+client.getName());
                System.out.println("edad: "+client.getAge());
                System.out.println("correo:"+client.getMail());
                System.out.println("contraseña: "+client.getPassword());
            }
        });

        String registro="se registro correctamente";
        HttpSession session = req.getSession();
        System.out.println(session);
//        session.setAttribute("clientService",clientService);
    }
}