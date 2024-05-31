/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptiones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daw
 */
public class App {

    public static void main(String[] args) {
        List<Cafetera> tienda = new ArrayList<>();
        tienda.add(new Cafetera());
        Cafetera c1 = new Cafetera();
        Cafetera c2 = new Cafetera();
        tienda.add(c1);
        tienda.add(c2);
        if (!tienda.isEmpty()) {
            System.out.println("La lista no esta vacia ");
        }
        if (tienda.contains(c1)) {
            System.out.println("El obejto esta en la lista");

        }

        tienda.remove(c2);
        System.out.println(tienda.size());

    }
}
