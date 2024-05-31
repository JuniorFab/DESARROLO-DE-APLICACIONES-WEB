package com.mycompany.colecciones;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Susana Rosa susana.rosa@murciaeduca.es
 */
public class Principal2 {

    public static void main(String[] args) {
        HashMap<Coche, Integer> mapa = new HashMap<>();
        mapa.put(new Coche("Seat", "Rojo"), 3);
        mapa.put(new Coche("Cupra", "Blanco"), 3);
        mapa.put(new Coche("Cupra", "Blanco"), 6);
        System.out.println(mapa);
        //La clase Color debe implementar equals para evitar claves duplicadas

        if (mapa.containsKey(new Coche("Seat", "Rojo"))) {
            System.out.println("Clave contenida");
        }
        if (mapa.containsValue(3)) {
            System.out.println("Valor contenido");
        }
        //Recorrido
        Set<Map.Entry<Coche, Integer>> entrada = mapa.entrySet();

        for (Map.Entry<Coche, Integer> ele : entrada) {
            System.out.print(ele.getKey());
            System.out.println(" " + ele.getValue());
        }
        for (Map.Entry<Coche, Integer> coches : mapa.entrySet()) {
            System.out.print(coches.getKey());
            System.out.println(" " + coches.getValue());
        }
        for (Map.Entry<Coche, Integer> e : mapa.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }

//        System.out.println("---------------------------------------------------");
        TreeMap<Coche, Integer> arbol = new TreeMap<>();
        arbol.put(new Coche("Cupra", "Rojo"), 3);
        arbol.put(new Coche("Seat", "Rojo"), 3);
        arbol.put(new Coche("Cupra", "Blanco"), 3);
        arbol.put(new Coche("Cupra", "Blanco"), 6);
        System.out.println(arbol);
        //La clase Color debe implementar compareTo para evitar la exception java.lang.ClassCastException
        //Recorrido
        for (Map.Entry<Coche, Integer> coches : arbol.entrySet()) {
            System.out.print(coches.getKey());
            System.out.println(" " + coches.getValue());
        }
        for (Iterator<Map.Entry<Coche, Integer>> iterator = entrada.iterator(); iterator.hasNext();) {
            Map.Entry<Coche, Integer> next = iterator.next();
            if (next.getKey().equals(new Coche("Seat", "Rojo") )) {
                iterator.remove();

            }

            
        }
        Iterator<Map.Entry<Coche, Integer>> iterador = mapa.entrySet().iterator();
        while (iterador.hasNext()) {
            Map.Entry<Coche, Integer> ele = iterador.next();
            
            if (ele.equals(new Coche("Cupra", "Blanco"))) {
                iterador.remove();
            }
            
           
        }
         System.out.println("Despues de borrar");
            for (Map.Entry<Coche, Integer> coches : arbol.entrySet()) {
                System.out.print(coches.getKey());
                System.out.println(" " + coches.getValue());

            }
    }
}