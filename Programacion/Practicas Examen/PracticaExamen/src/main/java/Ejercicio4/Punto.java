/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Junior Fabricio
 */
public class Punto implements Comparable<Punto> {

    //Atributos
    private int posX;
    private int posY;
    //Constructor

    public Punto(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }
    //Getter setter

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    @Override
    public String toString() {
        return "Punto{" + "posX=" + posX + ", posY=" + posY + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Punto other = (Punto) obj;
        if (this.posX != other.posX) {
            return false;
        }
        return this.posY == other.posY;
    }

    @Override
    public int compareTo(Punto o) {

        if (this.posX + this.posY < o.getPosX() + o.getPosY()) {
            return -1;
        } else if (this.posX + this.posY > o.getPosX() + o.posY) {
            return 1;
        } else {
            return 0;
        }
    }

}
