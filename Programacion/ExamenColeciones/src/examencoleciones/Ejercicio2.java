/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examencoleciones;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;



/**
 *
 * @author Junior Fabricio
 */

public class Ejercicio2 {

    public static void main(String[] args) {
        LinkedList<Estudiante> estudiantes = new LinkedList<>();

        Estudiante e1 = new Estudiante("Maria Pedraza", 22, "1234567");
        //Observa que las listas admiten duplicados y datos repetidos, incluso nulos
        estudiantes.add(e1);
        estudiantes.add(e1);
        estudiantes.add(new Estudiante("Alvaro Rico ", 21, "5671234"));
        Estudiante e2 = new Estudiante("Diana Paola", 23, "7654321");
        estudiantes.add(e2);
        estudiantes.add(null);
        estudiantes.add(null);
        estudiantes.add(new Estudiante("Alvaro Rico ", 21, "5671234"));
        estudiantes.addFirst(new Estudiante("Jaime Lorente", 26, "4535467"));
        estudiantes.addLast(new Estudiante("Miguel Bernardeau", 26, "1112222"));
//        for (Estudiante estudiante : estudiantes) {
//            if (estudiante != null) {
//                System.out.println(estudiante.toString());
//
//            }
//
//        }

        System.out.println(estudiantes);

//        estudiantes.remove(new Estudiante("Diana Paola", 23, "7654321"));

        Iterator<Estudiante> it = estudiantes.iterator();
        Estudiante a = null;
        while (it.hasNext()) {
            a = it.next();
            if (a!=null && a.equals(new Estudiante("Diana Paola", 23, "7654321"))) {
                it.remove();
            }

        }

        System.out.println("\nEstudiantes después de eliminar a Diana Paola ");
        System.out.println(estudiantes);
        String nombre = "Maria Pedraza";
        System.out.println("Buscar a Maria Pedraza");
        for (Estudiante e : estudiantes) {
            if (e != null && e.getNombre().equalsIgnoreCase(nombre)) {

                System.out.println(e);

            }
        }

        System.out.println("Ordenado alfabeticamente ");
        while (estudiantes.remove(null)){
        }
        Collections.sort(estudiantes);

//        Iterator<Estudiante> it = estudiantes.iterator();
        while (it.hasNext()) {
            Estudiante e = it.next();
            System.out.println(e);

        }

        for (Estudiante p : estudiantes) {
            if (p != null) {
                Collections.sort(estudiantes);
                System.out.println(p.toString());
            }
        }

        System.out.println("Clonar");

        Estudiante original = estudiantes.getFirst();
        Estudiante copia = null;
        try {
            copia = (Estudiante) original.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println(" Error al conectar ");

        }
        System.out.println("Clonamos  " + copia);

    }

}
