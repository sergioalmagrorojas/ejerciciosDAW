<%-- 
    Document   : prueba_formulario
    Created on : 12-feb-2020, 8:46:49
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
    <h1>Formulario de prueba</h1>
    <form method="post" action="prueba_formulario1.jsp">
      Introduzca una frase: <input type="text" name="frase1"><br>
      <input type="submit" value="Procesar datos ...">
    </form>
  </body>
</html>