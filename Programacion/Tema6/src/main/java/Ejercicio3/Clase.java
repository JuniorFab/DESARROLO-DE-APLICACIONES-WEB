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
public class Clase {
    //Atributo

    private int id_clase;
    private int num_maxclase;
    private Materia tipos;
    private ArrayList<Alumno> listaestudiantes;
    private Profesor profesor;

    //Constructor
    public Clase(int id_clase, int num_maxclase, Materia tipos, Profesor profesor) {
        this.id_clase = id_clase;
        this.num_maxclase = num_maxclase;
        this.tipos = tipos;
        this.profesor = profesor;
        this.listaestudiantes = new ArrayList<>();
    }

    public int getId_clase() {
        return id_clase;
    }

    public void setId_clase(int id_clase) {
        this.id_clase = id_clase;
    }

    public int getNum_maxclase() {
        return num_maxclase;
    }

    public void setNum_maxclase(int num_maxclase) {
        this.num_maxclase = num_maxclase;
    }

    public Materia getTipos() {
        return tipos;
    }

    public void setTipos(Materia tipos) {
        this.tipos = tipos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void agregarEstudiante(Alumno estudiante) {
        listaestudiantes.add(estudiante);
    }

    public void agregarEstudiante(Alumno... estudiante) {
        for (Alumno a : estudiante) {
            listaestudiantes.add(a);
        }
    }

    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public boolean puedeDarClase() {
        return this.profesor!= null && this.profesor.isDisponible()
                && profesor.getTipo() == tipos
                && listaestudiantes.size() >= num_maxclase / 2;
    }

    public void Notas() {
        int aprobadosMujer = 0, aprobadosHombre = 0;
        for (Alumno estudiante : listaestudiantes) {
            if (estudiante.getNota() >= 5.0) {
                if (estudiante.getSexo().equalsIgnoreCase("mujer")) {
                    aprobadosMujer++;
                } else {
                    aprobadosHombre++;
                }
            }
        }
        System.out.println("Hombres aprobados " + aprobadosHombre);
        System.out.println("Mujeres aprobados " + aprobadosMujer);

    }

}
