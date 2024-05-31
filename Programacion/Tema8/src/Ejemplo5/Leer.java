/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo5;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Junior Fabricio
 */
public class Leer {

    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Archivos/Libro.dat")))) {
            Libro libro = null;
            while (true) {
                libro = (Libro) ois.readObject();
                System.out.println(libro);
            }

        } catch (java.io.EOFException ex) {
            System.out.println("Fin de fichero");
        } catch (FileNotFoundException ex) {
            System.out.println("No he encontrado el archivo");
        } catch (IOException ex) {
            System.out.println("No se cual es ");
        } catch (ClassNotFoundException ex) {
            System.out.println("No encuentra la clase ");
        }

    }
}
