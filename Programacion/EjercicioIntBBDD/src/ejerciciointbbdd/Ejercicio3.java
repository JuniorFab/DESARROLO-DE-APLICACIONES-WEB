/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointbbdd;


import java.sql.*;
import java.util.Scanner;


/**
 *
 * @author daw
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/departamentos";
        String usuario = "root";
        String contraseña = "rm2223";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Introduce el numero empleado ");
            int emp_no = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Introduce el apellido ");
            String apellido = teclado.nextLine(); 
            System.out.println("Introduce oficio ");
            String oficio = teclado.nextLine();
            System.out.println("Introduce  dir ");
            int dir = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Introduce fecha alta ");
            String fecha_alt = teclado.nextLine();
            System.out.println("Introdudce su salario ");
            double salario = teclado.nextDouble();
            System.out.println("Introduce comision ");
            double comision = teclado.nextDouble();
            teclado.nextLine();
            System.out.println("introduce el codigo de departamento ");
            int dept_no = teclado.nextInt();
            PreparedStatement ps = conexion.prepareStatement("INSERT INTO empleados  values (?,?,?,?,?,?,?,?);");
            ps.setInt(1, emp_no);
            ps.setString(2, apellido);
            ps.setString(3, oficio);
            ps.setInt(4, dir);
            ps.setString(5, fecha_alt);
            ps.setDouble(6, salario);
            ps.setDouble(7, comision);
            ps.setInt(8, dept_no);

            if (ps.executeUpdate() > 0) {
                System.out.println("Resgistro insertado");

            } else {
                System.out.println("Resgistro no insertado");

            }
        } catch (ClassNotFoundException ex) {
            System.out.println("La clase no se ha encontrado :c ");
        } catch (SQLException ex) {
            System.out.println("Error SQL :c");
        }

    }
}
