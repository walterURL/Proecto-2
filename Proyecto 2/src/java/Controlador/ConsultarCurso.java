/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Curso;
import Modelo.ManejoCurso;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author walte
 */
public class ConsultarCurso {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    ManejoCurso ne = new ManejoCurso();
    String c= request.getParameter("Guargar");
    Curso nuevo = ne.ManejoC(c);
    request.setAttribute("Codigo_curso", nuevo.getCreditos());
    request.setAttribute("Nombre_Curso",nuevo.getNombre_curso());
    request.setAttribute("creditos", nuevo.getCreditos());
    request.getRequestDispatcher("tablaCurso.jsp").forward(request, response);
    }
}
