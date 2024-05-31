/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAW
 */
public class DAOdepartamentoMYSQL implements DAOdepartamento {

    @Override
    public boolean insertar(Departamento departamento) {
        boolean retorno = false;
        Connection conexion = null;
        try {
            conexion = DatabaseConnection.conectar();
            PreparedStatement ps = conexion.prepareStatement("INSERT INTO departamentos values(?,?,?);");
            ps.setInt(1, departamento.getDept_no());
            ps.setString(2, departamento.getNombre());
            ps.setString(3, departamento.getLoc());
            int Resultado = ps.executeUpdate();
            if (Resultado > 0) {
                retorno = true;

            }

        } catch (SQLException ex) {
            System.out.println("Error SQL ");
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                System.out.println("Erro al cerrar la conexión de la base de datos ");
            }
        }
        return retorno;
    }

    @Override
    public boolean actualizar(Departamento departamento) {
        try {
            Connection conexion= DatabaseConnection.conectar();
           
            PreparedStatement pst= conexion.prepareStatement("a");
            return false;
        } catch (SQLException ex) {
            System.out.println("Error al actualizar ");
        }
        return false;
    }

    @Override
    public boolean eliminar(Departamento departamento, int dept_no) {
        boolean exito = false;
    Connection conexion = null;
    try {
        conexion = DatabaseConnection.conectar();
        PreparedStatement ps = conexion.prepareStatement("DELETE FROM departamentos WHERE dept_no = ?");
        ps.setInt(1, dept_no);
        int resultado = ps.executeUpdate();
        if (resultado > 0) {
            exito = true;
        }
    } catch (SQLException ex) {
        System.out.println("Error al eliminar el departamento: " + ex.getMessage());
    } finally {
        try {
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexión de la base de datos: " + ex.getMessage());
        }
    }
    return exito;
    }

    @Override
    public Departamento buscar(int dept_no) {
        Departamento departamento = null;
        String sql = "SELECT * FROM departamentos  WHERE dept_no=?;";
        try {

            Connection conexion = DatabaseConnection.conectar();

            PreparedStatement pr = conexion.prepareStatement(sql);
            pr.setInt(1, dept_no);

            ResultSet registro = pr.executeQuery();
            if (registro.next()) {
                departamento = new Departamento(registro.getInt("dept_no"), registro.getString("dnombre"), registro.getString("loc"));
            }
            conexion.close();

        } catch (SQLException ex) {
            System.out.println("Error al conectar ");
        }
        return departamento;

    }

    @Override
    public ArrayList<Departamento> listar() {
        ArrayList<Departamento> listado = new ArrayList<>();
        Departamento departamento = null;
        Connection conexion = null;
        try {
            conexion = DatabaseConnection.conectar();
            Statement st = conexion.createStatement();
            ResultSet resul = st.executeQuery("Select * from departamentos ;");
            while (resul.next()) {
                int dept_no = resul.getInt("dept_no");
                String nombre = resul.getString("dnombre");
                String loc = resul.getString("loc");
                departamento = new Departamento(dept_no, nombre, loc);
                listado.add(departamento);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOdepartamentoMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException ex) {
                    System.out.println("Erro al cerrar la conexion ");
                }
            }

        }
        return listado;
    }

}
