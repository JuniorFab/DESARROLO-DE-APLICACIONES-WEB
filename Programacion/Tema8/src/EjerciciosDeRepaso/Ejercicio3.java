/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosDeRepaso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Junior Fabricio
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lineas = new ArrayList<>();
        File archivo = new File("Restaurants.csv");
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo.");

        }

        System.out.println("Ingrese informacion sobre un nuevo usuario ejemplo(Nombre, Dirección, Ciudad,  Código Postal )");
        String nuevoDato = scanner.nextLine();

        lineas.add(nuevoDato);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (String linea : lineas) {
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Se ha añadido a un nuevo usuario ");
        } catch (IOException ex) {
            System.out.println("Error de escritura");

        }
    }
}
