/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Furvo;

/**
 *
 * @author Junior Fabricio
 */
public enum Posiciones {
    PORTERO("Portero", 2000, 3000),
    DEFENSA("Defensa", 2500, 3500),
    CENTROCAMPISTA("CentroCampista", 3500, 4000),
    DELANTERO("Delantero", 4000, 5000);

    private final String nombre;
    private final double salarioMaximo;
    private final double salarioMinimo;

    private Posiciones(String nombre, double salarioMinimo, double salarioMaximo) {
        this.nombre = nombre;
        this.salarioMaximo = salarioMaximo;
        this.salarioMinimo = salarioMinimo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioMaximo() {
        return salarioMaximo;
    }

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

}
