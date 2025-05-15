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

public class ManejoNota {

    public void agregarNota(int asignacion, int primer_Parcial, int segundo_parcial, int actividades, int examen_final, int examen_recuperacion) {
        ConexionNotas logg = new ConexionNotas();
        String instruccion = "insert into notas (asignacion,primer_Parcial,segundo_parcial,actividades,examen_final,examen_recuperacion) values ('" + asignacion
                + "','" + primer_Parcial + "','" + segundo_parcial + "','" + actividades + "','" + examen_final + "','" + examen_recuperacion + "')";
        Connection con = logg.conectar();
        try {
            Statement cn = con.createStatement();
            try {
                ResultSet rs = cn.executeQuery(instruccion);
                cn.executeUpdate(instruccion);
                cn.close();
                con.close();
                logg.desconectar();
            } catch (SQLException e) {
                Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, e);
            }
        } catch (SQLException e) {
            Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public ArrayList<Notas> ListaNotas() {
        ArrayList<Notas> notas = new ArrayList();
        Notas nuevas;
        ConexionNotas Nuevo = new ConexionNotas();
        String instruccion = "select from Notas order by notas";
        Connection on = Nuevo.conectar();
        try {
            Statement cn = on.createStatement();
            try {
                ResultSet rs = cn.executeQuery(instruccion);
                while (rs.next()) {
                    nuevas = new Notas(rs.getInt("asignacion"), rs.getInt("primer_Parcial"), rs.getInt("segundo_parcial"), rs.getInt("actividades"),
                            rs.getInt("examen_final"), rs.getInt("examen_recuperacion"));
                    notas.add(nuevas);
                }
                rs.close();
                cn.close();
                on.close();
                Nuevo.desconectar();
            } catch (SQLException e) {
                Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, e);
            }
        } catch (SQLException e) {
            Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, e);
        }
        return notas;
    }
}
