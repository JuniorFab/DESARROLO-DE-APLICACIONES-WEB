/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RutaNombre;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daw
 */
public class Rutanombre {

    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);
            String ruta = "Archivos";
            File carpeta = new File(ruta);

            String nombreFichero = "Miercoles.txt";

            File fichero = new File(carpeta, nombreFichero);

            fichero.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Rutanombre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
