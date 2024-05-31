/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebabasededatos;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Pruebabasededatos {

    public static void main(String[] args) {
        Scanner tecldo = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/departamentos";
        String usuario = "root";
        String contraseña = "root";
        int i = 1;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement st = conexion.createStatement();
            System.out.println("Introduce el codigo de departamento ");
            int num_depto = tecldo.nextInt();
            tecldo.nextLine();
            System.out.println("Nombre de departamento ");
            String nombre_dpto = tecldo.nextLine();
            System.out.println("Localidad ");
            String loc = tecldo.nextLine();
            boolean rusul = st.execute(" INSERT INTO departamentos VALUES(" + num_depto + ",'" + nombre_dpto + "','" + loc + "'); ");
            if (!rusul) {
                System.out.println("Se ha insertado corectamente");
            } else {
                System.out.println("No se ha insertado  ");
            }
            st.close();
            conexion.close();
            tecldo.close();

//            ResultSet rs = st.executeQuery("Select * from departamentos;");
//
//            while (rs.next()) {
//
//                int num_dept = rs.getInt(1);
//                String nombre = rs.getString(2);
//                String loc = rs.getString(3);
//                System.out.println(" --- Resgistro " + i + " ---");
////                System.out.println(num_dept);
////                System.out.println(nombre);
////                System.out.println(loc);
//                System.out.println(rs.getInt("dept_no"));
//                System.out.println(rs.getString("dnombre"));
//                System.out.println(rs.getString("loc"));
//
//                i++;
//            }
        } catch (ClassNotFoundException ex) {
            System.out.println("No es encuentra la clase ");
        } catch (SQLException ex) {
            System.out.println("Error sql");
        }
    }
}
