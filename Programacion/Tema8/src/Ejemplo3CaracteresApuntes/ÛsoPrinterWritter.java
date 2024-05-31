/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo3CaracteresApuntes;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author daw
 */
public class ÛsoPrinterWritter {

    public static void main(String[] args) {
        String texto = "Prueba de texto con PrinterWriter";
        String nombrefichero = "Prueba1.txt";
        try {
            PrintWriter pw = new PrintWriter(nombrefichero);
            
            pw.write(texto);
            pw.println();
            pw.write(texto);
            pw.flush();
            pw.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Erro al escribir en el fichero ");
        }
        
        
    }
}
