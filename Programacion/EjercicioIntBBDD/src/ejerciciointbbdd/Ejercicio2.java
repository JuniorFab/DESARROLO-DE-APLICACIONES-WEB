/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointbbdd;

import java.sql.*;

/**
 *
 * @author Junior Fabricio
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/departamentos";
        String usuario = "root";
        String contraseña = "rm2223";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT dept_no,count(*) AS total_empleados FROM empleados GROUP BY dept_no;");
            while (rs.next()) {
                int dept = rs.getInt("dept_no");
                int total_empleados = rs.getInt("total_empleados");
                System.out.println("Departamento " + dept + " tiene " + total_empleados + " empleados");
            }
            conexion.close();
            st.close();
            rs.close();

        } catch (ClassNotFoundException ex) {
            System.out.println("No encuentra la clase ");
        } catch (SQLException ex) {
            System.out.println("Error SQL");
        }

    }
}
