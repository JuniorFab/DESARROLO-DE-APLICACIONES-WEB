/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2GestionEmpleados;

/**
 *
 * @author daw
 */
public class Ejecutar {

    public static void main(String[] args) {
                Repartidor uno=new Repartidor("Zona3", "a", 20, 200);
             
               System.out.println(uno.plus());
               Comercial dos=new Comercial(300, "A", 32, 300);
               System.out.println(dos.plus());
    }
}
