/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1Figuras;

/**
 *
 * @author daw
 */
public class Circulo extends Figura {

    //Atributos
    private int radio;

    //Constructor
    public Circulo(int radio, int x, int y, int ancho, int alto) {
        super(x, y, ancho, alto);
        this.radio = radio;
    }
    //Getter & Setter

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    //Metodos

    @Override
    public double area() {
        return Math.PI * ((this.getAlto() / 2) * (this.getAncho() / 2));
    }

    @Override
    public double perimetro() {
        //2*pi*ancho/2
        return (2 * Math.PI) * (this.getAncho() / 2);
    }

}
