/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejemplo 
         int resultado = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero ");
        int num = teclado.nextInt();
        System.out.println("Introduce otro numero ");
        int num2 = teclado.nextInt();
       
        try {
            resultado = num / num2;
        } catch (ArithmeticException e) {
            System.out.println("Error aritmetico");
        }catch(Exception e2){
            System.out.println("Error general");
        }
        System.out.println("Resultado es " + resultado);
        
        
    }

}
