<%-- 
    Document   : tabla
    Created on : 11-feb-2020, 10:16:01
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


    <table border="1">
      <!--<tr><td>Columna1</td><td>Columna2</td><td>Columna3</td></tr>-->
      <%
        int filas = (int) (Math.random() * 10 + 1);
        int columnas = (int) (Math.random() * 15 + 1);
        int valores =(int )(Math.random()*100+1);
        int valores1=(int)(Math.random()*100+1);
       %>
       <tr>
         <td> <%out.print(valores);%> </td>
         <td> <%out.print(valores1);%></td>
         <td> <%out.print(valores);%></td>
         <td> <%out.print(valores);%></td>
         <td> <%out.print(valores);%></td>
         <td> <%out.print(valores);%></td>
       </tr>
       <tr>
         <td> <%out.print(valores);%> </td>
         <td> <%out.print(valores);%></td>
         <td> <%out.print(valores);%></td>
         <td> <%out.print(valores);%></td>
         <td> <%out.print(valores);%></td>
         <td> <%out.print(valores);%></td>
       </tr>
       <tr>
         <td> <%out.print(valores);%> </td>
         <td> <%out.print(valores);%></td>
         <td> <%out.print(valores);%></td>
         <td> <%out.print(valores);%></td>
         <td> <%out.print(valores);%></td>
         <td> <%out.print(valores);%></td>
       </tr>


    </table>
  </body>
</html>
