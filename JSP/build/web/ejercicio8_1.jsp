<%-- 
    Document   : ejercicio8_1
    Created on : 04-mar-2020, 18:50:44
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
    <h1>Resultado</h1>
    <table style="border: 1px solid black">
    <%
      int numero=Integer.valueOf(request.getParameter("numero"));
         for(int i = 1; i<=11; i++){
            
            out.println("<tr><td>" + i + " * " + numero + "</td><td> : </td><td>" + i * numero + "</td></tr>");
            
         }
    %>
    </table>
  </body>
</html>
