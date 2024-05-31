/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejericicio11;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author daw
 */
public class JuegoDeDados implements Juego {

    //Atributos
    int resultado = (int) (Math.random() * 6) + 1;
    int resultado1 = (int) (Math.random() * 6) + 1;

    @Override
    public void iniciar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre de jugador 1");
        String nombre = teclado.nextLine();
        System.out.println("Introduce el nombre del Jugador 2");
        String nombre1 = teclado.nextLine();

    }

    @Override
    public void jugar() {

        System.out.println("El dado de jugador 1 " + resultado);
        System.out.println("El dado de jugador 2 " + resultado1);
    }

    @Override
    public void finalizar() {
        if (resultado > resultado1) {
            System.out.println("Ha ganado el jugador 1 ");

        } else if (resultado1 > resultado) {
            System.out.println("Ha ganado el jugador 2 ");
        } else {
            System.out.println("Son iguales ");
        }
    }

}
