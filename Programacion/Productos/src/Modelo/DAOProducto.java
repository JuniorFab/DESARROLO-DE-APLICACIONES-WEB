/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

/**
 *
 * @author daw
 */
public interface DAOProducto {

    //Para buscar un producto por su codigo
    Producto buscarproducto(int codigo);

    //Para añadir un producto 
    boolean añadirProducto(Producto p);
    //Para modificar algo de dicho producto (Tener en cuenta que la clave primari no se puede )

    boolean modificar(int idproducto, String codigo, String nombre, double precio, int cantidad);
    //Para la eliminacion de un producto por el codigo de producto

    boolean eliminarProducto(int codigo);

    //Limpiar los campos
    boolean limpiarcampos();

}
