/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author DAW
 */
public class Aplicacion {

    public static void main(String[] args) {
        DAOdepartamentoMYSQL departamento = new DAOdepartamentoMYSQL();
        System.out.println(departamento.buscar(10));
        System.out.println(departamento.listar());
        ArrayList<Departamento> istado = departamento.listar();
        for (Departamento de : istado) {
            System.out.println(de);

        }
        
        Departamento dp1 = new Departamento(60, "A", "Chiuaua");
        if (departamento.insertar(dp1)) {
            System.out.println("Registro insertado ");
        } else {
            System.out.println("Resgistro no insertado ");
        }
    }
}
