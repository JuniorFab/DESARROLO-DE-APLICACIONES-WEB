package com.mycompany.exceptiones;

public class Cafetera {
    // Atributos
    private  int capacidadMaxima;
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

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Cafetera other = (Cafetera) obj;
//        if (this.capacidadMaxima != other.capacidadMaxima) {
//            return false;
//        }
//        return this.cantidadActual == other.cantidadActual;
//    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.capacidadMaxima;
        hash = 71 * hash + this.cantidadActual;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cafetera other = (Cafetera) obj;
        if (this.capacidadMaxima != other.capacidadMaxima) {
            return false;
        }
        return this.cantidadActual == other.cantidadActual;
    }
    
}
