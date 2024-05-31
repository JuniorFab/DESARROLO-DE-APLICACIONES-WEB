/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author daw
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        ArrayList<Nombrecompleto> nombres = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Archivos/alumnos.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] cadena = linea.split("\\;+");
                Nombrecompleto n = new Nombrecompleto(cadena[0], cadena[cadena.length - 1]);
                nombres.add(n);
                linea = br.readLine();
            }
            
            Collections.sort(nombres);
            System.out.println("----Lista de Nombres y apellidos----");
            for (Nombrecompleto n : nombres) {
                System.out.println(n);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo ");
        } catch (IOException ex) {
            System.out.println("Fin de lectura");
        }
    }
}
