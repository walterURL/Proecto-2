/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author walte
 */
public class Curso {
    private int codigo;
    private String Nombre_curso;
    private  int creditos;

    public Curso(int Codigo_curso, String Nombre_curso, int creditos) {
        this.codigo = Codigo_curso;
        this.Nombre_curso = Nombre_curso;
        this.creditos = creditos;
    }

    public Curso() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCodigo_curso() {
        return codigo;
    }

    public void setCodigo_curso(int Codigo_curso) {
        this.codigo = Codigo_curso;
    }

    public String getNombre_curso() {
        return Nombre_curso;
    }

    public void setNombre_curso(String Nombre_curso) {
        this.Nombre_curso = Nombre_curso;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    
}
