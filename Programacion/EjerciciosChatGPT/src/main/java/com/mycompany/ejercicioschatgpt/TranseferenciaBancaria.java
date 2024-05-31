/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioschatgpt;

/**
 *
 * @author Junior Fabricio
 */
public class TranseferenciaBancaria implements MetodoDePago {

    private String iban;

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
    

    @Override
    public void realizarpago(double cantidad) {
        System.out.println("Realizando transferencia bancaria de $" + cantidad + " al IBAN " + iban);
    }

    @Override
    public String toString() {
        return "TranseferenciaBancaria{" + "iban=" + iban + '}';
    }

}
