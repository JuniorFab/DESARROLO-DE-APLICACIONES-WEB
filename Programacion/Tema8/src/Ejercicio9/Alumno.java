/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Junior Fabricio
 */
public class Alumno implements Serializable {
    private String nombre;
    private int nre;
    private String apellidos;
    private LocalDate fNac;
    private transient float notaAcceso;
    private String titulacion;
	public Alumno(){}
    	public Alumno(String nombre, String apellidos, int nre, LocalDate fecha, float notaAcceso, String titulacion) {
        this.nombre = nombre;
        this.nre = nre;
        this.apellidos = apellidos;
        this.fNac = fecha;
        this.notaAcceso = notaAcceso;
        this.titulacion = titulacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNre() {
        return nre;
    }

    public void setNre(int n) {
        this.nre = n;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getfNac() {
        return fNac;
    }

    public void setfNac(LocalDate fNac) {
        this.fNac = fNac;
    }

    public float getNotaAcceso() {
        return notaAcceso;
    }

    public void setNotaAcceso(float notaAcceso) {
        this.notaAcceso = notaAcceso;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nre=" + nre + ", apellidos=" + apellidos + ", fNac=" + fNac + ", nota acceso "+notaAcceso+", titulacion=" + titulacion + '}';
    }
}
