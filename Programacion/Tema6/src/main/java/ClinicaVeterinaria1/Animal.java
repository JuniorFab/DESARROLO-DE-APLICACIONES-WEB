/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClinicaVeterinaria1;

import java.time.LocalDate;

/**
 *
 * @author Junior Fabricio
 */
public abstract class Animal {

    //Atributo
    private String nombre;
    private LocalDate Fecha_nacimiento;
    private double peso;
    private String comentarios;
    
    //Constructores

    public Animal(String nombre, LocalDate Fecha_nacimiento, double peso) {
        this.nombre = nombre;
        this.Fecha_nacimiento = Fecha_nacimiento;
        this.peso = peso;
    }
    

    public Animal(String nombre, LocalDate Fecha_nacimiento, double peso, String comentarios) {
        this.nombre = nombre;
        this.Fecha_nacimiento = Fecha_nacimiento;
        this.peso = peso;
        this.comentarios = comentarios;
    }
    //Metodos Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate Fecha_nacimiento) {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    //Metodo Abstracto 
    public abstract String toString();

}
