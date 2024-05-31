/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1Figuras;

/**
 *
 * @author daw
 */
public class Rectangulo extends Figura {

    //Constructor
    public Rectangulo(int x, int y, int ancho, int alto) {
        super(x, y, ancho, alto);
    }
    //Metodos

    @Override
    public double area() {
        //Area=Alto*Ancho
        //perimetro Alt`2+ancho2

        return this.getAlto() * this.getAncho();

    }

    @Override
    public double perimetro() {
        return Math.pow(0, 0);
    }

}
