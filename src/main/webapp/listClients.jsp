<%@ page import="com.example.demo3.models.Employee" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.demo3.models.Client" %>
<%@ page import="com.example.demo3.service.serviceImpl.ClientServiceImpl" %>
<%@ page import="com.example.demo3.controller.ModelFactoryController" %><%--
  Created by IntelliJ IDEA.
  User: monicatobon
  Date: 2/03/23
  Time: 4:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Clients</title>

</head>
<body>
<h1>List Clients</h1>
<%
    //List<Client> clientsList = (List)request.getSession().getAttribute("clientsList");
    //ClientServiceImpl clientServices= (ClientServiceImpl) request.getSession().getAttribute("clientService");

    ModelFactoryController mfc= (ModelFactoryController) request.getSession().getAttribute("mfc");
    int cont=1;


    for (Client client:mfc.getLaboratory().getClientService().getClients()){
%>

        <p><b>Client <%=cont%></b></p>
        <p>Nombre: <%=client.getName()%></p>
        <p>Edad: <%=client.getAge()%></p>
        <p>Correo:<%=client.getMail()%> </p>
         <p>Contraseña:<%=client.getPassword()%> </p>
        <p>------------------------</p>
        <%cont=cont+1;%>

    <%}%>


</body>

</html>
