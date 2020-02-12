<%-- 
    Document   : hola
    Created on : 12-feb-2020, 9:36:14
    Author     : sergi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <% request.setCharacterEncoding("UTF-8"); %>
    Hola , bienvenido : <% out.print(request.getParameter("nombre")); %>
    <form action="ejercicio3_1.jsp">
    <input type="submit" value="Volver atrás"/> 
    </form>
  </body>
</html>
