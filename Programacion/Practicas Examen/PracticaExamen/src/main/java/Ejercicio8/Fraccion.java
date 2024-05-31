/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

import Ejercicio2Relaciones.*;

/**
 *
 * @author daw
 */
public class Fraccion implements Relaciones, Comparable<Fraccion> {

    //Atributo
    private int numerador;
    private int denominador;
    //Constructor

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    public Fraccion() {
    }

    //Getter y Setter
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    //Metodos
    public Fraccion suma(Fraccion f) {

        return new Fraccion((this.numerador * f.denominador) + (this.denominador * f.numerador), this.denominador * f.denominador);

    }
    //Metodos sobre escritos

    @Override
    public boolean esMayor(Object b) {
        if (b == null || !(b instanceof Fraccion)) {
            return false;
        }

        Fraccion f = (Fraccion) b;
        // Comparación de fracciones
        return this.numerador * f.denominador > f.numerador * this.denominador;
    }

    @Override
    public boolean esMenor(Object b) {
        if (b == null || !(b instanceof Fraccion)) {
            return false;
        }

        Fraccion f = (Fraccion) b;
        // Comparación de fracciones
        return this.numerador * f.denominador < f.numerador * this.denominador;
    }

    @Override
    public boolean esIgual(Object b) {
        if (b == null || !(b instanceof Fraccion)) {
            return false;
        }

        Fraccion f = (Fraccion) b;
        // Comparación de fracciones
        return this.numerador * f.denominador == f.numerador * this.denominador;
    }

    @Override
    public String toString() {
        return "Fraccion{" + "numerador=" + numerador + ", denominador=" + denominador + '}';
    }

    @Override
    public int compareTo(Fraccion o) {
        if (this.esMenor(o)) {
            return 1;
        } else if (this.esMayor(o)) {
            return -1;
        } else {
            return 0;
        }
    }

}
