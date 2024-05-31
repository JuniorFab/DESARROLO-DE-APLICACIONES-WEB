/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones;

import java.util.Comparator;

/**
 *
 * @author daw
 */
public class Comparador implements Comparator<Departamento> {

    @Override
    public int compare(Departamento o1, Departamento o2) {
        return o1.getDnombre().compareTo(o2.getDnombre());
    }

}
