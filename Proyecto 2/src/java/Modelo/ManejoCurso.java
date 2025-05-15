/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ManejoCurso {
    
    public void AgregarCurso(int codigo, String Nombre_Curso,int creditos){
       ConexionCurso loog = new ConexionCurso();
    String instruccion= "insert into Cursos (codigo, Nombre_curso,creditos) values('"+codigo
            +"','" +Nombre_Curso+"','" +creditos+"')";
    Connection con = loog.conectar();
        try {
            Statement cn = con.createStatement();
            try {
                ResultSet rs = cn.executeQuery(instruccion);
                 cn.executeUpdate(instruccion);
                cn.close();
                con.close();
                loog.desconectar();
            } catch (SQLException e) {
                 Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, e);
            }
        } catch (SQLException e) {
            Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, e);
        }
    
    }
    public ArrayList<Curso> ListcaC(){
    ArrayList<Curso> cursos= new ArrayList();
    Curso nuevo;
     ConexionCurso lo =new ConexionCurso();
    String instruccion = "select * from cursos order by codigo";
   Connection on =lo.conectar();
        try {
            Statement cn = on.createStatement();
            try {
                ResultSet rs = cn.executeQuery(instruccion);
                 while(rs.next()){
                    nuevo = new Curso(rs.getInt("codigo"),rs.getString("Nombre_curso"),rs.getInt("creditos"));
                    cursos.add(nuevo);                    
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
        return cursos;
    }
    
    public Curso ManejoC(String curso){
    Curso n;
    String consulta;
    ConexionCurso conexion=new ConexionCurso();
    consulta="select * from cursos where cursos='"+curso+"'";
    Connection con = conexion.conectar();
        try {
            Statement cn = con.createStatement();
            try {
                ResultSet rs = cn.executeQuery(consulta);
                while (rs.next()) {
                    n= new Curso(rs.getInt("Codigo_curso"),rs.getString("Nombre_curso"),rs.getInt("creditos"));
                    rs.close();
                    cn.close();
                    con.close();
                    conexion.desconectar();
                    return n;
                }
            } catch (SQLException e) {
                Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, e);
            }
        } catch (SQLException e) {
            Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
}
