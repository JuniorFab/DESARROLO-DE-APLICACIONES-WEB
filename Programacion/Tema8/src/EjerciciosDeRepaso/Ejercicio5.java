/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosDeRepaso;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Junior Fabricio
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la ruta que quieres borrar");
        String rutaArchivo = scanner.nextLine();

        File archivo = new File(rutaArchivo);

        if (archivo.exists() && archivo.isFile()) {

            if (archivo.delete()) {
                System.out.println("El archivo ha sido borrado ");
            } else {
                System.out.println("No se pudo borrar el archivo");
            }
        } else {
            System.out.println("El archivo  no existe ");
        }
    }
}
