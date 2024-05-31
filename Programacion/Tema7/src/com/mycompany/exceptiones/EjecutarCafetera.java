/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptiones;

/**
 *
 * @author daw
 */
public class EjecutarCafetera {
    public static void main(String[] args) {
        Cafetera c1 = new Cafetera();
        try{
            c1.agregarCafe(3000); //Asi recogemos la excepcion
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void llenar (Cafetera c, int cantidad){
        c.agregarCafe(3000);
    }
}
