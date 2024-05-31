/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

import java.util.Comparator;

/**
 *
 * @author Junior Fabricio
 */
public class OrdenCapActual implements Comparator<Cafetera> {

    @Override
    public int compare(Cafetera o1, Cafetera o2) {
        if (o1.getCantidadActual() < o2.getCantidadActual()) {
            return -1;
        } else if (o1.getCantidadActual() > o2.getCantidadActual()) {
            return 1;
        } else {
            return 0;
        }
    }

}
