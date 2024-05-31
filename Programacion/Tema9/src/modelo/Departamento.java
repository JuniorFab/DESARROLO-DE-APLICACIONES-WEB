/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author DAW
 */
public class Departamento {
     private int Dept_no;
    private String nombre;
    private String loc;

    public Departamento() {
    }

    public Departamento(int Dept_no, String nombre, String loc) {
        this.Dept_no = Dept_no;
        this.nombre = nombre;
        this.loc = loc;
    }

    
    public int getDept_no() {
        return Dept_no;
    }

    public void setDept_no(int Dept_no) {
        this.Dept_no = Dept_no;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "Dept_no=" + Dept_no + ", nombre=" + nombre + ", loc=" + loc + '}';
    }

}
