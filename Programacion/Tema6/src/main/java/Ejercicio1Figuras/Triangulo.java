/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1Figuras;

/**
 *
 * @author daw
 */
public class Triangulo extends Figura {
    //Constrcuctor

    public Triangulo(int x, int y, int ancho, int alto) {
        super(x, y, ancho, alto);
    }

    @Override
    public double area() {
        return (this.getAlto() * this.getAncho()) / 2;
    }

    @Override
    public double perimetro() {
        return this.getAncho() * 3;
    }

    public void mostrar() {
        System.out.println("Muestro algo ");
    }
}
