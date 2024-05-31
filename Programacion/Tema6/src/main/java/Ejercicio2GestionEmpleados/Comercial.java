/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2GestionEmpleados;

/**
 *
 * @author daw
 */
public class Comercial extends Empleados {

    //Atributo
    private double comision;

    //Constructores 
    public Comercial(double comision, String Nombre, int edad, double salario) {
        super(Nombre, edad, salario);
        this.comision = comision;
    }
    //Getter y Setters

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public double plus() {
        double preciofinal = super.getSalario();
        if (super.getEdad() > 30 && comision > 200) {
            return preciofinal + Empleados.getPLUS();
        } else {
            return preciofinal;
        }

    }

    @Override
    public String toString() {
        return "Repartidor{" + "comision=" + comision + '}';
    }
}
