/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.Random;

/**
 *
 * @author daw
 */
public class Profesor extends Persona {
    //Atributos

    private Materia tipo;
    private boolean disponible;

    //Constructor
    public Profesor(Materia tipo, String nombre, int edad, String sexo) {
        super(nombre, edad, sexo);
        this.tipo = tipo;
        this.disponible = new Random().nextDouble() >= 0.2;
    }
    //Getter y setter //En este caso no ponemos metodos setter pues se deja solo los get

    public Materia getTipo() {
        return tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    @Override
    public boolean ausentarse() {
        return disponible;
    }

    @Override
    public String toString() {
        return "Profesor{" + "tipo=" + tipo + ", disponible=" + disponible + '}';
    }

    @Override
    public int compareTo(Persona o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
