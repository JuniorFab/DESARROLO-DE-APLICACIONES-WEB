/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author daw
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        String texto = " En un lugar de la macha de cuyo nombre no quiero acordarme …\n";
        String nombrefichero = "OtraPrueba.txt";
        String linea;
        try {
            PrintWriter pw = new PrintWriter(nombrefichero);
            pw.write(texto);
            pw.flush();
            pw.close();

        } catch (FileNotFoundException ex) {
            System.out.println("No se puede escribir en el archivo ");

        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombrefichero));

            while ((linea = br.readLine()) != null) {
                
                String palabra[] = linea.split("\\s");
                for (int i = 0; i < linea.length(); i++) {
                    System.out.print(palabra[i]);
                }

            }

        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no se puede leer");
        } catch (IOException ex) {
            System.out.println("Otro problema");
        } catch (java.lang.ArrayIndexOutOfBoundsException ex) {
            System.out.print("Fin de lectura ");
        }
    }
}
