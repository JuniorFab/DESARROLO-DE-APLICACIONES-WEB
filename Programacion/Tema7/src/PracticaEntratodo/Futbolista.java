/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaEntratodo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author DAW
 */
public class Futbolista implements Deportista{
    private String nombre;
    private int Edad;
    private Posicions posicion;
    private int anyosPrefesional;
    private int numeroTtrofeos;
    private Set<String > equipos;

    public Futbolista(String nombre, int Edad, Posicions posicion, int anyosPrefesional, int numeroTtrofeos) {
        this.nombre = nombre;
        this.Edad = Edad;
        this.posicion = posicion;
        this.anyosPrefesional = anyosPrefesional;
        this.numeroTtrofeos = numeroTtrofeos;
        this.equipos = new HashSet<String>();
    }
    
    

    public Futbolista(String nombre, int Edad, Posicions posicion) {
        this.nombre = nombre;
        this.Edad = Edad;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public Posicions getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicions posicion) {
        this.posicion = posicion;
    }
    public void agregarequipo(String nombreEquipo){
        
    
    }

    @Override
    public int getAnyosProfesional() {
         return anyosPrefesional;
    }

    @Override
    public Set<String> listaequipos() {
        return new HashSet<String>(this.equipos);
    }

    @Override
    public int getTotalTrofeos() {
        return numeroTtrofeos;
    }

    @Override
    public String toString() {
        return "Futbolista{" + "nombre=" + nombre + ", Edad=" + Edad + ", posicion=" + posicion + ", anyosPrefesional=" + anyosPrefesional + ", numeroTtrofeos=" + numeroTtrofeos + ", equipos=" + equipos + '}';
    }
    
}
