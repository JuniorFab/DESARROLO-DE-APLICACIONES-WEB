/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POPOPOP;

/**
 *
 * @author Junior Fabricio
 */
public class a {

    public static void main(String[] args) {
        String cadena = "Soy.una.cadena con puntos y espacios-Otra cosa - caracola";
        System.out.println(cadena);
        System.out.println("---------------------------------------------------");
        //Ejemplo 1: separa las subcadenas por espacios
        String[] subcadenas = cadena.split(" ");
        for (int i = 0; i < subcadenas.length; i++) {
            System.out.println(subcadenas[i]);
        }
        System.out.println("---------------------------------------------------");
        //Ejemplo 2: separar las subcadenas por puntos
        String[] subcadenas2 = cadena.split("\\.");
        for (int i = 0; i < subcadenas2.length; i++) {
            System.out.println(subcadenas2[i]);
        }
        System.out.println("---------------------------------------------------");
        //Ejemplo 3: separar las subcadenas por -
        String[] subcadenas3 = cadena.split("-");
        for (int i = 0; i < subcadenas3.length; i++) {
            System.out.println(subcadenas3[i]);
        }
    }
}
