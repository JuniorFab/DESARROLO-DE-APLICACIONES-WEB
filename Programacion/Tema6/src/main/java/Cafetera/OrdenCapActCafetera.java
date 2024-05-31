/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cafetera;

import java.util.Comparator;

/**
 *
 * @author Alfonso
 */
public class OrdenCapActCafetera  implements Comparator<Cafetera>{

    @Override
    public int compare(Cafetera o1, Cafetera o2) {

        if(o1.getCapacidadActual() > o2.getCapacidadActual()){
            
            return 1;
            
        } else if(o1.getCapacidadActual() < o2.getCapacidadActual()){
            
            return -1;
            
        } else {
            
            return 0;
            
        }


    }
    
    

}
