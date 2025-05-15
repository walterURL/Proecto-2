/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.ManejoCurso;

import jakarta.servlet.RequestDispatcher;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
@WebServlet(name = "addCurso", urlPatterns = {"/addCurso"})
public class addCurso extends HttpServlet{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ManejoCurso curso = new ManejoCurso();
        String Nmateria = request.getParameter("Nmateria");
        String Idmateria = request.getParameter("Idmateria");
        String Ccreditos = request.getParameter("Ccreditos");
        int Materia = Integer.parseInt(Idmateria);
        int Creditos = Integer.parseInt(Ccreditos);
        curso.AgregarCurso(Materia, Nmateria, Creditos);
        request.setAttribute("listado", curso.ListcaC());
        request.getRequestDispatcher("tablaCurso.jsp").forward(request, response);
        //Solucionar error a la hora de impimir los cursos
    
    }
    
    protected void MostrarCurso (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    ManejoCurso c = new ManejoCurso();
   String user;
}
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    {
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
