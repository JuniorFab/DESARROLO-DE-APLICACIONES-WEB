/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author daw
 */
public interface Relaciones {

    //Metodos
    public abstract boolean esMayor(Object b);

    public abstract boolean esMenor(Object b);

    public abstract boolean esIgual(Object b);

    public static boolean esNull(Relaciones b) {
        return b == null;
    }

    default String nombreClase() {
        String clase = getClass().toString();
        int posicion = clase.lastIndexOf(".");
        return clase.substring(posicion + 1);
    }
}
