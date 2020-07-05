<%-- 
    Document   : principal
    Created on : 27/06/2020, 06:35:07 PM
    Author     : Juan Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Principal</title>
    </head>
    <body>
        <h1>Bienvenido a la Pagina Principal</h1>
        <form action="ValidarPromocion">
        
        <label>Ingrese producto</label>
        <input type="text" name="caja1">
        <br>
        <br>
        <label>Ingrese cantidad</label>
        <input type="text" name="caja2">
        <br>
        <br>
        <label>Ingrese Codigo</label>
        <input type="text" name="caja3">
        <br>
        <br>
        <input type="submit" value="Enviar">
        </form>
    </body>
</html>
