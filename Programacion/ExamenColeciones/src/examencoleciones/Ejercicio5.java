/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examencoleciones;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Junior Fabricio
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashMap<String, Integer> listacompra = new HashMap<>();
        int opcion = 0;

        do {

            System.out.println(" -----Menu----- ");
            System.out.println("1-Introduce un producto a la lista ");
            System.out.println("2-Modificar el precio de un producto");
            System.out.println("3-Mostrar la lista de la compra ");
            System.out.println("4-Eliminar producto de la cesta");
            System.out.println("5-Salir");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce un producto ");
                    String nombre = teclado.nextLine();
                    System.out.println("Introduce el precio ");
                    Integer precio = teclado.nextInt();
                    listacompra.put(nombre, precio);
                    break;
                case 2:
                    System.out.println("Introduce el nombre del producto ");
                    String nombreKey = teclado.nextLine();
                    if (listacompra.containsKey(nombreKey)) {
                        System.out.println("Introduce el nuevo precio ");

                        listacompra.put(nombreKey, teclado.nextInt());
                    } else {
                        System.out.println("No existe ese producto ");
                    }

                    break;
                case 3:

                    String clave;
                    Iterator<String> productos = listacompra.keySet().iterator();
                    System.out.println("Hay los siguientes productos:");
                    while (productos.hasNext()) {
                        clave = productos.next();
                        System.out.println(clave + " - " + listacompra.get(clave));
                    }
                    break;
                case 4:
                    System.out.println("Introduce el nombre de el producto que quieres eliminar ");
                    String nombreproducto = teclado.nextLine();
                    if (listacompra.containsKey(nombreproducto)) {
                        listacompra.remove(nombreproducto);
                        
                            System.out.println("El producto "+nombreproducto+" ha sido a eliminado  ");
                    } else {
                        System.out.println("No Hay ningun producto con ese nombre");
                    }

                    break;
                default:
                    System.out.println("Fin del programa");
            }

        } while (opcion != 5);

    }

}
