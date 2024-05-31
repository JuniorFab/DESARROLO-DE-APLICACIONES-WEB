/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7;

/**
 *
 * @author daw
 */
public class EJEMPLOA {

    public static void main(String[] args) throws Exception  {
        Cafetera c1 = new Cafetera();
        try {
          
           c1.agregarCafe(3000);
        } catch (DesbordamientoExcepcion e) {
            System.out.println(e.getMessage());
        }
    }

//    public static void llenarCafetera(Cafetera c ,int cantidad) throws Exception {
//            c.agregarCafe(3000);
//    }
}
