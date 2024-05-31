/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author daw
 */
public class Nombrecompleto implements Comparable<Nombrecompleto> {

    private String nombre;
    private String apellidos;

    public Nombrecompleto(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public int compareTo(Nombrecompleto o) {
        if (this.apellidos.compareTo(o.getApellidos()) == 0) {
            return this.nombre.compareTo(o.nombre);

        }
        return this.apellidos.compareTo(o.apellidos);

    }

    @Override
    public String toString() {
        return "Nombrecompleto{" + "nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }

}
