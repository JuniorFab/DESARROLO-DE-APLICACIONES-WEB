/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1Figuras;

/**
 *
 * @author daw
 */
public abstract class Figura {
    //Atributos
    private int x;
    private int y;
    private int ancho;
    private int alto;
        //Constructores
    public Figura(int x, int y, int ancho, int alto) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }
    //getter & Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    //Metodos
    //Si no tenmos puesto abstract directamente en la clase, pues si ponemos un metodo abstracto te obliga a poner la clase entera abstracto
    public abstract double area();
    public abstract double perimetro();
    
}
