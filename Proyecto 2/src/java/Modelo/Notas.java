/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author walte
 */
public class Notas {
    private int asginacion;
    private int primer_parcial;
    private int segundo_parcial;
    private int actividades;
    private int examen_final;
    private int examen_repuperacion;

    public Notas(int asginacion, int primer_parcial, int segundo_parcial, int actividades, int examen_final, int examen_repuperacion) {
        this.asginacion = asginacion;
        this.primer_parcial = primer_parcial;
        this.segundo_parcial = segundo_parcial;
        this.actividades = actividades;
        this.examen_final = examen_final;
        this.examen_repuperacion = examen_repuperacion;
    }

    public int getAsginacion() {
        return asginacion;
    }

    public void setAsginacion(int asginacion) {
        this.asginacion = asginacion;
    }

    public int getPrimer_parcial() {
        return primer_parcial;
    }

    public void setPrimer_parcial(int primer_parcial) {
        this.primer_parcial = primer_parcial;
    }

    public int getSegundo_parcial() {
        return segundo_parcial;
    }

    public void setSegundo_parcial(int segundo_parcial) {
        this.segundo_parcial = segundo_parcial;
    }

    public int getActividades() {
        return actividades;
    }

    public void setActividades(int actividades) {
        this.actividades = actividades;
    }

    public int getExamen_final() {
        return examen_final;
    }

    public void setExamen_final(int examen_final) {
        this.examen_final = examen_final;
    }

    public int getExamen_repuperacion() {
        return examen_repuperacion;
    }

    public void setExamen_repuperacion(int examen_repuperacion) {
        this.examen_repuperacion = examen_repuperacion;
    }
    
    
}
