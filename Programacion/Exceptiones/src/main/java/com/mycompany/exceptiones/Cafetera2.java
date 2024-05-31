/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptiones;

/**
 *
 * @author Daw
 */
public class Cafetera2 {

    private static int capacidadMaxima = 2000;
    private int cantidadActual = 100;

    public Cafetera2() {
        this.cantidadActual = 0;
    }

    public static int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public static void setCapacidadMaxima(int capacidadMaxima) {
        Cafetera2.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

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
//            this.cantidadActual = this.capacidadMaxima;
            throw new DesbordamientoException("Se ha desbordado la cafetera");
        }
    }

}
