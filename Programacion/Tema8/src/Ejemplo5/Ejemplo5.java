/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo5;

import java.io.BufferedOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


/**
 *
 * @author daw
 */
public class Ejemplo5 {
 public static void main(String[] args) {
        try (MiObjectOutputStream oos = new MiObjectOutputStream(new BufferedOutputStream(new FileOutputStream("Archivos/libro.dat",true)));
                ){
            //Escribimos 3 objetos
            oos.writeObject(new Libro("La nueva vida1",150,"9788418800610"));
            oos.writeObject(new Libro("El mercader de libros",250,"9788413142609"));
            oos.writeObject(new Libro("Todo esto te dare",150,"9788408163176"));
            oos.flush();
                
        } catch (FileNotFoundException ex) {
                System.out.println("Fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("Error L/E");
        } 

        
    }
}