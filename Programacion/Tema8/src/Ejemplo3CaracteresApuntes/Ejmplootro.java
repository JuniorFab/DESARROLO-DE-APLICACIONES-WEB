/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo3CaracteresApuntes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daw
 */
public class Ejmplootro {

    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("archivos/ejemplo3.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            
            for (int i = 0; i < 10; i++) {
                bw.write("Linea " + i);
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Ejmplootro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            BufferedReader br=new BufferedReader(new FileReader("archivos/ejemplo3.txt"));
            String linea=br.readLine();
            while(linea!=null){
                System.out.println(linea);
                linea=br.readLine();
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejmplootro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejmplootro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
