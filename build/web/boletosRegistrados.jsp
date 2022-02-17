<%-- 
    Document   : boletosRegistrados
    Created on : 16/02/2022, 09:01:25 PM
    Author     : Valeria
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro completado</title>
    </head>
    <body>
        <h1>Boletos registrados</h1>
        
        <% 
            List styles = (List)request.getAttribute("styles");
            Iterator it = styles.iterator();
            while(it.hasNext()){
                out.print("<br>- " + it.next());
            }
        %> 
    </body>
</html>
