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

/**
 *
 * @author KZeaR
 */
public class ManejoDatos {

    public ManejoDatos() {
    }
    public String TrabajarDatos(String dato1, String dato2){
        return dato1 + " - " + dato2;
    }
    
    public String ValidaUsuario(String usuario, String pass){
        if(usuario.equals("kezea@gmail.com")&&pass.equals("url123")){
            return "ok";
        }
        else{
            return "no";
        }
    }
    
    public String ValidaUsuario1(String usuario, String pass){
        String consulta;
        ConexionBDD conexion = new ConexionBDD();
        
        consulta = "select * from usuarios where usuario = '" + usuario + 
                "' and password = '" + pass + "'";
        Connection con = conexion.conectar();
        try {
            Statement cn = con.createStatement();
            try {
                ResultSet rs = cn.executeQuery(consulta);
                while(rs.next()){
                    rs.close();
                    cn.close();
                    con.close();
                    conexion.desconectar();
                    return "ok";
                }
            } catch (SQLException ex) {
                Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "no";
    }
    
    public void AgregarDatos(String usuario, String password){
        String instruccion;
        ConexionBDD conexion = new ConexionBDD();
        Connection con = conexion.conectar();
        instruccion="insert into usuarios (usuario, password) values('" +
                usuario + "','" + password + "')";
        try {
            Statement cn = con.createStatement();
            try {
                cn.executeUpdate(instruccion);
                cn.close();
                con.close();
                conexion.desconectar();
            } catch (SQLException ex) {
                Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ActualizarDatos(String usuario, String password){
        String instruccion;
        ConexionBDD conexion = new ConexionBDD();
        Connection con = conexion.conectar();
        instruccion="update usuarios set password = '" +
                password + "' where usuario = '" + usuario + "'";    
        try {
            Statement cn = con.createStatement();
            try {
                cn.executeUpdate(instruccion);
                cn.close();
                con.close();
                conexion.desconectar();
            } catch (SQLException ex) {
                Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void EliminarDatos(String usuario, String password){
        String instruccion;
        ConexionBDD conexion = new ConexionBDD();
        Connection con = conexion.conectar();
        instruccion="delete usuarios where usuario = '" + usuario + "'"; 
        try {
            Statement cn = con.createStatement();
            try {
                cn.executeUpdate(instruccion);
                cn.close();
                con.close();
                conexion.desconectar();
            } catch (SQLException ex) {
                Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Usuario> ListaUsuarios(){
        ArrayList<Usuario> ListaUsuarios = new ArrayList();
        Usuario u;
        String consulta;
        ConexionBDD conexion = new ConexionBDD();
        consulta = "select * from usuarios order by usuario";
        Connection con = conexion.conectar();
        try {
            Statement cn = con.createStatement();
            try {
                ResultSet rs = cn.executeQuery(consulta);
                while(rs.next()){
                    u = new Usuario(rs.getString("usuario"),rs.getString("password"));
                    ListaUsuarios.add(u);                    
                }
                rs.close();
                cn.close();
                con.close();
                conexion.desconectar();
            } catch (SQLException ex) {
                Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ListaUsuarios;
    }

    public Usuario ConsultaUsuarios(String usuario){
        Usuario u;
        String consulta;
        ConexionBDD conexion = new ConexionBDD();
        consulta = "select * from usuarios where usuario = '" + usuario + "'";
        Connection con = conexion.conectar();
        try {
            Statement cn = con.createStatement();
            try {
                ResultSet rs = cn.executeQuery(consulta);
                while(rs.next()){
                    u = new Usuario(rs.getString("usuario"),rs.getString("password"));
                    rs.close();
                    cn.close();
                    con.close();
                    conexion.desconectar();
                    return u;
                }
            } catch (SQLException ex) {
                Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
