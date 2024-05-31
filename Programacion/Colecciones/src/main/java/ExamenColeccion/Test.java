/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ExamenColeccion;

/**
 *
 * @author Alfonso
 */
public class Test {

    public static void main(String[] args) {
        
        Agenda a = new Agenda("Susanita");
        
        Contacto c1 = new Contacto("a", "a", 1L);
        Contacto c2 = new Contacto("b", "b", 2L);
        Contacto c3 = new Contacto("c", "c", 3L);
        
        a.añadir(c1);
        a.añadir(c2 );
        a.añadir(c3);
        
        System.out.println(a);
        
        a.borrar("a");
        
        System.out.println(a);
        
    }
}
