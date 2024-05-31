/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

import java.awt.Button;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author daw
 */
 class pruebaventa  extends JFrame{

    public pruebaventa() throws HeadlessException {
      super("hola");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setBackground(Color.red);
        this.add(new JButton("aaaaaaa"));
        
        
    }
    
    
}
public class ejemplo{

    public static void main(String[] args) {
        pruebaventa a=new pruebaventa();
        a.setVisible(true);
    }
    
}