/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenColeccion;

/**
 *
 * @author daw
 */
public class TelefonoRepetidoException extends Exception{

    public TelefonoRepetidoException(Contacto c) {
        super("No se puede añadir el contacto "+c.getNombre()+"y telefono "+c.getTelefono());
    }
    
    
}
