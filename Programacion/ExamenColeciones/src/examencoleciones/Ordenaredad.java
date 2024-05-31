/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examencoleciones;

import java.util.Comparator;

/**
 *
 * @author Junior Fabricio
 */
public class Ordenaredad implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        if (o1.getEdad() < o2.getEdad()) {
            return -1;
        } else if (o1.getEdad() > o2.getEdad()) {
            return 1;
        } else {
            return 0;
        }
    }

}
