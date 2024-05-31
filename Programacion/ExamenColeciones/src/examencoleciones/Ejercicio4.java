/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examencoleciones;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author Junior Fabricio
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        HashSet<Persona> listapersona = new HashSet<>();
        TreeSet<Persona> listapersonastree = new TreeSet<>();
        TreeSet<Persona> listapersonastreeotroorden = new TreeSet<>(new Ordenaredad());

        System.out.println("-------Lista hashet--------");
        Persona p = new Persona("Marta", "Dios", LocalDate.of(1980, Month.MARCH, 10));
        Persona p2 = new Persona("Elena", "Clcaraz", LocalDate.of(2002, Month.AUGUST, 14));
        Persona p3 = new Persona("María", "Aizado", LocalDate.of(2015, Month.AUGUST, 14));
        
        listapersona.add(p);
        listapersona.add(p);
        listapersona.add(p2);
        listapersona.add(p3);
        listapersona.add(null);
        listapersona.add(null);
        for (Persona persona : listapersona) {

            System.out.println(persona);

        }

        System.out.println("-------Lista tree--------");
        try {
            listapersonastree.add(p);
            listapersonastree.add(p2);
            listapersonastree.add(p3);
            listapersonastree.add(null);
            listapersonastree.add(null);
            for (Persona persona : listapersonastree) {

                System.out.println(persona.toString());

            }
        } catch (NullPointerException e) {
            System.out.println("Error, no se admite obejtos nulos en un treeset");
        }
        System.out.println("----orden edad----");
        listapersonastreeotroorden.add(p);
        listapersonastreeotroorden.add(p2);
        listapersonastreeotroorden.add(p3);
        
        
        
        for (Persona persona : listapersonastreeotroorden) {
            System.out.println(persona);
        }

    }

}
