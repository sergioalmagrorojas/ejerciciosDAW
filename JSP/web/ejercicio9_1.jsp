<%-- 
    Document   : ejercicio9_1
    Created on : 04-mar-2020, 19:10:28
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
    <h1>Piramide:</h1>
    <%
      int altura=Integer.parseInt(request.getParameter("altura"));
      int posicion = 1; 
      int espacios=altura-1;
      int i =0;
      while(posicion<=altura){
        for(i =1;i<=espacios;i++){
          out.print("<img src=\"foto_negra.png\">");

        }
        for(i =1;i<posicion*2;i++){
          out.print("<img src=\"foto_verde.png\">");
        }
        out.println("</br>");

        posicion++;
        espacios--;
      }
      
    %>
  </body>
</html>
