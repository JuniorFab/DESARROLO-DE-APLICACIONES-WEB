/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la ruta del archivo ");
        String ruta = teclado.nextLine();

        File archivo = new File(ruta);

        if (archivo.isFile()) {
            System.out.println("-----Informacion del archivo-----  " );
            System.out.println( archivo.getName());
            System.out.println(archivo.length());
            if (archivo.canRead() && archivo.canWrite()) {
                System.out.println(archivo.getName() + " Tiene permisos de lectura y Escritura ");

            } else {
                System.out.println(archivo.getName() + " No tiene permisos de lectura y Escritura ");

            }
        }else{
            System.out.println("No es un  fichero/no existe ");
        }

        if (archivo.isDirectory()) {
            System.out.println("Informacion de la carpeta -> " + archivo.getName());
            String[] subdir = archivo.list();
            for (int i = 0; i < subdir.length; i++) {
                System.out.println(subdir[i]);
            }
        }else{
            System.out.println("No es un directorio/no existe");
        }

    }

}
