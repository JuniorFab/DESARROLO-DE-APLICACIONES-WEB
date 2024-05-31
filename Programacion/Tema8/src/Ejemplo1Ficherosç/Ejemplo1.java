/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo1Ficherosç;

import java.io.File;
import java.io.IOException;
 


/**
 *
 * @author daw
 */
public class Ejemplo1 {

    public static void main(String[] args) {
        File fichero = new File("build.xml");
          File fichero2 = new File("C:\\Users\\daw\\Documents\\NetBeansProjects\\Tema8\\Archivos/fichero2.txt");
          File carpeta =new File("Archivos");
          if(carpeta.isDirectory()){
              String[] subdir=carpeta.list();
                for (int i = 0; i < subdir.length; i++) {
                    System.out.println(subdir[i]);
              }
          
          }else{
          
          
          }
          if(!fichero2.exists()){
            try {
                fichero2.createNewFile();
            } catch (IOException ex) {
                System.out.println(System.out);
            }
          
          }
          
          
          
        if (fichero.exists()) {
            System.out.println("El fichero existe");
            System.out.println(fichero.getAbsolutePath());
            System.out.println(fichero.getName());
            
            System.out.println(fichero.isFile());
        } else {
            System.out.println("No exsiste");
        }

    }
}
