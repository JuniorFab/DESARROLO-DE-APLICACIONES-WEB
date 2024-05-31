/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema9maven;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daw
 */
public class Ejemplo2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/departamentos";
        String usuario = "root";
        String contraseña = "rm2223";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Numero de empleado ");
            int numero = teclado.nextInt();
//            System.out.println("Introduce el codigo de departamento ");
//            int num_depto = teclado.nextInt();
//            teclado.nextLine();
//            System.out.println("Nombre de departamento ");
//            String nombre_dpto = teclado.nextLine();
//            System.out.println("Localidad ");
//            String loc = teclado.nextLine();
                            
            PreparedStatement ps = conexion.prepareStatement("call calcula_comision(?); ");
                  ps.setInt(1, numero);
                 
           
            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("Resgistro insertado ");

            } else {
                System.out.println("Resgistro no insertado");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ejemplo2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Ejemplo2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
