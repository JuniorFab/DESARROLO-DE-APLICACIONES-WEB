/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer2;

import java.util.Objects;

/**
 *
 * @author Junior Fabricio
 */
public class Estudiante {

    private String nombre;
    private int edad;
    private String NRE;

    public Estudiante(String nombre, int edad, String NRE) {
        this.nombre = nombre;
        this.edad = edad;
        this.NRE = NRE;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNRE() {
        return NRE;
    }

    public void setNRE(String NRE) {
        this.NRE = NRE;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", NRE=" + NRE + ", edad=" + edad + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Estudiante other = (Estudiante) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.NRE, other.NRE);
    }

}
