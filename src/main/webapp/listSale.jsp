<%@ page import="com.example.demo3.service.serviceImpl.SaleServiceImpl" %>
<%@ page import="com.example.demo3.models.Sale" %>
<%@ page import="com.example.demo3.controller.ModelFactoryController" %><%--
  Created by IntelliJ IDEA.
  User: Usuario
  Date: 7/03/2023
  Time: 9:18 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Listar Venta</h1>
<%
    //List<Client> clientsList = (List)request.getSession().getAttribute("clientsList");


    ModelFactoryController mfc=(ModelFactoryController)request.getSession().getAttribute("mfc");

    int cont=1;
    int totalBuy=0;
    int total1=0;
    int total2=0;
    int total3=0;
  for (int i=0;i<mfc.getLaboratory().getSaleService().getSales().size();i++){
      if (mfc.getLaboratory().getSaleService().getSales()!=null){
          total1=mfc.getLaboratory().getSaleService().getSales().get(i).getCantidad1()*mfc.getLaboratory().getSaleService().getSales().get(i).getPrecio1();
          total2=mfc.getLaboratory().getSaleService().getSales().get(i).getCantidad2()*mfc.getLaboratory().getSaleService().getSales().get(i).getPrecio2();
          total3=mfc.getLaboratory().getSaleService().getSales().get(i).getCantidad3()*mfc.getLaboratory().getSaleService().getSales().get(i).getPrecio3();
          totalBuy=total1+total2+total3;
      }
  }
    for (Sale sale:mfc.getLaboratory().getSaleService().getSales()){




%>

<p><b>Venta <%=cont +"-"+" Cliente: "+sale.getNameSale()%></b></p>

<p>Producto: <%=sale.getProducto()%></p>
<p>Cantidad: <%=sale.getCantidad1()%></p>
<p>Precio:<%=sale.getPrecio1()%> </p>
<br>
<p>Producto 2: <%=sale.getProducto2()%></p>
<p>Cantidad 2: <%=sale.getCantidad2()%></p>
<p>Precio 2:<%=sale.getPrecio2()%> </p>
<br>
<p>Producto 3: <%=sale.getProducto3()%></p>
<p>Cantidad 3: <%=sale.getCantidad3()%></p>
<p>Precio 3:<%=sale.getPrecio3()%> </p>
<br>
<p>TOTAL:<%=totalBuy%> </p>
<p>------------------------</p>
<%cont=cont+1;%>

<%}%>

</body>
</html>
