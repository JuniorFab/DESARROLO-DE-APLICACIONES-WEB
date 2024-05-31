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
public class Pajaro extends Animal {

    //Atributo 
    private final EspeciePajaro tipo;
    private boolean cantor;

    public Pajaro(String pNombre, EspeciePajaro pEspecie, LocalDate pFechNac, double pPeso, boolean pCantor) {
        super(pNombre, pFechNac, pPeso);
        this.tipo = pEspecie;
        this.cantor = pCantor;

    }

    public EspeciePajaro getTipo() {
        return tipo;
    }

    public boolean isCantor() {
        return cantor;
    }

    public void setCantor(boolean cantor) {
        this.cantor = cantor;
    }

    @Override
    public String toString() {
        return "Pajaro{"
                + "nombre='" + super.getNombre() + '\''
                + ", fechaNacimiento=" + super.getFecha_nacimiento()
                + ", peso=" + super.getPeso()
                + ", comentarios='" + super.getComentarios() + '\''
                + ", raza=" + tipo
                + ", Cantor='" + cantor + '\''
                + '}';
    }
}
