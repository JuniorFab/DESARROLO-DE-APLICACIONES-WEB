/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosInterfaces;

/**
 *
 * @author SMR
 */
public class ArrayReales implements Estadisticas {

    //Atributos
    double array[];
    //Constructor

    public ArrayReales(int n) {
        this.array = new double[n];
    }

    //Metodos
    public void rellenar() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * 40) + 1;
        }
    }

    @Override
    public double maximo() {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        return max;
    }

    @Override
    public double minimo() {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }
        }
        return min;
    }

    @Override
    public double sumatorio() {
        double suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }

}
