/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosCaracteres;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author daw
 */
public class Ejemplocaracter {

    public static void main(String[] args) {
        String texto = " En un lugar de la Mancha de cuyo nombre no quiero acordarme....\n un texto";
        File fichero = new File("archivos/ejemplo1.txt");
        try {
            FileWriter fw = new FileWriter(fichero, true);
            fw.write(texto);

            fw.close();
        } catch (IOException ex) {
            System.out.println("Error al acceder al archivo");
        }
        try {
            FileReader fr = new FileReader(fichero);
            int car = fr.read();
            while (car != -1) {
                car = fr.read();

            }

            fr.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no existe");
        } catch (IOException ex) {
            System.out.println("El fichero no existe");
        }

    }
}
