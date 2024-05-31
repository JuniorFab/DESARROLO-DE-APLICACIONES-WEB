/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaEntratodo;

/**
 *
 * @author daw
 */
public class ResgistroFutbolistaExcepcion extends Exception{

    public ResgistroFutbolistaExcepcion(Futbolista f) {
        super(" El futbolista "+f.getNombre()+" No puede ser añadido a la posicion "+f.getPosicion().getNombrePosicion());
    }
    
}
