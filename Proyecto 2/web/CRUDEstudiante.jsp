<%-- 
    Document   : CRUDEstudiante
    Created on : 3/05/2025, 5:38:56 p. m.
    Author     : walte
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@6.6.0/css/fontawesome.min.css" integrity="sha384-NvKbDTEnL+A8F/AA5Tc5kmMLSJHUO868P+lDtTpJIeQdGYaUIuLr4lVGOEA1OcMy" crossorigin="anonymous">

        <title>Agregar un estudiante</title>
    </head>
    <body>
        <h1>Agregar un estudiante</h1>
        <form action="AddCurso" method="post">

            <!--Ingreso del nombre del estudiante -->
            <div class="form-group">
                <label>Nombre del Estudiante</label>    
                <input type="string" class="form-control" name="NEstudiante" id="NEstudiante" placeholder="Diga el nombre del estudiante">
            </div>

            <!--Ingreso del id del estudiante-->
            <div class="form-group">
                <label>Id del Estiduante</label>
                <input type="int" class="form-control" name="IdEstudiante" id="IdEstudiante" placeholder="Diga el Id del estudiante">
            </div>

            <!-- Ingreso del numero de telefono -->
            <div class = "form-group">
                <label>Numero de telefono del estudiante</label>
                <input type="int" class="form-control" name="TEstudiante" id="TEstudiante" placeholder="Diga el numero de teledono del estudiante"> 
            </div>

            <!--Ingreso del correo del estudiante -->
            <div class="form-group">
                <label>Correo del Estudiante</label>    
                <input type="string" class="form-control" name="CEstudiante" id="CEstudiante" placeholder="Diga el correo del estudiante">
            </div>

            <button type="submit">Guardar</button>
            <button type="button"onclick="history.back();">Cancelar</button>
        </form>
    </body>
</html>
