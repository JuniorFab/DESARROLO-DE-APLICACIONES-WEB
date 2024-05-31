/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafetera;

/**
 *
 * @author Alfonso
 */
public class Cafetera implements Comparable<Cafetera> {

    private int capacidadMaxima;
    private int capacidadActual;
    private double precio;
    private String marca;

    public Cafetera() {

        this.capacidadMaxima = 1000;
        this.capacidadActual = 0;
        this.precio = 0;

    }

    public Cafetera(String Marca) {
        this.marca = Marca;
        this.capacidadMaxima = 1000;
        this.capacidadActual = 0;
        this.precio = 0;

    }

    public Cafetera(int capMax) {

        this();
        this.capacidadMaxima = capMax;
        this.capacidadActual = capMax;

    }

    public Cafetera(int capMax, int capAct) {

        this(capMax);

        if (capAct > capMax) {

            this.capacidadActual = capMax;

        } else {

            this.capacidadActual = capAct;

        }

    }

    public Cafetera(int capacidadMaxima, int capacidadActual, double precio) {
        this(capacidadMaxima, capacidadActual);
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadMaxima() {
        return this.capacidadMaxima;
    }

    public int getCapacidadActual() {
        return this.capacidadActual;
    }

    public void setCapacidadMaxima(int capMax) {
        this.capacidadMaxima = capMax;
    }

    public void setCapacidadActual(int capAct) {
        this.capacidadActual = capAct;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void llenarCafetera() {

        this.capacidadActual = this.capacidadMaxima;

    }

    public void servirTaza(int cant) {

        if (cant > this.capacidadActual) {

            this.capacidadActual = 0;

        } else {

            this.capacidadActual -= cant;

        }

    }

    public void vaciarCafetera() {

        this.capacidadActual = 0;

    }

    public void agregarCafe(int cant) {

        if (cant + this.capacidadActual > this.capacidadMaxima) {

            this.capacidadActual = this.capacidadMaxima;

        } else {

            this.capacidadActual += cant;

        }

    }

    @Override
    public int compareTo(Cafetera c) {

             if (this.capacidadMaxima > c.capacidadMaxima) {
          return 1;
      } else if (this.capacidadMaxima < c.capacidadMaxima) {

         return -1;

      } else {

          return 0;

       }



    }

    @Override
    public String toString() {

        String info = "/n Marca " + marca;
        return info;
    }

}
