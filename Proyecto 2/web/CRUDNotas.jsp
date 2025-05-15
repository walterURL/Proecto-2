<%-- 
    Document   : CRUDNotas
    Created on : 3/05/2025, 5:42:53 p. m.
    Author     : walte
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Asignacion de notas</title>
    </head>
    <body>
        <h1>Asginacion de notas a los estudiantes</h1>
        <div class="conatiner mt-5">
            <form action="AddNotas" method="post">
                
                <!-->Ingreso del carnet del estudiante</!-->
                <div class="form-group">
                    <label>Carnet del estudiante</label>
                    <input type="int" class="form-control" name="Carnet" id="Carnet" placeholder="Diga el carnet del estudiante">
                </div>
                
                 <!-->Ingreso del nombre del estudiante</!-->
                <div class="form-group">
                    <label>Carnet del estudiante</label>
                    <input type="String" class="form-control" name="NombreA" id="NombreA" placeholder="Diga el nombre del estudiante">
                </div>
                
                <!-->Ingreso de la nota del primer parcial</!-->
                <div class="form-group">
                    <label>Notas de primer parcial</label>
                    <input type="int" class="form-control" name="Nota1" id="Nota1" placeholder="Diga la nota del primer parcial">
                    
                </div>
                
                <!-->Ingreso de la nota del segundo parcial</!-->
                <div class="form-group">
                    <label>Notas del segundo parcial</label>
                    <input type="int" class="form-control" name="Nota2" id="Nota2" placeholder="Diga la nota del Ssgundo parcial">
                    
                </div>
                
                <!-->Ingreso de la nota de actividades</!-->
                <div class="form-group">
                    <label>Notas del segundo parcial</label>
                    <input type="int" class="form-control" name="Actividades" id="Actividades" placeholder="Diga la nota de las actividades">
                    
                </div>
                
                <!-->Ingreso de la nota de examen final</!-->
                <div class="form-group">
                    <label>Nota del examen final</label>
                    <input type="int" class="form-control" name="examen final" id="examen final" placeholder="Diga la nota del examen final">
                    
                </div>
                
                <!-->Ingreso de la nota de examen de reposicion</!-->
                <div class="form-group">
                    <label>Nota del examen de reposicion</label>
                    <input type="int" class="form-control" name="reposicion" id="reposicion" placeholder="Diga la nota del examen de reposicion">
                    
                </div>
                
            </form>

        </div>
    </body>
</html>
