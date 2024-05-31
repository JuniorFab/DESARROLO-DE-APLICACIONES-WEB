/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioschatgpt;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Junior Fabricio
 */
public class Main {

    public static void main(String[] args) {

        Visa visa = new Visa("1234556", " 01/27", "123");
    
        visa.procesarPago();

        Mastercard mastercard = new Mastercard("12323421", "02/30", "423");
        mastercard.procesarPago();

        Paypal paypal = new Paypal();
        paypal.setCorreoElectronico("ejemplo@paypal.com");
        paypal.realizarpago(200);

        TranseferenciaBancaria transferencia = new TranseferenciaBancaria();
        transferencia.setIban("ES12345678901234567890");
        transferencia.realizarpago(200);
        Paypal a = new Paypal();
        a.setCorreoElectronico("ejemplo@paypal.com");

        TranseferenciaBancaria t = new TranseferenciaBancaria();
        transferencia.setIban("ES12345678901234567890");
        ArrayList<Pagos> pagos = new ArrayList<>();
        pagos.add(new Pagos(100, mastercard));
        pagos.add(new Pagos(2, visa));
        Collections.sort(pagos);
        for (Pagos p : pagos) {
            System.out.println(p);
        }

    }
}
