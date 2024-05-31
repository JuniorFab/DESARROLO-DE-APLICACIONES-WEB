package EjerciciosDeRepaso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


public class Ejercicio2 {

    public static void main(String[] args) {
        File archivo = new File("Restaurants.csv");

        try (BufferedReader bos = new BufferedReader(new FileReader(archivo))) {
            String linea;
            Set<String> phones = new HashSet<>();
             while ((linea = bos.readLine()) != null) {
                String[] cadena = linea.split(",");
                if (cadena.length >= 5) {
                    String valor = cadena[4].trim();
                    if (valor.startsWith("6")) {
                        phones.add(valor);
                    }
                }
            }
            for(String phone : phones){
                System.out.println(phone);
            }
            
        } catch (java.lang.RuntimeException ex) {
            System.out.println(" Error raro ");
        } catch (FileNotFoundException ex) {
            System.out.println("archivo no encontrado ");
        } catch (IOException ex) {
            System.out.println("Fin de lectura");
        }

    }
}
