<%-- 
    Document   : hola
    Created on : 11-feb-2020, 10:13:30
    Author     : sergi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hola</title>
  </head>
  <body>
    <h1>Hello World!</h1>
    <%
      for (int i = 0; i < 10; i++) {
        out.println("Esto es una prueba" + i + "\n");
      }

    %>
  </body>
</html>

