<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Register employees</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
    <h1>Clients Register Form</h1>
    <form action="/register-employee" method="post">
        <table style="with: 80%">
            <tr>
                <td>Nombre:</td>
                <td><input id="escribirName" type="text" name="firstName" /></td>
            </tr>
            <tr>
                <td>Edad:</td>
                <td><input type="text" name="age" /></td>
            </tr>
            <tr>
                <td>Correo:</td>
                <td><input type="text" name="mail" /></td>
            </tr>
            <tr>
                <td>Contraseña</td>
                <td><input type="password" name="password" /></td>
            </tr>
        </table>
        <input id="registrar" type="submit" value="Register" />

    </form>

<h1>Clients list</h1>
<p> list users</p>
<form action="/register-employee" method="get">
    <input type="submit" value="list" />

</form>
    <p>------------------------------------------------</p>
    <br><br><br>

    <form action="/venta" method="post">

    <h1>PRODUTOS:</h1>
        <input type="text" name="nombreComprador" placeholder="nombre comprador">
        <br>
    <tr>

       <td>Platano</td>
        <br>
        <img src="img/imagen1.jpg" width="70" height="70">
        <br>
       <td><input type="number" name="cantidad1" width="20" placeholder="ingrese la cantidad"/></td>  <td><input type="number" value="1000" name="precio1"/></td>
    </tr>
     <br><br>
    <tr>
        <td id="producto2">Piña</td>
        <br>
        <img src="img/imagen2.jpg" width="70" height="70">
        <br>
       <td><input type="number" name="cantidad2" placeholder="ingrese la cantidad"/></td> <td><input type="number" value="1200" name="precio2"/>></td>
    </tr>
    <br><br>
    <tr>
        <td>Manzana</td>
        <br>
        <img src="img/imagen3.jpg" width="70" height="70">
        <br>
       <td><input type="number" name="cantidad3" placeholder="ingrese la cantidad"/></td> <td><input type="number" value="1000" name="precio3"/></td>
    </tr>
        <br>
        <input type="submit" value="Comprar" />
    </form>

    <h1>Sale list</h1>
    <p> list sale</p>
    <form action="/venta" method="get">
        <input id="sale" type="submit" value="Sale" />
        
    </form>
</body>
</html>