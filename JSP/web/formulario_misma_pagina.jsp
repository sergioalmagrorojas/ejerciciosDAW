<%-- 
    Document   : formulario_misma_pagina
    Created on : 20-feb-2020, 9:09:03
    Author     : sergi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>hola</title>
  </head>
  <body>
    <%
      request.setCharacterEncoding("UTF-8");
      String palabra = request.getParameter("frase1");
      String memoriaPrevia = request.getParameter("memorizado");
      String memoria= "";
      if (palabra != null) {
        memoria = memoriaPrevia + "<br>" + palabra;
      }
    %>
    <form method="post" action="formulario_misma_pagina.jsp">
      Introduzca una frase: <input type="text" name="frase1"><br>
      <input type="submit" value="Memorizar"/>
      <input type="hidden" name="memorizado" value="<%out.print(memoria);%>">
    </form>
    <h1>Procesamiento información recibida</h1>
    <%if(palabra!=null){
      out.print(memoria);
    }
    %>
  </body>
</html>
