/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Junior Fabricio
 */
public class Applinea {

    public static void main(String[] args) {
        ArrayList<Linea> lista = new ArrayList();
        Linea a = new Linea(1, 2, 3, 4);
        Linea c = new Linea(1, 9, 0, -9);
        Linea b = new Linea(10, 6, 7, 9);

        if (a.esMayor(b)) {
            System.out.println(a + "\n es mayor que " + b);
        } else {
            System.out.println(a + "\n es menor o igual que " + b);
        }

        lista.add(a);

        lista.add(c);
        lista.add(b);
        System.out.println(lista);
        Collections.sort(lista, new Comparator<Linea>() {

            @Override
            public int compare(Linea o1, Linea o2) {
                if (o1.esMayor(o2)) {
                    return 1;
                } else if (o1.esMenor(o2)) {
                    return -1;
                } else {
                    return 0;
                }
            }

        });
        System.out.println("\nLas lineas ordenadas por longitud de menor a mayor ");

        System.out.println(lista);
    }
}
