<%-- 
    Document   : CRUDUsuarios
    Created on : Apr 27, 2025, 5:21:36 PM
    Author     : KZeaR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/16fabe012c.js" crossorigin="anonymous"></script>
        <title>Mantenimiento de Usuarios</title>
    </head>
    <body>
        <h1>Mantenimiento de Usuarios</h1>
        <div class="container mt-5">
            <div class="row">
                <div class="col-sm">
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th scope="col" colspan="2" class="text-center">Usuarios</th>
                                <th scope="col">
                                    <a href="ADDUsuarios.jsp"><i class="fa-solid fa-user-plus "></i></a>
                                </th>
                            </tr>
                            <tr>
                                <th scope="col">Usuario</th>
                                <th scope="col">Password</th>
                                <th scope="col">Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${listado}" var="items">
                                <tr>
                                    <td>${items.usuario}</td>
                                    <td>${items.password}</td>
                                    <td>
                                        <a href="ConsultaUsuario?user=${items.usuario}"><i class="fa-solid fa-user-pen"></i>
                                        <a href="ConsultarUsuarioD?user=${items.usuario}"><i class="fa-solid fa-user-minus"></i>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
            
        </div>
    </body>
</html>
