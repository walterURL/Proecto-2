/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import Modelo.ManejoCurso;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // ManejoDatos modelo = new ManejoDatos();
        String accion = request.getParameter("accion");
        // String user = request.getParameter("user");
        // String pass = request.getParameter("pass");
        //String resultado = modelo.ValidaUsuario1(user, pass);
        switch (accion) {
            case "estudiantes" -> {
                request.getRequestDispatcher("CRUDEstudiante.jsp").forward(request, response);
            }
            case "usuarios" -> {
                request.getRequestDispatcher("CRUDUsuarios.jsp").forward(request, response);
            }
            case "asignacion" -> {
                request.getRequestDispatcher("CRUDAsignaciones.jsp").forward(request, response);
            }
            case "cursos" -> {
                        ManejoCurso curso = new ManejoCurso();

                        request.setAttribute("listado", curso.ListcaC());
                request.getRequestDispatcher("CRUDCurso.jsp").forward(request, response);
                
            }
            case "Notas" -> {
                request.getRequestDispatcher("CRUDNotas.jsp").forward(request, response);
            }
            case "Mostrar" -> {
            }
            case "Tcursos"->{
            request.getRequestDispatcher("tablaCurso.jsp").forward(request, response);
            }

            default ->
                throw new AssertionError();
        }

//        if(resultado.equals("ok")){
//            request.setAttribute("listado", modelo.ListaUsuarios());
//            request.getRequestDispatcher("CRUDUsuarios.jsp").forward(request, response);
//        }
//        else{
//            response.sendRedirect("index.html");
//        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
