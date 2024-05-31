/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Junior Fabricio
 */
public class Principal {

    public static void main(String[] args) {
        ArrayList<Cafetera> a = new ArrayList();
        Cafetera b = new Cafetera(400, 100);
        Cafetera c = new Cafetera(100, 50);
        Cafetera d = new Cafetera(4000, 1000);
        Cafetera e = new Cafetera(15, 10);
        a.add(b);
        a.add(c);
        a.add(d);
        a.add(e);
        System.out.println("Orden normal");
        System.out.println(a);
        System.out.println("Orden natural");
        Collections.sort(a);
        System.out.println(a);
        System.out.println("Otro orden que hice aparte ");
        Collections.sort(a, new OrdenCapActual());
        System.out.println(a);
    }
}
