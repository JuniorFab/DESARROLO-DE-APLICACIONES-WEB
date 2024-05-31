/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2GestionEmpleados;

/**
 *
 * @author daw
 */
public class Repartidor extends Empleados {

    private String zona;

    public Repartidor(String tipo, String Nombre, int edad, double salario) {
        super(Nombre, edad, salario);
        this.zona = tipo;
    }

    public String getTipo() {
        return zona;
    }

    public void setTipo(String tipo) {
        this.zona = tipo;
    }

    public double plus() {
        double preciofinal = super.getSalario();

        if (super.getEdad() < 25 && zona.equalsIgnoreCase("zona3")) {
            return preciofinal + Empleados.getPLUS();
        } else {
            return preciofinal;
        }

    }

    @Override
    public String toString() {
        return "Repartidor{" + "tipo=" + zona + '}';
    }

}
