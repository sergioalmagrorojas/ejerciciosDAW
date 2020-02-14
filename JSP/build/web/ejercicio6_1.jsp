<%-- 
    Document   : ejercicio6_1
    Created on : 14-feb-2020, 8:47:52
    Author     : sergi
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.text.DecimalFormat"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Resultado</h1>
    <%
      double pesetas=Double.valueOf(request.getParameter("pesetas"));
      double euros=pesetas/166.386;
      DecimalFormat formato = new DecimalFormat("######.###");
      out.println("La cantidad de  : " + pesetas + " son " +formato.format(euros) + " euros");
    %>
    <form action="ejercicio6.jsp">
    <input type="submit" value="Volver atrás"/> 
    </form>
  </body>
</html>
