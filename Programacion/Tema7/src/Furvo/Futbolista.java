/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Furvo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Junior Fabricio
 */
public class Futbolista implements Deportista {

    //Atributos
    private String Nombre;
    private int edad;
    private Posiciones posicion;
    private int anyosPrefisionaL;
    private Set<String> equipos;
    private int trofeos;

    public Futbolista(String Nombre, int edad, Posiciones posicion) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Futbolista(String Nombre, int edad, Posiciones posicion, int anyosPrefisionaL, int trofeos) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.anyosPrefisionaL = anyosPrefisionaL;
        this.equipos = new HashSet<>();
        this.trofeos = 0;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    public void agregarEquipo(String equipo) {
        this.equipos.add(equipo);
    }

    @Override
    public int getAnyiosProfesional() {

        return this.anyosPrefisionaL;
    }

    @Override
    public Set<String> getListadoEquipos() {
        return new HashSet<>(this.equipos);
    }

    @Override
    public int getTotalTrofeos() {
        return this.trofeos;
    }

    @Override
    public String toString() {
        return "Futbolista{" + "Nombre=" + Nombre + ", edad=" + edad + ", posicion=" + posicion + ", anyosPrefisionaL=" + anyosPrefisionaL + ", equipos=" + equipos + ", trofeos=" + trofeos + '}';
    }

}
