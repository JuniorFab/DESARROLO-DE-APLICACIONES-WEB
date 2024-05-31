/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Junior Fabricio
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Introduce la ruta ");
        String ruta = Teclado.nextLine();
        System.out.println("Introduce el texto ");
        String texto = Teclado.nextLine();
        escribirFichero(ruta, texto);
        lectura(ruta);

    }

    public static void escribirFichero(String ruta, String texto) {

        File f = new File(ruta);
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error al crear el archivo");
            }
        }
        FileWriter fw = null;
        try {
            fw = new FileWriter(f, true);

            fw.write(texto);
            System.out.println("Escribiendo ...");
        } catch (IOException ex) {
            System.out.println("Porblemas en la escritura ");

        } finally {
            try {
                fw.close();
                System.out.println("Fin de escritura");
            } catch (IOException ex) {
                System.out.println("Erro cerrando el archivo");
            }
        }

    }

    public static void lectura(String archivo) {

        try {
            FileReader fr = null;
            fr = new FileReader(archivo);
            int valor = fr.read();

            while (valor != -1) {
                char caracter = (char) valor;
                if (Character.isLowerCase(caracter)) {
                    caracter = Character.toUpperCase(caracter);

                } else {
                    caracter = Character.toLowerCase(caracter);
                }

                System.out.print(caracter);
                valor = fr.read();

            }
            fr.close();
        } catch (IOException ex) {
            System.out.println("Problema lectura");
        } catch (java.lang.NullPointerException ex) {
            System.out.println("Fin de lectura");
        }

    }

}
