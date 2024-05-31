/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1Figuras;

import java.util.ArrayList;

/**
 *
 * @author daw
 */
public class PrincipalFiguras {

    public static void main(String[] args) {

        ArrayList<Figura> figuras = new ArrayList<>();
//         Figura t3 = new figura(2, 4, 9, 10); ESto no se puede hacer por que es abstracta

        Figura t2 = new Triangulo(2, 4, 9, 10);
        Triangulo t = new Triangulo(2, 4, 9, 10);
       
        figuras.add(t);
        figuras.add(t2);
    }
}
