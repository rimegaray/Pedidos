<%-- 
    Document   : respuesta
    Created on : 27/06/2020, 07:50:43 PM
    Author     : Juan Carlos
--%>
<%
    Double monto = (Double)request.getAttribute("totalapagarjsp");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Total a pagar</h1>
        <%=monto%>
    </body>
</html>
