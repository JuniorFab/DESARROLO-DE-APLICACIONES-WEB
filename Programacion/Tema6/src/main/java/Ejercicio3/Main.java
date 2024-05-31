/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author Junior Fabricio
 */
public class Main {

    public static void main(String[] args) {

        Alumno alumno1 = new Alumno(7, "Juan", 23, "Hombre");
        Alumno alumno2 = new Alumno(8, "Ana", 23, "Mujer");
        Alumno alumno3 = new Alumno(9, "Messi", 23, "Hombre");
        Profesor profesor = new Profesor(Materia.FISICA, "Ana", 30, "Mujer");
        Profesor prof = new Profesor(Materia.FISICA, "si", 30, "Mujer");
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(alumno1);
        personas.add(alumno2);
        personas.add(alumno3);
        for (Persona p : personas) {
            p.ausentarse(); 
        }
        Clase aula = new Clase(1, 4, Materia.FISICA, prof);
        aula.agregarEstudiante(alumno1);
        aula.agregarEstudiante(alumno2);
         aula.agregarEstudiante(alumno3);
        
        if (aula.puedeDarClase()) {
            System.out.println("¡Se puede dar clase!");
            aula.Notas();
        } else {
            System.out.println("No se puede dar clase.");
        }
    }
}
