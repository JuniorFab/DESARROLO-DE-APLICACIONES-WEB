/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosDeRepaso;

import java.io.File;

/**
 *
 * @author daw
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        File archivos = new File("EjerciciosRepaso/Ejerciciosderepaso.txt");

        if (archivos.exists()) {
            if (archivos.isFile()) {
                System.out.println("El " + archivos.getName() + " es un fichero ");
                System.out.println("----- Inforacion del archivo ------ ");
                System.out.println("Tamaño del archivo --> " + archivos.length());
                System.out.println("El nombre del archivo " + archivos.getName());
                if (archivos.canRead() && archivos.canWrite()) {
                    System.out.println("El " + archivos.getName() + " tiene permisos de escritura y lectura ");
                } else {
                    System.out.println("El " + archivos.getName() + " no tiene permisos de escritura y lectura ");
                }

            } else {
                System.out.println("El " + archivos.getName() + " es un directorio ");

            }

        } else {

            System.out.println("No existe :C");
        }

    }
}
