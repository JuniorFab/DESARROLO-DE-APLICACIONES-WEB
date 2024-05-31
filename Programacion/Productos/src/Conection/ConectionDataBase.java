/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daw
 */
public class ConectionDataBase {

    private static String url = "jdbc:mysql://localhost:3306/producto";
    private static String usuario = "root";
    private static String contraseña = "rm2223";
    
    public static Connection conectar() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexion = DriverManager.getConnection(url, usuario, contraseña);

        } catch (ClassNotFoundException ex) {

            System.out.println("Clase no encontrada");
        } catch (SQLException ex) {
            System.out.println("Error al conectar");
        }
        return conexion;

    }

}
