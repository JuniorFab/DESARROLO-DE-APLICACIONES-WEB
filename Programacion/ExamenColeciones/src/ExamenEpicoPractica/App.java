/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenEpicoPractica;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;

import java.util.Scanner;

/**
 *
 * @author Junior Fabricio
 */
public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        HashMap<Long, String> listaContactos = new HashMap<>();
        int opcion = 0;
        try {
            do {
                System.out.println("-------Menu------");
                System.out.println("1-Insertar contacto");
                System.out.println("2-Eliminar contacto");
                System.out.println("3-Buscar contacto");
                System.out.println("4-Mostrar contactos");

                opcion = teclado.nextInt();
                teclado.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println(" Introduce el nombre  ");
                        String nombre = teclado.nextLine();
                        System.out.println("Introduce Telefono");
                        Long telefono = teclado.nextLong();

                        listaContactos.put(telefono, nombre);

                        break;
                    case 2:

                        System.out.println("Introduce el telefono");
                        Long telefonoa = teclado.nextLong();

                        Iterator<Map.Entry<Long, String>> mapa = listaContactos.entrySet().iterator();
                        while (mapa.hasNext()) {
                            Map.Entry<Long, String> a = mapa.next();
                            if (a.getKey().equals(telefonoa)) {
                                    mapa.remove();
                            }

                        }
                        break;
                    case 3:
                        System.out.println("Introduce el telefono que quieras buscar");
                        Long telefonoBuscar = teclado.nextLong();
                        for (Map.Entry<Long, String> entry : listaContactos.entrySet()) {

                            if (entry.getKey().equals(telefonoBuscar)) {
                                System.out.println(entry.getKey() + " " + entry.getValue());
                            }
                        }

                        break;

                    case 4:
                        Iterator<Map.Entry<Long, String>> mapaa = listaContactos.entrySet().iterator();
                        while (mapaa.hasNext()) {
                            Map.Entry<Long, String> a = mapaa.next();
                            System.out.println(a.getKey() + " " + a.getValue());

                        }

                        break;
                    default:
                        throw new AssertionError();
                }

            } while (opcion != 5);
        } catch (InputMismatchException ex) {
            ex.getMessage();

        }
    }
}
