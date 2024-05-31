/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author Junior Fabricio
 */
public class Linea implements Relaciones {

    private double x1, x2, y1, y2;

    public Linea(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double longitud() {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    @Override
    public boolean esMayor(Object b) {
        if (b == null) {
            return false;
        }
        if (!(b instanceof Linea)) {
            return false;
        }
        Linea a = (Linea) b;
        return this.longitud() > a.longitud();
    }

    @Override
    public boolean esMenor(Object b) {
        if (b == null) {
            return false;
        }
        if (!(b instanceof Linea)) {
            return false;
        }
        Linea a = (Linea) b;
        return this.longitud() < a.longitud();
    }

    @Override
    public boolean esIgual(Object b) {
        if (b == null) {
            return false;
        }
        if (!(b instanceof Linea)) {
            return false;
        }
        Linea a = (Linea) b;
        return this.longitud() == a.longitud();
    }

    @Override
    public String toString() {
        return "Linea{" + "x1=" + x1 + ", x2=" + x2 + ", y1=" + y1 + ", y2=" + y2 + ", Longitud= " + longitud() + '}';
    }

}
