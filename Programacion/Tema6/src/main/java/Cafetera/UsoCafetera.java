/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafetera;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Alfonso
 */
public class UsoCafetera {

    public static void main(String[] args) {

        Cafetera c1 = new Cafetera(3456);
        c1.setPrecio(876);

        Cafetera c2 = new Cafetera(32432);
        c2.setPrecio(443);
        Cafetera c3 = new Cafetera(15500);
        c3.setPrecio(665);
        ArrayList<Cafetera> lista = new ArrayList<>();
        
        lista.add(c1);
            lista.get(0).setMarca("n");
      
        
        lista.add(c2);
            lista.get(1).setMarca("si");
        
        lista.add(c3);
            lista.get(2).setMarca("o");
        
        lista.add(new Cafetera(12));
        lista.get(3).setPrecio(2353);
        
        
        lista.add(new Cafetera(745));
        lista.get(4).setPrecio(22);
        lista.get(4).setMarca("juan");
        
        lista.add(new Cafetera(99999));
        lista.get(5).setPrecio(345);
                lista.get(5).setMarca("Ana");
        
        
        lista.add(new Cafetera(5010));
        lista.get(6).setPrecio(240);
        lista.get(6).setMarca("Messi");
        
        System.out.println(lista);
        
        
     
        

 

    }

}
