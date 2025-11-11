package org.yourcompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author Posa el teu nom
 */

public class Calculadora {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcio;
        do {
            mostrarMenuConsola();
            System.out.print("Escull una opcio: ");
            opcio = lector.nextInt();

            switch (opcio) {
                case 1 -> {
                    int opcio1;
                    do{
                    System.out.print("Introdueix un nombre n: ");
                    int n1 = lector.nextInt();
                    System.out.println("Suma dels primers " + n1 + " numeros: " + sumaPrimersNumeros(n1));
                    do{
                    System.out.println();
                    System.out.println("Introdueix 1 per repetir el calcul o 0 per tornar al menu.");
                    opcio1 = lector.nextInt();
                    } while (opcio1 != 1 && opcio1 != 0);
                    } while (opcio1 != 0);
                }
                case 2 -> {
                    do{
                    System.out.print("Introdueix un nombre per calcular el factorial: ");
                    System.out.println("Introdueix 0 per sortir.");
                    int n2 = lector.nextInt();
                    System.out.println("Factorial de " + n2 + ": " + calcularFactorial(n2));
                    } while (opcio != 0);
                }
                case 3 -> {
                    do{
                    System.out.print("Introdueix un nombre n: ");
                    System.out.println("Introdueix 0 per sortir.");
                    int n3 = lector.nextInt();
                    System.out.println("Suma dels quadrats dels primers " + n3 + " numeros: " + sumaQuadrats(n3));
                    } while (opcio != 0);
                }
                case 4 -> {
                    do{
                    System.out.print("Introdueix la base: ");
                    System.out.println("Introdueix 0 per sortir.");
                    double base = lector.nextDouble();
                    System.out.print("Introdueix l'exponent: ");
                    int exponent = lector.nextInt();
                    System.out.println(base + " elevat a la potencia " + exponent + ": " + calcularPotencia(base, exponent));
                    } while (opcio != 0);
                }
                case 5 -> {
                    do{
                    System.out.print("Introdueix un nombre: ");
                    int n5 = lector.nextInt();
                    System.out.println("Nombre de digits de " + n5 + ": " + nombreDigits(n5));
                    } while (opcio != 0);
                }
                case 6 -> System.out.println("Sortint del programa. Adeu!");
                default -> System.out.println("Opcio no valida. Torna-ho a intentar.");
            }
            System.out.println();
        } while (opcio != 6);

    }

    // Aquesta funcio mostra un menu de seleccio d'operacions que vols fer.
    // Totes les operacions es fan a la consola i tant el imput com el resultat tambe es a la consola.
    // Per seleccionar l'operacio, s'introdueix un numero corresponent a l'operacio.
    // Les opcion son entre 1 i 5, i la opcio 6 es per sortir del programa.

    public static void mostrarMenuConsola() {
        System.out.println("Menu de SuperCalculadora:");
        System.out.println("1- Suma dels primers numeros");
        // Aquesta opcio suma els numero succesivament desde 1 fins al nombre indicat, per exemple si s'introdueix 4, el resultat sera 1+2+3+4=10.
        System.out.println("2- Factorial d'un nombre");
        // Aquesta opcio calcula el factorial del nombre indicat, per exemple si s'introdueix 4, el resultat sera 4!=4*3*2*1=24.
        System.out.println("3- Suma dels quadrats dels primers numeros");
        // Aquesta opcio suma els quadrats dels numeros succesivament desde 1 fins al nombre indicat, per exemple si s'introdueix 3, el resultat sera 1^2+2^2+3^2=14.
        System.out.println("4- Potencia d'un nombre");
        // Aquesta opcio calcula la potencia d'un nombre indicat, per exemple si s'introdueix base=2 i exponent=3, el resultat sera 2^3=8.
        System.out.println("5- Nombre de digits d'un nombre");
        // Aquesta opcio calcula el nombre de digits d'un nombre indicat, per exemple si s'introdueix 345, el resultat sera 3.
        System.out.println("6- Sortir");
        // Aquesta opcio surt del programa.
        // Si es introdueix una opcio no valida, es mostra un missatge d'error.
        // ↓↓↓ Si vols afegir mes opcions, pots fer-ho aqui ↓↓↓
    }

    public static int nombreDigits(int nombre) {
        if (nombre == 0) {
            return 1;
        }
        int comptador = 0;
        while (nombre != 0) {
            nombre /= 10;
            comptador++;
        }
        return comptador;
    }

    public static int sumaPrimersNumeros(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    public static long calcularFactorial(int n) {
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int sumaQuadrats(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * i;
        }
        return suma;
    }

    public static double calcularPotencia(double base, int exponent) {
        double resultat = 1;
        for (int i = 0; i < exponent; i++) {
            resultat *= base;
        }
        return resultat;
    }

}
