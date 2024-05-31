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
public class Gato extends Animal {

    //Atributos
    private Razagato tipo;
    private String microchip;

    //Constructor
      public Gato(String pNombre, Razagato pRaza, LocalDate pFechNac, double pPeso, String pMicro) {
        super(pNombre, pFechNac, pPeso);
        this.tipo = pRaza;
        this.microchip = pMicro;
    }
      //Getter y setter
      
      
      
    @Override
    public String toString() {
        return "Perro{"
                + "nombre='" + super.getNombre() + '\''
                + ", fechaNacimiento=" + super.getFecha_nacimiento()
                + ", peso=" + super.getPeso()
                + ", comentarios='" + super.getComentarios() + '\''
                + ", raza=" + tipo
                + ", microchip='" + microchip + '\''
                + '}';
        
    }

}
