/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7;

/**
 *
 * @author daw
 */
public class Cafetera {
     // Atributos
    private int capacidadMaxima;
    private int cantidadActual;
    
    // Constructores
    public Cafetera() {
        this.capacidadMaxima = 2000;
        this.cantidadActual = 0;
    }
    
    public Cafetera(int capMaxima) {
        this.capacidadMaxima = capMaxima;
        this.cantidadActual = capMaxima;
    }
    
    public Cafetera(int capMaxima, int cantAct) {
        this.capacidadMaxima = capMaxima;
        if (cantAct > capMaxima) {
            this.cantidadActual = capMaxima;
        } else {
            this.cantidadActual = cantAct;
        }
    }
    
    // Getters y Setters

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    // Métodos
    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }
    
    public void servirTaza(int cant) {
        if (cant > this.cantidadActual) {
            this.cantidadActual = 0;
        } else {
            this.cantidadActual -= cant;
        }
    }
    
    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }
    
    public void agregarCafe(int cant) throws Exception {
        this.cantidadActual += cant;
        if (this.cantidadActual > this.capacidadMaxima) {
            //this.cantidadActual = this.capacidadMaxima;
            throw new DesbordamientoExcepcion("Se desborda la cafetera.");
        }
    }
}
