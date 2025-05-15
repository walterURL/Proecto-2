<%-- 
    Document   : tablaCurso
    Created on : 12/05/2025, 4:51:38 p. m.
    Author     : walte
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
        <h1>Hello World!</h1>
        <div class="container mt-5">
            <div class="row">
                <div class="col-sm">
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th scope="col">Codigo_curso</th>
                                <th scope="col">Nombre_curso</th>
                                <th scope="col">creditos</th>
                            </tr>
                        </thead>
                    </table>
                    <tr>
                        <c:forEach items="${listado}" var="items">

                            <td>${listado.codigo}</td>
                            <td>${listado.nombre_Curso}</td>
                            <td>${listado.creditos}</td> 
                            
                        </c:forEach>

                    </tr>

                    </table>

                </div>
            </div>
        </div>

    </body>
</html>
