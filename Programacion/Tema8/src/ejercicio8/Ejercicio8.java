/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        File fichero = new File("Archivos/Ejercicio8.bat");
        escribir(fichero);
        leer(fichero);
    }

    public static void escribir(File datos) {
        Scanner teclado = new Scanner(System.in);

        try (DataOutputStream dout = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(datos, true)))) {
            char usuario = 0;
            do {
                System.out.println("Introduce nombre");
                String nombre = teclado.nextLine();
                System.out.println("Introduce apellido");
                String apellidos = teclado.nextLine();
                System.out.println("Introduce telefono");
                int telefono = teclado.nextInt();
                System.out.println("Introduce la edad");
                int edad = teclado.nextInt();
                teclado.nextLine();
                System.out.println("¿Continuar (S/N)?");
                usuario = teclado.nextLine().charAt(0);
                dout.writeUTF(nombre);
                dout.writeUTF(apellidos);
                dout.writeInt(telefono);
                dout.writeFloat(edad);

            } while (usuario == 'S' || usuario == 's');
            dout.flush();
        } catch (IOException ex) {
            System.out.println(System.out);
        }

    }

    public static void leer(File datos) {
        try (DataInputStream din = new DataInputStream(new BufferedInputStream(new FileInputStream(datos)))) {
            while (true) {
                String nombre = din.readUTF();
                System.out.println(nombre);
                String apellido = din.readUTF();
                System.out.println(apellido);
                int telefono = din.readInt();
                System.out.println(telefono);
                Float edad = din.readFloat();
                System.out.println(edad);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo ");
        } catch (IOException ex) {
            System.out.println("Fin del archivo ");
        }
    }
}
