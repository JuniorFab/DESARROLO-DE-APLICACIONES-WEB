
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author daw
 */
public class Principal {

    public static void main(String[] args) {
          LinkedList<Estudiante> lista= new LinkedList<>();
          Estudiante a=new Estudiante("Maria Pedraza", "12343567", 19);
          Estudiante b=new Estudiante("Alvaro Rico ", "12343567", 19);
          Estudiante c=new Estudiante();
          Estudiante d=new Estudiante("Maria Pedraza", "12343567", 19);
          Estudiante e=new Estudiante("Maria Pedraza", "12343567", 19);
          lista.add(a);
          lista.add(b);
          lista.add(c);
          lista.add(d);
          lista.add(e);
          
          System.out.println(lista);
          
          
          
          
    }
}
