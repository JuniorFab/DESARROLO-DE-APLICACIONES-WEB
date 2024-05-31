/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer2;

import java.util.LinkedList;

/**
 *
 * @author Junior Fabricio
 */
public class Ejer2 {

    public static void main(String[] args) {
        LinkedList<Estudiante> estudiantes = new LinkedList<>();
        estudiantes.add(new Estudiante("María Pedraza", 22, "1234567"));
        estudiantes.add(new Estudiante("Álvaro Rico", 21, "5671234"));
        estudiantes.add(new Estudiante("Diana Paola", 23, "7654321"));
        estudiantes.add(null);
        estudiantes.add(null);
        estudiantes.add(new Estudiante("Álvaro Rico", 21, "5671234"));

        // Añadir al final
        estudiantes.addLast(new Estudiante("Miguel Bernardeau", 22, "4535467"));
        // Añadir al principio
        estudiantes.addFirst(new Estudiante("Jaime Lorente", 26, "1112222"));

        System.out.println("-----La lista-----");
        System.out.println(estudiantes);
        System.out.println("----Contenido de la colección con un bucle foreach----");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        System.out.println("Eliminamos a Diana Paola");
        if (estudiantes.contains(new Estudiante("Diana Paola", 23, "7654321"))) {
            estudiantes.remove(new Estudiante("Diana Paola", 23, "7654321"));
        }

    }
}
