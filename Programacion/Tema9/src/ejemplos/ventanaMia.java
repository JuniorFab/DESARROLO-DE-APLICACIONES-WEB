/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author daw
 */
public class ventanaMia extends JFrame {

    private JButton buttonRojo;
    private JButton buttonAzul;
    Container panelPpal;

    public ventanaMia() {
        //Propiedades de la ventana
        super("Titulo de la ventana"); //Titulo
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);//Tamaño
        this.setLayout(new FlowLayout());
        //Componentes de la ventana
        buttonRojo = new JButton("Rojo");
        buttonAzul = new JButton("Azul");
        //Añadimos los botones al contenedor ventana
        add(buttonAzul);
        add(buttonRojo);
        //Los botones se registran como fuente de los eventos 
        //la ventana es el oyente
        buttonAzul.addActionListener((ActionListener) this);
        buttonRojo.addActionListener((ActionListener) this);
        panelPpal = this.getContentPane();
        panelPpal.setBackground(Color.yellow);

    }

  
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("azul")) {
            panelPpal.setBackground(Color.blue);
        } else if (e.getActionCommand().equalsIgnoreCase("rojo")) {
            panelPpal.setBackground(Color.red);
        }
        System.out.println(e.getActionCommand());

    }

    public static void main(String[] args) {
        ventanaMia v = new ventanaMia();
    }

}
