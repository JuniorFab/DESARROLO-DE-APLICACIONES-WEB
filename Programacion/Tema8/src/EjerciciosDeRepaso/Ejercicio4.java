/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosDeRepaso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Junior Fabricio
 */
public class Ejercicio4 {
    public static void main(String[] args) {
       
        File archivoOriginal = new File("Restaurants.csv");
        File archivoNuevo = new File("Restaurants2.csv");

        try (
            BufferedReader lector = new BufferedReader(new FileReader(archivoOriginal));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoNuevo))
        ) {
            String linea;
            while ((linea = lector.readLine()) != null) {
               
                String[] campos = linea.split(",");
                
                
                if (campos.length >= 5 && !campos[4].trim().startsWith("6")) {
                    
                    escritor.write(linea);
                    escritor.newLine();
                }
            }
            System.out.println("Se ha creado la copia");
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
           
        } catch (IOException ex) {
            System.out.println("Error ");
          
            
        }
    }
}
