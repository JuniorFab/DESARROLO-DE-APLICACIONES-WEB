/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1Colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author daw
 */
public class Programa {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
//        
//        for (int i = 0; i < 20; i++) {
//            int numeroAleatorio;
//            do {
//                numeroAleatorio = (int) ((Math.random() * 10) + 1);
//            } while (a.contains(numeroAleatorio)); // Verificar si el número ya está en la lista
//            a.add(numeroAleatorio);
//        }

//        for (int i = 0; i < 20; i++) {
//            a.add((int) ((Math.random() * 10) + 1));
//
//        }
        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = (int) ((Math.random() * 10) + 1);
            while (a.contains(numeroAleatorio)) { // Verificar si el número ya está en la lista
                numeroAleatorio = (int) ((Math.random() * 10) + 1); // Generar otro número si ya está en la lista
            }
            a.add(numeroAleatorio);
        }
        System.out.println("Contenido de la lista ");
        for (Integer integer : a) {

            System.out.print(" " + integer.toString());

        }
        System.out.println(" AL reves");
        System.out.println(a.reversed());
        System.out.println("Ordenado de menor a mayor ");
        Comparator<Integer> Comparador = Collections.reverseOrder();
        Collections.sort(a, Comparador);
        System.out.println(a);

    }
}
