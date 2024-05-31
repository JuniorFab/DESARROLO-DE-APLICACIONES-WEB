/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClinicaVeterinaria1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Junior Fabricio
 */
public class Claseejecutable {

    public static void main(String[] args) {

        ClinicaVeterinaria clinica = new ClinicaVeterinaria();
        String nombre = null;
        String comentarios = null;
        int opcion = 0;
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("------Opcion--------");
            System.out.println("1-1nsertar animal");
            System.out.println("2-Busca animal ");
            System.out.println("3-Modifica comentario animal ");
            System.out.println("4-Muestra lista de animales ");
            System.out.println("Introduce opcion ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:

                    insertarAnimal(clinica);
                    break;
                case 2:
                    System.out.println("Introduce el nombre del animal ");
                    teclado.nextLine();
                    nombre = teclado.nextLine();
                    System.out.println(clinica.Buscaranimal(nombre));
                    break;
                case 3:
                    System.out.println("Introduce el nombre del animal ");

                    teclado.nextLine();
                    nombre = teclado.nextLine();
                    System.out.println("Introduce el comentario");
                    String comentario = teclado.nextLine();
                    clinica.modificarComentarioanimal(nombre, comentario);

                    break;
//                case 3:
//                    System.out.println("Introduce el nombre del animal ");
//                    
//                    teclado.nextLine();
//                    nombre = teclado.nextLine();
//                    System.out.println("Introduce el comentario");
//                    String comentario = teclado.nextLine();
//                    clinica.modificarComentarioanimal(nombre, comentario);
//                    break;
                case 4:
                    System.out.println(clinica.toString());
                    break;
                default:
                    System.out.println("Fin de programa");
            }
        } while (opcion != 5);

    }

    public static void insertarAnimal(ClinicaVeterinaria clinica) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Selecciona el tipo de animal a insertar: ");
            System.out.println("\t1. Perro");
            System.out.println("\t2. Gato");
            System.out.println("\t3. Pájaro");
            System.out.println("\t4. Reptil");
            System.out.println("\t5. Salir");
            System.out.println("Introduce opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    clinica.añadiranimal(leerPerro());
                    break;
                case 2:
                    clinica.añadiranimal(leergato());
                    break;
                case 3:
                    clinica.añadiranimal(Leerpajaro());
                    break;
                case 4:
                    clinica.añadiranimal(leerReptil());
                    break;
                case 5:
                    break;

            }

        } while (opcion != 5);

    }

