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

public class ManejoAsig {
    public void AgregarAsig(int Asig, String Codigo_Curso,int Carnet,String fecha){
    ConexionAsig nuevo = new ConexionAsig();
    String instruccion="insert into asig(Asig,Codigo_curso,Carnet,fecha) values('"+Asig+"','"+Codigo_Curso+"','"+Carnet+"','"+fecha+"')";
    Connection con = nuevo.conectar();
        try {
              Statement cn = con.createStatement();
            try {
                ResultSet rs = cn.executeQuery(instruccion);
                 cn.executeUpdate(instruccion);
                cn.close();
                con.close();
                nuevo.desconectar();
            } catch (SQLException e) {
                Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, e);
            }
        } catch (SQLException e) {
             Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, e);
        }
    
    }
    
    public ArrayList<Asginaciones>ListAsig(){
    ArrayList<Asginaciones> asig = new ArrayList();
    Asginaciones nuevo;
    ConexionAsig n = new ConexionAsig();
    String isntruccion="select from asignaciones order by asignaciones";
    Connection on= n.conectar();
        try {
            Statement cn = on.createStatement();
            try {
                ResultSet rs = cn.executeQuery(isntruccion);
                while (rs.next()) {
                    nuevo= new Asginaciones(rs.getInt("Asginacion"),rs.getString("Codigo_curso"),rs.getInt("carnet"),rs.getString("fecha"));
                    asig.add(nuevo);
                }
                rs.close();
                cn.close();
                on.close();
                n.desconectar();
            } catch (SQLException e) {
                Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, e);
            }
        } catch (SQLException e) {
            Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, e);
        }
        return asig;
    }
}
