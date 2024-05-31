/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciointbbdd;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Junior Fabricio
 */
public class EjercicioIntBBDD {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/departamentos";
        String usuario = "root";
        String contraseña = "rm2223";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Introduce el numero de departamento ");
            int num_dept = teclado.nextInt();
            PreparedStatement st = conexion.prepareStatement("SELECT * FROM empleados WHERE dept_no=?");
            st.setInt(1, num_dept);
            ResultSet rs = st.executeQuery();
            
            
            while (rs.next()) {
                int emp_no = rs.getInt("emp_no");
                String apellido = rs.getString("apellido");
                String oficio = rs.getString("oficio");
                String dir = rs.getString("dir");
                Date fecha_alt = rs.getDate("fecha_alt");
                double salario = rs.getDouble("salario");
                double comision = rs.getDouble("comision");
                int dept_no = rs.getInt("dept_no");

                System.out.println(emp_no + "\t" + apellido + "\t" + oficio + "\t" + dir + "\t" + fecha_alt + "\t" + salario + "\t" + comision + "\t" + dept_no);

            }
            rs.close();
            st.close();
            conexion.close();
        } catch (ClassNotFoundException ex) {
            System.out.println(" No se encuentra la clase ");
        } catch (SQLException ex) {
            System.out.println(" Erro de SQL ");
        }
    }

}
