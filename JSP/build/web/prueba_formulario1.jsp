<%-- 
    Document   : prueba_formulario1
    Created on : 12-feb-2020, 8:47:17
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
    <h1>Procesamiento información recibida</h1>
    <% request.setCharacterEncoding("UTF-8"); %>
    La frase introducida anteriormente (tengo buena memoria) es: <% out.print(request.getParameter("frase1")); %>
    <form action="prueba_formulario.jsp">
    <input type="submit" value="Volver atrás"/> 
    </form>
  </body>
</html>