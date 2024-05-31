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
public class Reptil extends Animal {
    //Atributos

    private final EspecieReptil especie;
    private boolean venenoso;

    //Construcion
    public Reptil(String pNombre, LocalDate pFechNac, double pPeso, EspecieReptil pEspecie, boolean pVeneno) {
        super(pNombre, pFechNac, pPeso);
        this.especie = pEspecie;
        this.venenoso = pVeneno;
    }
    //Getter y Setter
    public EspecieReptil getEspecie() {
        return especie;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    @Override
    public String toString() {
        return "Reptil{"
                + "nombre='" + super.getNombre() + '\''
                + ", fechaNacimiento=" + super.getFecha_nacimiento()
                + ", peso=" + super.getPeso()
                + ", comentarios='" + super.getComentarios() + '\''
                + ", Venenoso=" + "\tCanta: " + (this.venenoso ? "Si" : "No") + "\n";
    }
;
}
