/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author DAW
 */
public class VentanaComponentes extends JFrame{
    public VentanaComponentes(){
          // creamos la ventana
       super("Ventana con componentes");
        this.setLayout(new FlowLayout());
        this.setSize(700, 500);

        // creamos JLabel
        JLabel jLabel = new JLabel("Esto es un JLabel");
        this.add(jLabel);

        // creamos JButton
        JButton jButton = new JButton("Botón");
        this.add(jButton);

        // creamos JTextField
        JTextField jTextField = new JTextField("Esto es un JTextField");
        this.add(jTextField);

        // creamos JCheckBox
        JCheckBox jCheckBox1 = new JCheckBox("CheckBox1");
        this.add(jCheckBox1);
         JCheckBox jCheckBox2 = new JCheckBox("CheckBox2");
        this.add(jCheckBox2);

        // creamos JRadioButton
        JRadioButton jRadioButton1 = new JRadioButton("RadioButton1");
        JRadioButton jRadioButton2 = new JRadioButton("RadioButton2");
        JRadioButton jRadioButton3 = new JRadioButton("RadioButton3");
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(jRadioButton1);
        grupo.add(jRadioButton2);
        grupo.add(jRadioButton3);
        this.add(jRadioButton1);
        this.add(jRadioButton2);
        this.add(jRadioButton3);

        // menu de opciones
        JMenuBar barraMenu = new JMenuBar();
        JMenu menu = new JMenu("Esto es un JMenu");
        menu.add(new JMenuItem("Esto la opción 1 del primer menú"));
        menu.add(new JMenuItem("Esto la opción 2 del primer menú"));

        JMenu menu2 = new JMenu("Esto es otro JMenu");
        menu2.add(new JMenuItem("Esto la opción 1 del segundo menú"));
        menu2.add(new JMenuItem("Esto la opción 2 del segundo menú"));

        barraMenu.add(menu);
        barraMenu.add(menu2);
        this.setJMenuBar(barraMenu);

        // mostrarmos ventana y configuramos el cierre
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        VentanaComponentes v = new VentanaComponentes();
    }
}
