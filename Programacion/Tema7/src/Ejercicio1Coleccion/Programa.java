/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1Coleccion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Junior Fabricio
 */
public class Programa {

    public static void main(String[] args) {
        List<Integer> listaNumero = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = 0;
            numeroAleatorio = random.nextInt(10) + 1;
            listaNumero.add(numeroAleatorio);
        }
          System.out.println("Lista original: ");
          System.out.println(listaNumero);
          System.out.println("Lista alreves y ordenada ");
          Collections.sort(listaNumero, listaNumero.reversed());
          System.out.println(listaNumero.reversed());
          System.out.println("");
    }
}
