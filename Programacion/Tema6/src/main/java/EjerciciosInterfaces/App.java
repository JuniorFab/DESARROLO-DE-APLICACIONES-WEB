/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosInterfaces;

import java.util.Arrays;

/**
 *
 * @author SMR
 */
public class App {
        public static void main(String[] args) {
        ArrayReales a= new ArrayReales(10);
        a.rellenar();
            System.out.println(Arrays.toString(a.array));
            System.out.println(a.maximo());
    }
}
