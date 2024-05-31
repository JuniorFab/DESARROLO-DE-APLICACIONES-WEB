/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;


import java.io.BufferedOutputStream;

import java.io.DataOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        FileOutputStream fout = null;
        BufferedOutputStream bout = null;
        DataOutputStream dout = null;

        System.out.println("Introduce la ruta ");
        String ficheroSalida = teclado.nextLine();
        System.out.println("Cuanto numeros quieres generar?");
        int limite = teclado.nextInt();
        try {
            fout = new FileOutputStream(ficheroSalida, true);
            bout = new BufferedOutputStream(fout);
            dout = new DataOutputStream(bout);
            for (int i = 0; i < limite; i++) {
                double numero = (Math.random() * (100 - 1 + 1) + 1);
                dout.writeDouble(numero);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("No encuentra el archivo");

        } catch (IOException ex) {
            System.out.println("Error al escribir");
        } finally {
            if (dout != null) {
                try {
                    dout.close();
                } catch (IOException ex) {
                    System.out.println("No hay nada");
                }
            }
        }

    }
}
