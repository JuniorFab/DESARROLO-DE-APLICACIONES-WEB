/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author Junior Fabricio
 */
public class Prueba {

    public static void main(String[] args) {
        Relaciones[] array = new Relaciones[10];
        array[0] = new Linea(15, 3, 9, 5);
        array[1] = new Fraccion(10, 7);
        array[2] = new Fraccion(6, 25);
        array[3] = new Linea(3, 4, 10, 15);
        array[4] = new Fraccion(8, 3);
        for (Relaciones r : array) {
            if (!Relaciones.esNull(r)) {
                System.out.println(r.nombreClase());
                System.out.println(r);
                System.out.println(" ");
            }
        }
    }
}
