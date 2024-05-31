/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author DAW
 */
public class VentanaComponentesEventos extends JFrame {
    private JLabel jLabel;
    private JButton jButton;
    private JTextField jTextField;
    private JCheckBox jCheckBox1;
    private JCheckBox jCheckBox2;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton3; 
    
    private JMenu menu1 ;
    private JMenuBar barraMenu;
    private JMenuItem opcion1;
    private JMenu menu2;
    
    public VentanaComponentesEventos() {
        // creamos la ventana
        super("Ventana con componentes");
        this.setLayout(new FlowLayout());
        this.setSize(700, 500);

        // creamos JLabel
        jLabel = new JLabel("Esto es un JLabel");
        this.add(jLabel);

        // creamos JButton
        jButton = new JButton("Botón");
        this.add(jButton);

        // creamos JTextField
        jTextField = new JTextField("Esto es un JTextField");
        this.add(jTextField);

         //añadimos un evento al botón
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Al clicar el botón vamos a enviar un texto a la etiqueta
                String jText = jTextField.getText();
                jLabel.setText(jText);
                jLabel.setForeground(Color.red);
                jLabel.setBackground(Color.yellow);

            }

        });
        // creamos JCheckBox
        jCheckBox1 = new JCheckBox("CheckBox1");
        this.add(jCheckBox1);//Sea añade a la ventana
        jCheckBox2 = new JCheckBox("CheckBox2");
        this.add(jCheckBox2);//Se añade a la ventana
        //Añadimos los eventos de los jCheckBox
        jCheckBox1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("Has seleccionado "+jCheckBox1.getText());
                jLabel.setForeground(Color.PINK);
            }
        });
        
        
        // creamos JRadioButton
        jRadioButton1 = new JRadioButton("RadioButton1");
        jRadioButton2 = new JRadioButton("RadioButton2");
        jRadioButton3 = new JRadioButton("RadioButton3");
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(jRadioButton1);
        grupo.add(jRadioButton2);
        grupo.add(jRadioButton3);
        this.add(jRadioButton1);
        this.add(jRadioButton2);
        this.add(jRadioButton3);
        //Eventos de los radioButton
        jRadioButton1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(jRadioButton1.isSelected()? "opcion 1 seleccionada":"");
                jLabel.setText("Has seleccionado "+jRadioButton1.getText());
                jLabel.setForeground(Color.GREEN);
            }
        
        });
        jRadioButton2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(jRadioButton2.isSelected()? "opcion 1 seleccionada":"");
                jLabel.setText("Has seleccionado "+jRadioButton2.getText());
                jLabel.setForeground(Color.CYAN);
            }
        
        });
         // menu de opciones
        barraMenu = new JMenuBar();
        menu1 = new JMenu("Menu 1");
        opcion1 = new JMenuItem("Opción 1");
        menu1.add(opcion1);
        JMenuItem opcion2 = new JMenuItem("Opción 2");
        menu1.add(opcion2);
        //Eventos de menu
        opcion1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("Has pulsado la opción 1 del menú 1");
                jLabel.setForeground(Color.red);

            }

        });
        menu2 = new JMenu("Menu 2");
        menu2.add(new JMenuItem("Esto la opción 1 del segundo menú"));
        menu2.add(new JMenuItem("Esto la opción 2 del segundo menú"));

        barraMenu.add(menu1);
        barraMenu.add(menu2);
        this.setJMenuBar(barraMenu);

        // mostrarmos ventana y configuramos el cierre
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        VentanaComponentesEventos v = new VentanaComponentesEventos();
    }
}
