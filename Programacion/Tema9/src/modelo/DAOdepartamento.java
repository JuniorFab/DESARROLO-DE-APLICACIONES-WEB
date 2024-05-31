/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author DAW
 */
public interface DAOdepartamento {

    //insertar
    boolean insertar(Departamento departamento);
    //actualizar

    boolean actualizar(Departamento departamento);

    //eliminar
    boolean eliminar(Departamento departamento, int dept_no);

    //listar un 
    Departamento buscar(int dept_no);

    //listar todos 
    ArrayList<Departamento> listar();
    
    

}
