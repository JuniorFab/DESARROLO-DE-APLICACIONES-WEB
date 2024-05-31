/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioschatgpt;

/**
 *
 * @author Junior Fabricio
 */
public class Pagos implements Comparable<Pagos> {

    private double cantidad;
    private MetodoDePago a;

    public Pagos(double cantidad, MetodoDePago a) {
        this.cantidad = cantidad;
        this.a = a;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public MetodoDePago getA() {
        return a;
    }

    public void setA(MetodoDePago a) {
        this.a = a;
    }

    @Override
    public int compareTo(Pagos o) {
        if (this.cantidad < o.cantidad) {
            return -1;

        } else if (this.cantidad > o.cantidad) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Pagos{" + "cantidad=" + cantidad + ", MetodoPago=" + a + '}';
    }

}
