/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import java.util.Comparator;

/**
 *
 * @author Junior Fabricio
 */
public class OrdenDeX implements Comparator<Punto> {

    @Override
    public int compare(Punto o1, Punto o2) {
        if (o1.getPosX() < o2.getPosX()) {
            return -1;

        } else if (o1.getPosX() > o2.getPosX()) {
            return 1;
        } else {
            return 0;
        }

    }

}
