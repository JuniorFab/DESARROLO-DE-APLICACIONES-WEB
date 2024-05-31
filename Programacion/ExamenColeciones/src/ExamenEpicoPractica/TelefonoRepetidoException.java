/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenEpicoPractica;

/**
 *
 * @author Junior Fabricio
 */
public class TelefonoRepetidoException extends Exception {

    public TelefonoRepetidoException(Contacto o) {
        super("El contacto " + o.getNombre() + " tiene un numero repetido " + o.getTelefono());
    }
}