//    public static Animal leerPerro() {
//        Scanner sc = new Scanner(System.in);
//        String formato = "dd/MM/yyyy";
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(formato);
//
//        System.out.println("Introduce nombre:");
//        String nombre = sc.nextLine();
//        System.out.println("Introduce fecha de nacimiento: (dd/mm/yyyy)");
//        String sFecha = sc.nextLine();
//
//        LocalDate fecha = LocalDate.parse(sFecha, dtf);
//        System.out.println("Introduce peso:");
//        double peso = sc.nextDouble();
//        sc.nextLine();
//        System.out.println("Introduce raza:(1-Pastor alemán 2-Husky 3-Fosterrier 4-Dalmata 5-San Bernardo ");
//        int selecRaza = sc.nextInt();
//        Tipo raza = null;
//        switch (selecRaza) {
//            case 1:
//                raza = Tipo.PastorAleman;
//                break;
//            case 2:
//                raza = Tipo.FoxTerrier;
//                break;
//            case 3:
//                raza = Tipo.Husky;
//                break;
//            case 4:
//                raza = Tipo.SanBernardo;
//                break;
//            case 5:
//                raza = Tipo.Dalmata;
//                break;
//        }
//        System.out.println("Microchip ");
//        String micro = sc.nextLine();
//        return new Perro(nombre, raza, fecha, peso, micro);
//
//    }
    public static Animal leerPerro() {
        Scanner sc = new Scanner(System.in);
        String formato = "dd/MM/yyyy";

        System.out.println("Introduce nombre:");
        String nombre = sc.nextLine();
        System.out.println("Introduce fecha de nacimiento: (dd/mm/yyyy)");
        String sFecha = sc.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(formato);
        LocalDate fecha = LocalDate.parse(sFecha, dtf);

        System.out.println("Introduce peso:");
        double peso = sc.nextDouble();
        sc.nextLine(); // Consumir el carácter de nueva línea restante en el búfer

        System.out.println("Introduce raza:(1-Pastor alemán 2-Husky 3-Fosterrier 4-Dalmata 5-San Bernardo ");
        int selecRaza = sc.nextInt();
        sc.nextLine(); // Consumir el carácter de nueva línea restante en el búfer

        Tipo raza = null;
        switch (selecRaza) {
            case 1:
                raza = Tipo.PastorAleman;
                break;
            case 2:
                raza = Tipo.FoxTerrier;
                break;
            case 3:
                raza = Tipo.Husky;
                break;
            case 4:
                raza = Tipo.SanBernardo;
                break;
            case 5:
                raza = Tipo.Dalmata;
                break;
        }

        System.out.println("Microchip ");
        String micro = sc.nextLine();

        return new Perro(nombre, raza, fecha, peso, micro);
    }

    public static Animal leergato() {
        Scanner teclado = new Scanner(System.in);

        String formato = "dd/MM/yyyy";
        System.out.println("Introduce el nombre ");
        String nombre = teclado.nextLine();
        System.out.println("Introduce la fecha /dd/mm/yyyy");
        String fecha = teclado.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(formato);
        LocalDate fechasa = LocalDate.parse(fecha, dtf);

        System.out.println("Introduce un peso ");
        double peso = teclado.nextDouble();
        System.out.println("Ijntroduce le tipo de raza  1 Comun, 2 Siames, 3 Persa, 4 Angora, 5 ScottishFold");
        int elegirraza = teclado.nextInt();
        Razagato tipo = null;
        switch (elegirraza) {
            case 1:
                tipo = tipo.Angora;
                break;
            case 2:
                tipo = tipo.Comun;
                break;
            case 3:
                tipo = tipo.Persa;
                break;
            case 4:
                tipo = Razagato.ScottishFold;
                break;
            case 5:
                tipo = Razagato.Siames;
                break;

        }
        teclado.nextLine();
        System.out.println("Microchip");
        String micro = teclado.nextLine();

        return new Gato(nombre, tipo, fechasa, peso, micro);
    }

    public static Animal Leerpajaro() {
        String formato = "dd/MM/yyy";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre ");
        String nombre = teclado.nextLine();
        System.out.println("Introduce la fecha de nacimineto ");
        String f = teclado.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(formato);

        LocalDate fecha = LocalDate.parse(f, dtf);
        System.out.println("Introduce el peso ");
        double peso = teclado.nextDouble();
        System.out.println("De que especie 1-Canario, 2-Periquito, 3-Apaponis ");
        int opcion = teclado.nextInt();
        EspeciePajaro a = null;
        switch (opcion) {
            case 1:
                a = a.Apaponis;
                break;
            case 2:
                a = a.Canario;
                break;
            case 3:
                a = a.Periquito;
                break;
        }
        System.out.println("Es cantor (S/N)");
        char isCantor = teclado.next().charAt(0);
        teclado.nextLine();
        if (isCantor == 's' || isCantor == 'S') {
            return new Pajaro(nombre, a, fecha, peso, true);
        } else {
            return new Pajaro(nombre, a, fecha, peso, false);
        }
    }

    public static Animal leerReptil() {
        Scanner teclado = new Scanner(System.in);
        String formato = "dd/MM/yyyy";
        System.out.println("Introduce el nombre ");
        String nombre = teclado.nextLine();
        System.out.println("Introduce la fecha de nacimiento ");
        String f = teclado.nextLine();

        DateTimeFormatter si = DateTimeFormatter.ofPattern(formato);
        LocalDate fecha = LocalDate.parse(f, si);
        System.out.println("Introduce el peso ");
        double peso = teclado.nextDouble();

        teclado.nextLine();

        System.out.println("De que especie es 1-TORTUGA, 2-IGUANA, 3-DRAGON_DE_KOMODO;");
        int opcion = teclado.nextInt();
        EspecieReptil a = null;
        switch (opcion) {
            case 1:
                a = a.DRAGON_DE_KOMODO;
                break;
            case 2:
                a = a.IGUANA;
                break;
            case 3:
                a = a.TORTUGA;
                break;

        }
        teclado.nextLine();

        System.out.println("Es venenoso S/N");
        char isven = teclado.next().charAt(0);
        if (isven == 'S' || isven == 's') {
            return new Reptil(nombre, fecha, peso, a, true);
        } else {
            return new Reptil(nombre, fecha, peso, a, false);
        }
    }
}
