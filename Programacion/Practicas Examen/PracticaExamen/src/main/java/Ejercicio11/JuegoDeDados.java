/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Junior Fabricio
 */
public class JuegoDeDados implements Juego {

    //Atributos
    private String jugador1;
    private String jugador2;
    private int dado1;
    private int dado2;

    @Override
    public void iniciar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre Jugador 1");
        jugador1 = teclado.nextLine();
        System.out.println("Introduce el nombre Jugador 2 ");
        jugador2 = teclado.nextLine();

    }

    @Override
    public void jugar() {
        dado1 = (int) (Math.random() * 6) + 1;
        dado2 = (int) (Math.random() * 6) + 1;

        System.out.println("El jugador 1 ha sacado " + dado1);
        System.out.println("El jugador 2 ha sacado " + dado2);

    }

    @Override
    public void finalizar() {
        if (dado1 > dado2) {
            System.out.println("Ha ganado  " + jugador1);
        } else if (dado1 < dado2) {
            System.out.println("Ha ganado  " + jugador2);
        } else {
            System.out.println("Empate");
        }
    }

}
