/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examencoleciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Junior Fabricio
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashSet<String> deportes = new HashSet<>();
        deportes.add("atletismo");
        deportes.add("esquí");
        deportes.add("fútbol");
        deportes.add("fútbol");
        deportes.add("baloncesto");
        deportes.add("ciclismo");
        deportes.add("natación");
        deportes.add(null);
        System.out.println("La lista");
        System.out.println(deportes);
        System.out.println("Lista mas patinaje");
        deportes.add("patinaje");
        System.out.println(deportes);
        System.out.println("introduce un deporte a buscar ");
        String cadena = teclado.nextLine().toLowerCase();
        if (deportes.contains(cadena)) {
            System.out.println("El deporte se encuentra en la lista");
            deportes.remove(cadena);

        }
        
        System.out.println("Eliminado ");
        System.out.println("Lista borrado");
        System.out.println(deportes);
        
        Iterator<String> it = deportes.iterator();
        
        while(it.hasNext()){
            String dep=it.next();
            System.out.println(dep);
        }
                
                
               
    }
}
