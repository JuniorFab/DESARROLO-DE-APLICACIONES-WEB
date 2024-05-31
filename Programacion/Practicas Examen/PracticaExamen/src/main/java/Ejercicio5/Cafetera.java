/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Junior Fabricio
 */
public class Cafetera implements Comparable<Cafetera> {

    // Atributos
    private int capacidadMaxima;
    private int cantidadActual;

    // Constructores
    public Cafetera() {
        this.capacidadMaxima = 1000;
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

    public void agregarCafe(int cant) {
        this.cantidadActual += cant;
        if (this.cantidadActual > this.capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;
        }
    }

    // Compara cafeteras según su capacidad máxima
    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }

    @Override
    public int compareTo(Cafetera o) {
        if (this.capacidadMaxima < o.capacidadMaxima) {
            return -1;
        } else if (this.capacidadMaxima > o.capacidadMaxima) {
            return 1;
        } else {
            return 0;
        }
    }

}
