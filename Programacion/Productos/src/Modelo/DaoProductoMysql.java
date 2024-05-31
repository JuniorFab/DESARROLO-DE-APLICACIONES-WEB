/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.*;
import Conection.ConectionDataBase;
import Modelo.Producto;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daw
 */
public class DaoProductoMysql implements DAOProducto {

    @Override
    public Producto buscarproducto(int idcodigo) {
        Producto productos = null;
        Connection conexion = null;

        try {
            conexion = ConectionDataBase.conectar();
            PreparedStatement ps = conexion.prepareStatement("SELECT * FROM Producto where idproducto=?;");
            ps.setInt(1, idcodigo);
            ResultSet a = ps.executeQuery();
            if (a.next()) {
                String codigoa = a.getString("codigo");
                String nombre = a.getString("nombre");
                double precio = a.getDouble("precio");
                int cantidad = a.getInt("cantidad");
                productos = new Producto(idcodigo, codigoa, nombre, precio, cantidad);
            }
            conexion.close();

            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error SQL");
        }

        return productos;
    }

    @Override
    public boolean añadirProducto(Producto p) {

        try {
            Connection conexion = null;

            conexion = ConectionDataBase.conectar();
            PreparedStatement ps = conexion.prepareStatement("INSERT INTO producto (codigo, nombre, precio, cantidad) VALUES (?,?,?,?);");

            ps.setString(1, p.getCodigo());
            ps.setString(2, p.getNombre());
            ps.setDouble(3, p.getPrecio());
            ps.setInt(4, p.getCantidad());
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Producto añadido correctamente.");
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Error SQL: " + ex.getMessage());
            ex.printStackTrace();
        }
        return false;

    }
    

    @Override
    public boolean modificar(int idproducto, String codigo, String nombre, double precio, int cantidad) {
        try {
            Connection conexion = null;
            conexion = ConectionDataBase.conectar();
            PreparedStatement ps = conexion.prepareStatement("UPDATE producto SET codigo=? , nombre= ?, precio= ?, cantidad= ? where idproducto= ?;");
            ps.setString(1, codigo);
            ps.setString(2, nombre);
            ps.setDouble(3, precio);
            ps.setInt(4, cantidad);
            ps.setInt(5, idproducto);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Producto modificado correctamente.");
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Error SQL");
        }
        return false;
    }

    @Override
    public boolean eliminarProducto(int codigo) {
        boolean eliminado = false;
        try {
            Connection conexion = null;

            conexion = ConectionDataBase.conectar();
            PreparedStatement ps = conexion.prepareStatement("DELETE FROM producto where idproducto=?;");
            ps.setInt(1, codigo);
            int filasAfectadas = ps.executeUpdate();
            eliminado = (filasAfectadas > 0);
            if (eliminado) {
                System.out.println("Se ha eliminado");
            } else {
                System.out.println("No se ha eliminado ");
            }

        } catch (SQLException ex) {
            System.out.println("Error SQL");
        }
        return false;

    }

    @Override
    public boolean limpiarcampos() {
       return false;
       //Aqui tengo una duda si este metodo hay que hacerlo como tal o directamente desde controllerproducto para limpiar los cuadros
    }

}
