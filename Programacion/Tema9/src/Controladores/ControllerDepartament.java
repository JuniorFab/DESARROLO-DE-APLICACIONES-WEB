/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.DAOdepartamentoMYSQL;
import modelo.Departamento;
import vistas.JFrameDepartamentos;

/**
 *
 * @author daw
 */
public class ControllerDepartament {

    private JFrameDepartamentos vista;
    private DAOdepartamentoMYSQL dao;

    public ControllerDepartament(JFrameDepartamentos vista, DAOdepartamentoMYSQL dao) {
        this.vista = vista;
        this.dao = dao;
        listartodos();
        this.vista.jComboBoxDepartamentos.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String ele= (String) vista.jComboBoxDepartamentos.getSelectedItem();
                System.out.println(ele);
            }
        });
        
    }

    
    public void listartodos(){
        ArrayList<Departamento> listado=this.dao.listar(); 
        this.vista.jComboBoxDepartamentos.removeAllItems();
        for (Departamento d : listado) {
            this.vista.jComboBoxDepartamentos.addItem(d.getNombre());
            
        }
       
    }
    
}
