/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1Interface;

/**
 *
 * @author daw
 */
public class ArrayReales implements Estadistica {

    private double[] numeros;

    public ArrayReales(int tama) {
        this.numeros = new double[tama];

    }

    public void rellenar() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Math.random() * 10;
        }
    }

    public void imprimir() {
        for (double e : numeros) {
            System.out.println(e);
        }

    }

    @Override
    public double minimo() {
        double mim = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < mim) {
                mim = numeros[i];

            }
        }
        return mim;
    }

    @Override
    public double max() {
        double max = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];

            }
        }
        return max;

    }

    @Override
    public double sumatario() {
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma;
    }

}
