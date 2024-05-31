/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

import java.util.ArrayList;

/**
 *
 * @author Junior Fabricio
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        //El polimorfismo permite:
        Relaciones r1 = new Linea(2, 2, 4, 1);
        Relaciones r2 = new Fraccion(4, 7);
        ArrayList<Relaciones> array = new ArrayList();
        array.add(new Linea(15, 3, 9, 5));
        array.add(new Fraccion(10, 7));
        array.add(new Fraccion(6, 25));
        array.add(new Linea(3, 4, 10, 15));
        array.add(new Fraccion(8, 3));
        array.add(new Linea(0, 7, 1, 4));
        array.add(new Linea(2, -1, 3, 5));
        array.add(new Fraccion(1, 9));
        array.add(new Linea(1, 9, 0, -3));
        array.add(new Fraccion(3, 8));
        array.add(new Fraccion(-2, 3));

        for (Relaciones r : array) {
            System.out.println(r.nombreClase());
            System.out.println(r);
            System.out.println("");
        }

    }
}
