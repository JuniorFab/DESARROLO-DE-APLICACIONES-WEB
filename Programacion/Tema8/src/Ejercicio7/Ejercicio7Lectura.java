/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 *
 * @author Junior Fabricio
 */
public class Ejercicio7Lectura {

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("ejercicio7.bin");
            DataInputStream din = new DataInputStream(fin);
            while (true) {
                double dato = din.readDouble();
                System.out.println(dato);
            }
        } catch (java.io.EOFException ex) {
            System.out.println("Fin de la lectura");
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no existe");
        } catch (IOException ex) {
            System.out.println("Error de lectura y Escritura  ");
        }
    }
}
