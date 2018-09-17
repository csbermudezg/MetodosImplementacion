<%-- 
    Document   : response
    Created on : 28-ago-2018, 16:00:27
    Author     : Claudia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="mybean" scope="session" class="co.edu.unipiloto.labJSP.NameHandler" />
        <jsp:setProperty name="mybean" property="name" />
        <jsp:setProperty name="mybean" property="email" />
        <jsp:setProperty name="mybean" property="nacimiento" />
        <jsp:setProperty name="mybean" property="name" />
        
        <h1>Hola, <jsp:getProperty name="mybean" property="name" />!</h1>
        <h1>Tu email es: <jsp:getProperty name="mybean" property="email"/></h1>
        <h1>Tu edad es: <jsp:getProperty name="mybean" property="edad"/></h1>
        <h1>Tu nombre tiene: <jsp:getProperty name="mybean" property="caracteres"/> caracteres </h1>
    </body>
</html>
