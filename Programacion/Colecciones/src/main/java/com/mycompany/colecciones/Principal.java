/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Susana Rosa susana.rosa@murciaeduca.es
 */
public class Principal {

    public static void main(String[] args) {
        Departamento p1 = new Departamento(10, "Ventas", "Murcia");
        Departamento p2 = new Departamento(20, "Compras", "Murcia");
        Departamento p3 = new Departamento(30, "Ventas", "Alicante");

//        HashSet<Departamento> set = new HashSet<>();
//
//        set.add(p1);
//
//        set.add(p1);//No lo añade aunque no se implemente equals
//        System.out.println(set);
//        set.add(new Departamento(10, "Ventas", "Murcia")); //lo añade dando a duplicados a no ser que implementemos equals
//        System.out.println(set);
        //  Collections.sort(set); En un hashset no se pueden ordenar 
//        
//               System.out.println(set);
//
        TreeSet<Departamento> set2 = new TreeSet<>();

        set2.add(p1);
        set2.add(p1);
        set2.add(p2);
        set2.add(new Departamento(20, "Compras", "Murcia"));
        System.out.println(set2);

        TreeSet<Departamento> set3 = new TreeSet<>(new Comparador());
        set3.addAll(set2);
        System.out.println("----------------------");
        System.out.println(set3);
        System.out.println("----------------------");
        TreeSet<Departamento> set4 = new TreeSet<>(new Comparator<Departamento>() {
            @Override
            public int compare(Departamento o1, Departamento o2) {
                return o1.getDnombre().compareTo(o2.getDnombre());
            } //Esto es una clase anonima pero tambien se puede hacer en una clase aparte pero mejor aprender esto asi ya que luego lo tendremos que usar mas 

        });
        set4.addAll(set2);
        System.out.println(set4); 
       

        //Para este necesita el comparable por que si no sale una excepcion
    }
}
