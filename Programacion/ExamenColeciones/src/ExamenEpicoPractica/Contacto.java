/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenEpicoPractica;

import java.util.Objects;

/**
 *
 * @author Junior Fabricio
 */
public class Contacto implements Comparable<Contacto> {

    private String nombre;
    private String email;
    private Long Telefono;

    public Contacto() {
    }

    public Contacto(String nombre, String email, Long Telefono) {
        this.nombre = nombre;
        this.email = email;
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelefono() {
        return Telefono;
    }

    public void setTelefono(Long Telefono) {
        this.Telefono = Telefono;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", email=" + email + ", Telefono=" + Telefono + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.email);
        hash = 67 * hash + Objects.hashCode(this.Telefono);
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
        return Objects.equals(this.Telefono, other.Telefono);
    }

    
    @Override
    public int compareTo(Contacto o) {
        return this.nombre.compareTo(o.getNombre());
    }

}
