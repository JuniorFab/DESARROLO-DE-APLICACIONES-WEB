/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Ejemplo4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double densidad = 0, densidadMedia = 0;
        int numero = 1;
        try ( DataOutputStream fout = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("datos.dat", true)));
            DataInputStream fin = new DataInputStream(new BufferedInputStream(new FileInputStream("datos.dat")));) {
            //En este ejemplo cada vez que se escriba en el fichero se añadiran los datos, no se sobreescribirá
           
            System.out.println("Número de poblaciones a leer");
            numero = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < numero; i++) {
                System.out.println("Introduce nombre poblacion");
                String nombre = sc.nextLine();
                System.out.println("Introduce número de habitantes");
                long habitantes = sc.nextLong();
                sc.nextLine();
                System.out.println("Introduce la superficie");
                double superficie = sc.nextDouble();
                sc.nextLine();
                fout.writeUTF(nombre);
                fout.writeLong(habitantes);
                fout.writeDouble(superficie);

            }
            fout.flush();

            //Leemos los datos para calcular la densidad de población media
            System.out.println("");
            while (true) {
                String nombre = fin.readUTF();
                long habitantes = fin.readLong();
                double superficie = fin.readDouble();
                densidad = habitantes/superficie;
                System.out.printf("\nPoblacion %s con densidad de población %.2f habitantes",nombre,densidad);
                densidadMedia += densidad;
            }
            
         
        }catch (EOFException ex) {
            System.out.println("Fin de fichero");
        } catch (FileNotFoundException ex) {
            System.out.println("Error al acceder al fichero");
        } catch (IOException ex) {
            System.out.println("Error al leer/escribir en el fichero");
        }
        System.out.printf("\nDensidad media %.2f habitantes",(double)(densidadMedia/numero));
    }
    
}
