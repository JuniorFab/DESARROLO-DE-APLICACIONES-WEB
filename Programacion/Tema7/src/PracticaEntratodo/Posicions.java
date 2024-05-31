/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package PracticaEntratodo;

/**
 *
 * @author DAW
 */
public enum Posicions {
    PORTERO("Portero", 2000, 3000),
    DEFENSA("Defensa", 2500, 3500),
    DELANTERO("Delantero", 4000, 5000),
    CENROCAMPISTA("CENTROCAMPISTA", 3500, 4000);

    private final String nombrePosicion;
    private final double sueldoMax;
    private final double sueldoMin;

    private Posicions(String nombrePosicion, double sueldoMin, double sueldoMax) {
        this.nombrePosicion = nombrePosicion;
        this.sueldoMax = sueldoMax;
        this.sueldoMin = sueldoMin;
    }

    public String getNombrePosicion() {
        return nombrePosicion;
    }

    public double getSueldoMax() {
        return sueldoMax;
    }

    public double getSueldoMin() {
        return sueldoMin;
    }

}
