/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tema9maven;

import java.sql.*;

/**
 *
 * @author daw
 */
public class Tema9Maven {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/departamentos ";
        String usuario = "root";
        String contraseña = "root";
        int i = 1;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("Select * from departamentos;");

            while (rs.next()) {

                int num_dept = rs.getInt(1);
                String nombre = rs.getString(2);
                String loc = rs.getString(3);
                System.out.println(" --- Resgistro " + i + " ---");
//                System.out.println(num_dept);
//                System.out.println(nombre);
//                System.out.println(loc);
                System.out.println(rs.getInt("dept_no"));
                System.out.println(rs.getString("dnombre"));
                System.out.println(rs.getString("loc"));

                i++;
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("No es encuentra la clase ");
        } catch (SQLException ex) {
            System.out.println("Error sql");
        }
    }
}
