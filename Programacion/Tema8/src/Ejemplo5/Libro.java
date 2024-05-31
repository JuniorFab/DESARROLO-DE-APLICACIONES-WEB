/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo5;

import java.io.Serializable;

/**
 *
 * @author daw
 */
public class Libro implements Serializable{
    private String titulo;
    private int numPag;
    private String ISBN;

    public Libro(String titulo, int numPag, String ISBN) {
        this.titulo = titulo;
        this.numPag = numPag;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", numPag=" + numPag + ", ISBN=" + ISBN + '}';
    }
    
    
}
