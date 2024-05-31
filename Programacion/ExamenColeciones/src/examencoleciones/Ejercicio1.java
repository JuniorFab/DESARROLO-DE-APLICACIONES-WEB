/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examencoleciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Junior Fabricio
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = (int) (Math.random() * 10) + 1;
            lista.add(numeroAleatorio);

        }

        System.out.println("Lista inicial");
        System.out.println(lista);
        System.out.println("Modo inverso y ordenada");
        Collections.sort(lista, Collections.reverseOrder());
        System.out.println(lista);
        System.out.println("Numero 1 eliminado ");
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            if (it.next().equals(1)) {
                it.remove();
            }
        }
        System.out.println(lista);
    }
}
