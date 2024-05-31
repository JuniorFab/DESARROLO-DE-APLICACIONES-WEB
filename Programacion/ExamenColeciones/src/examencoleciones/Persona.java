/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examencoleciones;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 *
 * @author Junior Fabricio
 */
public class Persona implements Comparable<Persona> {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private LocalDate fechaNac;

    public Persona(String nombre, String apellido1, LocalDate fecha) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.fechaNac = fecha;
        this.edad = Period.between(fechaNac, LocalDate.now()).getYears();
    }

    public Persona(String nombre, String apellido1, String apellido2, LocalDate fecha) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNac = fecha;
        this.edad = Period.between(fechaNac, LocalDate.now()).getYears();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad=" + edad + ", fechaNac=" + fechaNac + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + Objects.hashCode(this.apellido1);
        hash = 89 * hash + Objects.hashCode(this.apellido2);
        hash = 89 * hash + this.edad;
        hash = 89 * hash + Objects.hashCode(this.fechaNac);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido1, other.apellido1)) {
            return false;
        }
        if (!Objects.equals(this.apellido2, other.apellido2)) {
            return false;
        }
        return Objects.equals(this.fechaNac, other.fechaNac);
    }

    @Override
    public int compareTo(Persona o) {
        return this.apellido1.compareTo(o.apellido1);
    }

}
