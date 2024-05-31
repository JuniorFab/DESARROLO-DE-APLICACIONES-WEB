/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemplosNuevos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Susana Rosa susana.rosa@murciaeduca.es
 */
public class Principal {

    public static void main(String[] args) {
        Departamento p1 = new Departamento(10, "Ventas", "Murcia");
        Departamento p2 = new Departamento(20, "Compras", "Murcia");
        Departamento p3 = new Departamento(30, "Ventas", "Alicante");
        //Listas
        ArrayList<Departamento> lista = new ArrayList();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
      //  System.out.println(lista);
        if(lista.contains(p1)){
            System.out.println("Contenido"); //Funciona aunque no implementemos equals
        }
        if(lista.contains(new Departamento(10,"Ventas","Murcia"))){
            System.out.println("Contenido 2"); //No funciona a no ser que implementemos equals
        }
        
        lista.remove(new Departamento(10,"Ventas","Murcia")); //Esto no encontraria el objeto a no ser que implementemos equals
    //    System.out.println(lista);
//       for(Departamento d: lista){
//           if(p.getDept_no()==10)
//               lista.remove(p); //Lanza una java.util.ConcurrentModificationException
//       }
       
        Iterator<Departamento> it = lista.iterator();
        while (it.hasNext()) {
            Departamento p = it.next();
            if (p.getDept_no() == 20) {
                it.remove(); //elimina el último 
            }
        }
       // System.out.println(lista);
        HashSet<Departamento> set = new HashSet<>();
        
        set.add(p1);
        set.add(p1);//No lo añade aunque no se implemente equals
        set.add(new Departamento(10, "Ventas", "Murcia")); //lo añade dando a duplicados a no ser que implementemos equals
        System.out.println(set);
        Collections.sort(lista);
               System.out.println(set);

//        TreeSet<Departamento> set2 = new TreeSet<>();
//        set2.add(p1);
//        set2.add(p1);
//        set2.add(p2);
//        set2.add(new Departamento(20,"Compras","Murcia"));
//        System.out.println(set2);
    }

}
