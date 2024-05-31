/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RandomFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daw
 */
public class ejemploderandomfile {

    public static void main(String[] args) {
         RandomAccessFile raf =null;
        try {
            raf = new RandomAccessFile("Archivos/prueba.dat", "rw");
            raf.seek(raf.length());
            for (int i = 0; i < 10; i++) {
                raf.writeInt(i);

            }
            
            
            
       raf.seek(0);
            System.out.println(raf.readInt());
            
           
        } catch (java.io.EOFException ex) {
            System.out.println("Fin de lectura");
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        } catch (IOException ex) {
            Logger.getLogger(ejemploderandomfile.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
                 raf.close();
             } catch (IOException ex) {
                 Logger.getLogger(ejemploderandomfile.class.getName()).log(Level.SEVERE, null, ex);
             }
        }

    }
}
