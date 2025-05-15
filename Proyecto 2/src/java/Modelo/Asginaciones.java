/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author walte
 */
public class Asginaciones {
    private int asignacion;
    private String codico_curso;
    private int carnet;
    private String fecha;

    public int getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(int asignacion) {
        this.asignacion = asignacion;
    }

    public String getCodico_curso() {
        return codico_curso;
    }

    public void setCodico_curso(String codico_curso) {
        this.codico_curso = codico_curso;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Asginaciones(int asignacion, String codico_curso, int carnet, String fecha) {
        this.asignacion = asignacion;
        this.codico_curso = codico_curso;
        this.carnet = carnet;
        this.fecha = fecha;
    }
    
    
}
