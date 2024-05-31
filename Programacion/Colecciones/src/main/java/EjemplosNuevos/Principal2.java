package EjemplosNuevos;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Susana Rosa susana.rosa@murciaeduca.es
 */
public class Principal2 {

    public static void main(String[] args) {
        //Cómo crear un mapa de tipo Hash
        //Un mapa es una serie de pares o entradas <clave, valor> y en Java el tipo de cada par se dice una Entry
        HashMap<Coche, Integer> mapa = new HashMap<>();
        mapa.put(new Coche("Seat", "Rojo"), 3);
        mapa.put(new Coche("Cupra", "Blanco"), 3);
        mapa.put(new Coche("Cupra", "Blanco"), 6);
        System.out.println(mapa);
        //La clase Coche debe implementar equals para evitar claves duplicadas
        if (mapa.containsKey(new Coche("Seat", "Rojo"))) {
            System.out.println("Clave contenida");
        }
        if (mapa.containsValue(3)) {
            System.out.println("Valor contenido");
        }
        //Forma 1 para Recorrido de un mapa. Se recorre igual un hashmap que un treemap
        for (Map.Entry<Coche, Integer> coches : mapa.entrySet()) {
            System.out.print(coches.getKey());
            System.out.println(" " + coches.getValue());
        }

        //Forma 2 para recorrido de un mapa. 
        Set<Map.Entry<Coche, Integer>> conjunto = mapa.entrySet();
        for (Map.Entry<Coche, Integer> ele : conjunto) {
            System.out.println(ele.getKey());
            System.out.println(ele.getValue());
        }

        System.out.println("-------------------PARTE 2 CON TREESET --------------------------------");
        TreeMap<Coche, Integer> arbol = new TreeMap<>();
        // Aqui creamos un mapa de tipo Arbol. La clase que hace de clave, en este caso Coche, 
        // está obligada a implementar Comparable y definir el orden natural de los elementos
        arbol.put(new Coche("Cupra", "Rojo"), 3);
        arbol.put(new Coche("Seat", "Rojo"), 3);
        arbol.put(new Coche("Cupra", "Blanco"), 3);
        arbol.put(new Coche("Cupra", "Blanco"), 6);
        System.out.println(arbol);
        //La clase Coche debe implementar compareTo para evitar la exception java.lang.ClassCastException
        //Recorrido de un mapa (es igual que con un Hashmap)
        for (Map.Entry<Coche, Integer> coches : arbol.entrySet()) {
            System.out.print(coches.getKey());
            System.out.println(" " + coches.getValue());
        }

        //Equivale a:
        Set<Map.Entry<Coche, Integer>> conjunto2 = arbol.entrySet();
        for (Map.Entry<Coche, Integer> ele : conjunto2) {
            System.out.println(ele.getKey());
            System.out.println(ele.getValue());
        }

        //Iterador. Se usa para poder eliminar entradas y se aplica igual con un TreeMap que con HashMap
        Iterator<Map.Entry<Coche, Integer>> it = conjunto.iterator();
        while (it.hasNext()) {
            Map.Entry<Coche, Integer> par = it.next();
            System.out.println(par.getKey());
            System.out.println(par.getValue());
            //it.remove(); //Asi se elimina un elemento que cumpla alguna determinada condicion
        }
        //También podemos extraer de un mapa el conjunto de claves únicamente
        Set<Coche> myKeySet = mapa.keySet(); //Este método devuelve un conjunto con todos los coches del mapa
//Iterador sobre el conjunto de claves de tipo Coche
        Iterator<Coche> it2 = mapa.keySet().iterator();
        while (it2.hasNext()) {
            Coche unCoche = it2.next();
            System.out.println("Datos de un coche " + unCoche);
            Integer valor = mapa.get(unCoche);
            System.out.println("Valor asociado a este coche " + valor);
            if (unCoche.getColor().equalsIgnoreCase("blanco") && unCoche.getMarca().equalsIgnoreCase("Cupra")) {
                it2.remove(); //Elimina el objeto que cumpla este criterio
            }
        }
        //Ahora podemos iterar sobre este set como hacemos con cualquier conjunto
        //Iterar con un foreach:
        for (Coche coche : myKeySet) {
            System.out.print("Color " + coche.getColor());
            System.out.print(" Marca " + coche.getMarca());
            Integer valor = mapa.get(coche);
            System.out.println(" Valor asociado " + valor);
        }
    }
}
