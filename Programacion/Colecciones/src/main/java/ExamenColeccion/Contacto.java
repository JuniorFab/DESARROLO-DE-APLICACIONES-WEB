/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenColeccion;

import java.util.Objects;

/**
 *
 * @author daw
 */
public class Contacto implements Comparable<Contacto>{
        
    private String nombre;
    private String Email;
    private Long Telefono;

    public Contacto() {
    }

    public Contacto(String nombre, String Email, Long Telefono) {
        this.nombre = nombre;
        this.Email = Email;
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Long getTelefono() {
        return Telefono;
    }

    public void setTelefono(Long Telefono) {
        this.Telefono = Telefono;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.Email);
        hash = 59 * hash + Objects.hashCode(this.Telefono);
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
        final Contacto other = (Contacto) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.Email, other.Email)) {
            return false;
        }
        return Objects.equals(this.Telefono, other.Telefono);
    }

    
    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", Email=" + Email + ", Telefono=" + Telefono + '}';
    }

    @Override
    public int compareTo(Contacto o) {
        return 0;
    }

}
