<%-- 
    Document   : ejercicio5_1
    Created on : 14-feb-2020, 8:37:16
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
      double euros=Double.valueOf(request.getParameter("euros"));
      double pesetas=euros*166.386;
      DecimalFormat formato = new DecimalFormat("######.###");
      out.println("La cantidad de  : " + euros + " son " +formato.format(pesetas) + " pesetas");
    %>
    <form action="ejercicio5.jsp">
    <input type="submit" value="Volver atrás"/> 
    </form>
  </body>
</html>
