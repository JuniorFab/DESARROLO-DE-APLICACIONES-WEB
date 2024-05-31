/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Junior Fabricio
 */
public class Comprabar {

    public static void main(String[] args) {
        ArrayList<Punto> a = new ArrayList();
        Punto b = new Punto(5, 10);
        Punto c = new Punto(3, 20);
        Punto d = new Punto(10, 3);
        Punto e = new Punto(8, 5);
        a.add(b);
        a.add(c);
        a.add(d);
        a.add(e);

        Collections.sort(a);
        System.out.println(a);

        Collections.sort(a, new OrdenDeX());
        System.out.println(a);

    }
}
