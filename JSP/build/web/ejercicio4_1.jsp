<%-- 
    Document   : ejercicio4_1
    Created on : 13-feb-2020, 21:45:14
    Author     : sergi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Media</title>
  </head>
  <body>
    <%
      double nota1=Double.valueOf(request.getParameter("nota1"));
      double nota2=Double.valueOf(request.getParameter("nota2"));
      double nota3=Double.valueOf(request.getParameter("nota3"));
      double media=(nota1+nota2+nota3)/3;
      out.println("La media :" + media);
      
    %>
  </body>
</html>
