/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioschatgpt;

/**
 *
 * @author Junior Fabricio
 */
public class Paypal implements MetodoDePago {

    private String correoElectronico;

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void realizarpago(double cantidad) {
        System.out.println("Realizando pago con PayPal de $" + cantidad + " al correo " + correoElectronico);
    }

    @Override
    public String toString() {
        return "Paypal{" + "correoElectronico=" + correoElectronico + '}';
    }

}
