<%-- 
    Document   : CRUDAsignaciones
    Created on : 5/05/2025, 11:00:17 p. m.
    Author     : walte
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hacer una asignacion</title>
    </head>
    <body>
        <h1>Asginaciones</h1>
        <form>
            <!--Ingreso del nombre de l materia-->
            <div class="form-group">
                <label>Nombre de la materia</label>    
                <input type="string" class="form-control" name="Nmateria" id="Nmateria" placeholder="Diga el nombre del curso">
            </div>

            <!-- Ingreso de los creditos del curso -->
            <div class = "form-group">
                <label>id de la materia</label>
                <input type="int" class="form-control" name="Idmateria" id="Idmateria" placeholder="Diga el Id de la materia"> 
            </div>

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
        </form>


    </body>
</html>
