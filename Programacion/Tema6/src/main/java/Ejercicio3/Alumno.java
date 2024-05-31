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
import java.util.Random;

public class Alumno extends Persona implements Comparable<Alumno> {

    // Atributo
    private double nota;

    // Constructor
    public Alumno(double nota, String nombre, int edad, String sexo) {
        super(nombre, edad, sexo);
        rango(nota);
    }

    // Getter y Setter
    public double getNota() {
        return nota;
    }
    
    public void setNota(double nota) {
        rango(nota);
    }
    
    public void rango(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        }
    }
    
    @Override
    public boolean ausentarse() {
        return new Random().nextDouble() < 0.5;
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "nota=" + nota + '}';
    }
    
}
