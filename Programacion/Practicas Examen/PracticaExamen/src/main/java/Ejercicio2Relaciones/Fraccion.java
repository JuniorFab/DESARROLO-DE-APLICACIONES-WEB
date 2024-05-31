/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2Relaciones;

/**
 *
 * @author daw
 */
public class Fraccion implements Relaciones {

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
        if (b == null) {
            return false;

        }
        if (!(b instanceof Fraccion)) {
            return false;

        }
        Fraccion f = (Fraccion) b;
        return  true ;
    }

    @Override
    public boolean esMenor(Object b) {
        return false;
    }

    @Override
    public boolean esIgual(Object b) {
        return false;
    }

    @Override
    public String toString() {
        return "Fraccion{" + "numerador=" + numerador + ", denominador=" + denominador + '}';
    }

}
