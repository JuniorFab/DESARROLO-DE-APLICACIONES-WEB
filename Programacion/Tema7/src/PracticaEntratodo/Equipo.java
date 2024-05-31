/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaEntratodo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DAW
 */
public class Equipo {

    private String nombreEquipo;
    private ArrayList<Futbolista> listaFutbolista;

    private static final Map<Posicions, Integer> Max_futbolistas_posicion = new HashMap<>();

    static {
        Max_futbolistas_posicion.put(Posicions.PORTERO, 2);
        Max_futbolistas_posicion.put(Posicions.DEFENSA, 5);
        Max_futbolistas_posicion.put(Posicions.CENROCAMPISTA, 5);
        Max_futbolistas_posicion.put(Posicions.DELANTERO, 4);

    }

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.listaFutbolista = new ArrayList<>();
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void agregarFutbolista(Futbolista futbolista) {

        try {
            int futbolistaposicion = ObtenerJUgadorPosicion(futbolista.getPosicion());
            if (futbolistaposicion == Max_futbolistas_posicion.get(futbolista.getPosicion())) {
                throw new ResgistroFutbolistaExcepcion(futbolista);
            } 
            listaFutbolista.add(futbolista);
        } catch () {

        }

    }

    public int ObtenerJUgadorPosicion(Posicions p) {
        int contador = 0;
        for (Futbolista f : listaFutbolista) {
            if (f.getPosicion() == p) {
                contador++;
            }
        }
        return contador;
    }

}
