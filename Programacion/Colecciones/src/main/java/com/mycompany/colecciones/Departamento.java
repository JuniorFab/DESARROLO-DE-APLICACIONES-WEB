package com.mycompany.colecciones;

import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Susana Rosa <susana.rosa@murciaeduca.es>
 *
 */

public class Departamento implements Comparable<Departamento>{

    private int dept_no;
    private String dnombre;
    private String loc;

    public Departamento() {
    }

    public Departamento(int dept_no, String dnombre, String loc) {
        this.dept_no = dept_no;
        this.dnombre = dnombre;
        this.loc = loc;
    }

    public int getDept_no() {
        return dept_no;
    }

    public void setDept_no(int dept_no) {
        this.dept_no = dept_no;
    }

    public String getDnombre() {
        return dnombre;
    }

    public void setDnombre(String dnombre) {
        this.dnombre = dnombre;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Departamento{" + "dept_no=" + dept_no + ", dnombre=" + dnombre + ", loc=" + loc + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.dept_no;
        hash = 13 * hash + Objects.hashCode(this.dnombre);
        hash = 13 * hash + Objects.hashCode(this.loc);
        return hash;
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
        final Departamento other = (Departamento) obj;
        if (this.dept_no != other.dept_no) {
            return false;
        }
        if (!Objects.equals(this.dnombre, other.dnombre)) {
            return false;
        }
        return Objects.equals(this.loc, other.loc);
    }

    @Override
    public int compareTo(Departamento o) {
        if (this.getDept_no() < o.getDept_no()) {
            return -1;
        } else if (this.getDept_no() > o.getDept_no()) {
            return 1;
        } else {
            return 0;
        }
    }

}
