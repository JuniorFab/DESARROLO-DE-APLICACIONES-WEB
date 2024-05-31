/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author daw
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        
        System.out.println("Introduce el nombre del archivo (NombreArchivo.extension)");
        String nombre=teclado.nextLine();
        System.out.println("Introduce la ruta de donde se encuentra el archivo ");
        String ruta=teclado.nextLine();
        System.out.println("Introduce el nombre del nuevo archivo (NombreArchivo.extension) ");
        String nombre1=teclado.nextLine();
        System.out.println("Introduce la ruta de donde quieres guardar el nuevo archivo ");
        String ruta1=teclado.nextLine();
            
        try {
            //        File archivo = new File(ruta+nombre);
            BufferedInputStream entrada=new BufferedInputStream(new FileInputStream(ruta+nombre));
             BufferedOutputStream salida =new BufferedOutputStream(new FileOutputStream(ruta1+nombre1));
              int dato; 
            while((dato = entrada.read())!= -1){
                salida.write(dato);
            }
            entrada.close();
            salida.close();
             
        } catch (FileNotFoundException ex) {
                 System.out.println("Error al acceder al fichero");
        } catch (IOException ex) {
            System.out.println("No se puede copiar el fichero ");
        }
 
    
    
        
        
        
        
        
    }
}
