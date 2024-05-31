/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Junior Fabricio
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        File fichero = new File("archivos/navock.dat");

        if (!fichero.exists()) {
            try (ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream(fichero))) {
                System.out.println("Introduce el nombre");
                String nombre = teclado.nextLine();
                System.out.println("Introduce los apellidos");
                String apellidos = teclado.nextLine();
                System.out.println("Introduce nre");
                int nre = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Introduce Fecha nacimiento");
                String fechaNac = teclado.nextLine();
                System.out.println("Introduce nota de acceso");
                float nota = teclado.nextFloat();
                teclado.nextLine();
                System.out.println("Introduce titulacion");
                String titulacion = teclado.nextLine();
                DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate fecha = LocalDate.parse(fechaNac, fmt);
                Alumno alu = new Alumno(nombre, apellidos, nre, fecha, nota, titulacion);
                // ojo, se hace un new por cada Persona. El new dentro
                // del bucle.
                ois.writeObject(alu);
            } catch (FileNotFoundException ex) {
                System.out.println("No se encuentrea el archivo ");
            } catch (IOException ex) {
                System.out.println("Fin de escritura");
            }
        } else {
            try (MiObjectOutputStream oos = new MiObjectOutputStream(new FileOutputStream(fichero, true))) {
                Alumno p = new Alumno();
                System.out.println("Introduce el nombre");
                String nombre = teclado.nextLine();
                System.out.println("Introduce los apellidos");
                String apellidos = teclado.nextLine();
                System.out.println("Introduce nre");
                int nre = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Introduce Fecha nacimiento");
                String fechaNac = teclado.nextLine();
                System.out.println("Introduce nota de acceso");
                float nota = teclado.nextFloat();
                teclado.nextLine();
                System.out.println("Introduce titulacion");
                String titulacion = teclado.nextLine();
                DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate fecha = LocalDate.parse(fechaNac, fmt);
                p.setNombre(nombre);   // Se rellenan los datos de Persona.
                p.setApellidos(apellidos);
                p.setNre(nre);
                p.setNotaAcceso(nota);
                p.setTitulacion(titulacion);
                p.setfNac(fecha);
                oos.writeUnshared(p);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Ejercicio9.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Ejercicio9.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {

            Object aux;
            while ((aux = ois.readObject()) != null) {
                if (aux instanceof Alumno) {
                    System.out.println(aux);
                }
            }
        } catch (java.io.EOFException ex) {
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ejercicio9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
