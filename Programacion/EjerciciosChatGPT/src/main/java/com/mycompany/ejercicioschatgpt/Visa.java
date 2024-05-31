/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioschatgpt;

/**
 *
 * @author Junior Fabricio
 */
public class Visa extends TarjetaCredito {

    public Visa(String numeroTarjeta, String fechaExpiracion, String ccv) {
        super(numeroTarjeta, fechaExpiracion, ccv);
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta Visa...");
    }

    @Override
    public String toString() {
        return "Visa{" + super.toString()+ '}';
    }

}