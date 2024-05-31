/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author DAW
 */
public class DatabaseConnection {
        private static  String url = "jdbc:mysql://localhost:3306/departamentos";
        private static  String usuario = "root";
        private static  String contraseña = "root";
        
    public static Connection conectar(){
        Connection con=null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con=DriverManager.getConnection(url,usuario,contraseña);
            } catch (SQLException ex) {
                System.out.println("Error al conector ");
            } catch (ClassNotFoundException ex) {
                System.out.println("No se encuentra el archivo ");
            }
            return con;
           
    }
}
