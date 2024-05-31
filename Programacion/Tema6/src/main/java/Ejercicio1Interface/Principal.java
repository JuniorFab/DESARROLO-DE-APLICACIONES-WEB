/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1Interface;

/**
 *
 * @author daw
 */
public class Principal {

    public static void main(String[] args) {
        ArrayReales array = new ArrayReales(10);
        array.rellenar();
        array.imprimir();
        System.out.println("Minimo - " + array.minimo());
        System.out.println("Maximo - " + array.max());
        System.out.println("Suma - "+ array.sumatario());
        
    }
}
