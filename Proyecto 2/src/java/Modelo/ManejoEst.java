/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author walte
 */
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoEst {

    public void AgregarEst(int Carnet, String Nombre_completo, String Direccion, int Telefono, String Correo_electronico) {
        ConexionEst log = new ConexionEst();
        String instruccion = "insert into Estudiantes (carnet,Nombre_Curso,Direccion,Telefono,Correo_electronico) values('" + Carnet + "','" + Nombre_completo
                + "','" + Direccion + "','" + Telefono + "','" + Correo_electronico + "',)";
        Connection con = log.conectar();
        try {
            Statement cn = con.createStatement();
            try {
                ResultSet rs = cn.executeQuery(instruccion);
                cn.executeUpdate(instruccion);
                cn.close();
                con.close();
                log.desconectar();
            } catch (SQLException e) {
                Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, e);
            }
        } catch (SQLException e) {
            Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public ArrayList<Estudiante> ListaEst() {
        ArrayList<Estudiante> est = new ArrayList();
        Estudiante nuevo;
        ConexionEst lo = new ConexionEst();
        String isntruccion = "select from estudiantes order by estudiantes";
        Connection on = lo.conectar();
        try {
            Statement cn = on.createStatement();
            try {
                ResultSet rs = cn.executeQuery(isntruccion);
                while (rs.next()) {
                    nuevo = new Estudiante(rs.getInt("carnet"), rs.getString("Nombre_completo"), rs.getString("Direccion"),
                            rs.getInt("Telefono"), rs.getString("Correo_electronico"));
                    est.add(nuevo);
                }
                rs.close();
                cn.close();
                on.close();
                lo.desconectar();
            } catch (SQLException e) {
                Logger.getLogger(ManejoCurso.class.getName()).log(Level.SEVERE, null, e);
            }
        } catch (SQLException e) {
            Logger.getLogger(ManejoCurso.class.getName()).log(Level.SEVERE, null, e);
        }
        return est;
    }

}
