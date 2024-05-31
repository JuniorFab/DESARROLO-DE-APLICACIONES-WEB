/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examencoleciones;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Junior Fabricio
 */
public class Ejercicio5Nuevo {

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
                    System.out.println("Introduce el nombre");
                    String nombre = teclado.nextLine();

                    System.out.println("Introduce el precio ");
                    Integer precio = teclado.nextInt();
                    listacompra.put(nombre, precio);

                    break;

                case 2:
                    System.out.println("Introduce el nombre del producto ");
                    String nombreProducto = teclado.nextLine();
                    if (listacompra.containsKey(nombreProducto)) {
                        System.out.println("Introduce el precio que le quieras añadir ");
                        Integer precioNuevo = teclado.nextInt();
                        listacompra.put(nombreProducto, precioNuevo);

                    }
                    break;
                case 3:
                    for (Iterator<Map.Entry<String, Integer>> iterator = listacompra.entrySet().iterator(); iterator.hasNext();) {

                        Map.Entry<String, Integer> ele = iterator.next();
                        System.out.println(ele.getKey() + " " + ele.getValue());
                    }

                    break;
                case 4:
                    System.out.println("Introduce el nombre del producto  ");
                    String nombreBorrar = teclado.nextLine();
                    if (listacompra.containsKey(nombreBorrar)) {
                        listacompra.remove(nombreBorrar);

                    } else {
                        System.out.println("No existe el producto ");
                    }
                    break;
                default:
                    System.out.println("No existe esa la opcion " + opcion);
            }

        } while (opcion != 5);
    }
}
