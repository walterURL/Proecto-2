<%-- 
    Document   : CRUDUsuarios
    Created on : Apr 27, 2025, 5:21:36 PM
    Author     : KZeaR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@6.6.0/css/fontawesome.min.css" integrity="sha384-NvKbDTEnL+A8F/AA5Tc5kmMLSJHUO868P+lDtTpJIeQdGYaUIuLr4lVGOEA1OcMy" crossorigin="anonymous">
        <title>Mantenimiento de Usuarios</title>
    </head>
    <body>
        <h1>Agregando Usuarios</h1>
        <div class="container mt-5">
            <form action="AddUsuario" method="post">
              <div class="form-group">
                <label>Usuario</label>
                <input type="string" class="form-control" name="usuario" id="usuario" placeholder="Ingrese usuario">
              </div>
              <div class="form-group">
                <label>Password</label>
                <input type="password" class="form-control" name="password" id="password" placeholder="Ingrese Password">
              </div>
              <button type="submit">Guardar</button>
              <button type="button"onclick="history.back();">Cancelar</button>
            </form>
        </div>
    </body>
</html>
