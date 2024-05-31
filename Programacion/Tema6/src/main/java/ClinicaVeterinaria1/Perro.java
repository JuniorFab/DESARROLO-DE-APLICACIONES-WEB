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
public class Perro extends Animal {

    //Atributos
    private Tipo raza;
    private String microchip;

    //Atributos
    public Perro(String pNombre, Tipo pRaza, LocalDate pFechNac, double pPeso, String pMicro) {
        super(pNombre, pFechNac, pPeso);
        this.raza = pRaza;
        this.microchip = pMicro;
    }

    //Getter
    public Tipo getRaza() {
        return raza;
    }

    public String getMicrochip() {
        return microchip;
    }

    @Override
    public String toString() {
        String salida;
        salida = "Ficha del perro:\n";
        salida += "\tNombre: " + this.getNombre() + "\n";
        salida += "\tRaza: " + this.raza + "\n";
        salida += "\tFecha nacimiento: " + this.getFecha_nacimiento() + "\n";
        salida += "\tPeso: " + this.getPeso() + " kg\n";
        salida += "\tMicrochip: " + this.microchip + "\n";
        salida += "\tComentarios: " + this.getComentarios() + "\n";

        return salida;
    }
}
