/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioEjemplo;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author daw
 */
public class Ejemplo10 {

    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("Archivos/pruebalibros.dat", "rw");) {
            //libro titulo y num pag
            raf.writeUTF("Me invento el titulo");
            raf.writeInt(150);
            
            
          
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
