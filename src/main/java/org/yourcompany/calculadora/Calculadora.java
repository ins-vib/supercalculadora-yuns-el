package org.yourcompany.calculadora;

import java.util.Scanner;

/**
 * Clase principal para la aplicación de consola SuperCalculadora.
 * Permite realizar varias operaciones matemáticas: suma de números consecutivos,
 * factorial, suma de cuadrados, cálculo de potencias y recuento de dígitos.
 * Todas las operaciones se ejecutan en consola y la entrada/salida es interactiva.
 * 
 * @author Younes El Hailoufi Chemakha
 */
public class Calculadora {

    /**
     * Método principal del programa. Muestra un menú de opciones por consola 
     * y gestiona la interacción con el usuario permitiendo realizar varias 
     * operaciones matemáticas hasta que el usuario decida salir.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
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
                    int opcio2;
                    do{
                    System.out.print("Introdueix un nombre per calcular el factorial: ");
                    int n2 = lector.nextInt();
                    System.out.println("Factorial de " + n2 + ": " + calcularFactorial(n2));
                    do{
                    System.out.println();
                    System.out.println("Introdueix 1 per repetir el calcul o 0 per tornar al menu.");
                    opcio2 = lector.nextInt();
                    } while (opcio2 != 1 && opcio2 != 0);
                    } while (opcio2 != 0);
                }
                case 3 -> {
                    int opcio3;
                    do{
                    System.out.print("Introdueix un nombre n: ");
                    int n3 = lector.nextInt();
                    System.out.println("Suma dels quadrats dels primers " + n3 + " numeros: " + sumaQuadrats(n3));
                    do{
                    System.out.println();
                    System.out.println("Introdueix 1 per repetir el calcul o 0 per tornar al menu.");
                    opcio3 = lector.nextInt();
                    } while (opcio3 != 1 && opcio3 != 0);
                    } while (opcio3 != 0);
                }
                case 4 -> {
                    int opcio4;
                    do{
                    System.out.print("Introdueix la base: ");
                    double base = lector.nextDouble();
                    System.out.print("Introdueix l'exponent: ");
                    int exponent = lector.nextInt();
                    System.out.println(base + " elevat a la potencia " + exponent + ": " + calcularPotencia(base, exponent));
                    do{
                    System.out.println();
                    System.out.println("Introdueix 1 per repetir el calcul o 0 per tornar al menu.");
                    opcio4 = lector.nextInt();
                    } while (opcio4 != 1 && opcio4 != 0);
                    } while (opcio4 != 0);
                }
                case 5 -> {
                    int opcio5;
                    do{
                    System.out.print("Introdueix un nombre: ");
                    int n5 = lector.nextInt();
                    System.out.println("Nombre de digits de " + n5 + ": " + nombreDigits(n5));
                    do{
                    System.out.println();
                    System.out.println("Introdueix 1 per repetir el calcul o 0 per tornar al menu.");
                    opcio5 = lector.nextInt();
                    } while (opcio5 != 1 && opcio5 != 0);
                    } while (opcio5 != 0);
                }
                case 6 -> System.out.println("Sortint del programa. Adeu!");
                default -> System.out.println("Opcio no valida. Torna-ho a intentar.");
            }
            System.out.println();
        } while (opcio != 6);

    }

    /**
     * Muestra el menú principal en consola con las operaciones disponibles.
     * Incluye una breve descripción de cada opción.
     */

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

    /**
     * Calcula el número de dígitos del número dado.
     *
     * @param nombre Número entero del cual se cuentan los dígitos.
     * @return Número de dígitos de {@code nombre}. Si {@code nombre} es 0, devuelve 1.
     */
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

    /**
     * Calcula la suma de los primeros {@code n} números enteros.
     *
     * @param n Número hasta el cual se realiza la suma (incluido).
     * @return Suma de los números desde 1 hasta {@code n}.
     */
    public static int sumaPrimersNumeros(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    /**
     * Calcula el factorial de un número entero dado.
     *
     * @param n Número entero del cual se calcula el factorial.
     * @return El valor del factorial como {@code long}. Si {@code n} es 0 o 1, devuelve 1.
     */
    public static long calcularFactorial(int n) {
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Calcula la suma de los cuadrados de los primeros {@code n} números enteros.
     *
     * @param n Número hasta el cual se suma los cuadrados (incluido).
     * @return Suma de los cuadrados de los números desde 1 hasta {@code n}.
     */
    public static int sumaQuadrats(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * i;
        }
        return suma;
    }

     /**
     * Calcula la potencia de una base elevada a un exponente.
     *
     * @param base Valor de la base.
     * @param exponent Exponente al cual se eleva la base (debe ser un entero >= 0).
     * @return Resultado de {@code base} elevado a {@code exponent}.
     */
    public static double calcularPotencia(double base, int exponent) {
        double resultat = 1;
        for (int i = 0; i < exponent; i++) {
            resultat *= base;
        }
        return resultat;
    }
    
}