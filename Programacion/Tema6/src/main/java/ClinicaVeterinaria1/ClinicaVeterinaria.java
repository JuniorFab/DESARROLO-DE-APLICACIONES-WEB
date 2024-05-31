/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClinicaVeterinaria1;

import java.util.ArrayList;

/**
 *
 * @author Junior Fabricio
 */
public class ClinicaVeterinaria {

    //Atributos
    private ArrayList<Animal> listaanimales;
    //Constructor

    public ClinicaVeterinaria() {

        this.listaanimales = new ArrayList<>();

    }

    public ArrayList<Animal> getListaanimales() {
        return listaanimales;
    }

    public void añadiranimal(Animal b) {
        listaanimales.add(b);
    }

    public String Buscaranimal(String nombre) {
        for (Animal l : listaanimales) {
            if (l.getNombre().equalsIgnoreCase(nombre)) {
                return l.toString();

            }

        }
        return null;

    }

    public void modificarComentarioanimal(String nombre, String comentario) {
        for (Animal l : listaanimales) {
            if (l.getNombre().equalsIgnoreCase(nombre)) {
                l.setComentarios(comentario);
            }
        }

    }

    @Override
    public String toString() {
        return "ClinicaVeterinaria{" + "listaanimales=" + this.listaanimales.toString() + '}';
    }

}
