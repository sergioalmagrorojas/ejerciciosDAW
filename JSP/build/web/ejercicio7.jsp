<%-- 
    Document   : ejercicio7
    Created on : 04-mar-2020, 18:43:29
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
    <h1>Conversor de divisas (a pesetas)</h1>
    <form method="post" action="ejercicio5_1.jsp"> 
     Cantidad: <input type="number"  step="0.5" name="euros"></br>
     <input type="submit" value="Ver resultado en pesetas"> 
    </form>
    
    <h1>Conversor de divisas (a euros)</h1>
    <form method="post" action="ejercicio6_1.jsp"> 
     Cantidad: <input type="number"  step="10" name="pesetas"></br>
     <input type="submit" value="Ver resultado en euros"> 
    </form>
    
  </body>
</html>