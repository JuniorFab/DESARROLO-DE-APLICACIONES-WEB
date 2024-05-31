/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3Interfaces;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Junior Fabricio
 */
public class Usafraccion {

    public static void main(String[] args) {
        ArrayList<Fraccion> a = new ArrayList();

        Fraccion f1 = new Fraccion(3, 4);
        Fraccion f2 = new Fraccion(1, 2);
        Fraccion f3 = new Fraccion(5, 8);

        System.out.println("Fracción 1: " + f1);
        System.out.println("Fracción 2: " + f2);
        System.out.println("Fracción 3: " + f3);

        System.out.println("Comparación de fracciones:");
        System.out.println("f1.compareTo(f2): " + f1.compareTo(f2));
        System.out.println("f1.compareTo(f3): " + f1.compareTo(f3));
        System.out.println("f2.compareTo(f3): " + f2.compareTo(f3));

    }
}
