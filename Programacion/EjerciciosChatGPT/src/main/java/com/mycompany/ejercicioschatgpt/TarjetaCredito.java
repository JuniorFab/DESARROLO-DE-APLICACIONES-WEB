/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioschatgpt;

/**
 *
 * @author Junior Fabricio
 */
public abstract class TarjetaCredito implements MetodoDePago {

    //Atributos
    private String numeroTarjeta;
    private String fechaExpiracion;
    private String ccv;

    public TarjetaCredito(String numeroTarjeta, String fechaExpiracion, String ccv) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaExpiracion = fechaExpiracion;
        this.ccv = ccv;
    }
    

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getCcv() {
        return ccv;
    }

    public void setCcv(String ccv) {
        this.ccv = ccv;
    }
  

   


    
    public abstract void procesarPago();

    @Override
    public void realizarpago(double cantidad) {
        System.out.println("Realizado pago"
                + "");
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" + "numeroTarjeta=" + numeroTarjeta + ", fechaExpiracion=" + fechaExpiracion + ", ccv=" + ccv + '}';
    }

}
