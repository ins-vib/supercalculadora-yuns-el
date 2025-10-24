package org.yourcompany.calculadora;

/**
 *
 * @author Posa el teu nom
 */

import java.util.Random;
public class Calculadora {

    public static void main(String[] args) {
        int[] result100 = nombreLLancaments(100);
        int[] result1000 = nombreLLancaments(1000);
        int[] result2000 = nombreLLancaments(2000);
        
        System.out.println("100 llancaments - cares: " + result100[0] + ", creus: " + result100[1]);
        System.out.println("1000 llancaments - cares: " + result1000[0] + ", creus: " + result1000[1]);
        System.out.println("2000 llancaments - cares: " + result2000[0] + ", creus: " + result2000[1]);
        preuEntrada(true, false, 5);
    }

    public static int[] nombreLLancaments(int veces) {
        Random random = new Random();
        int caras = 0;
        int creus = 0;

        for (int i = 0; i < veces; i++) {
            int lanzamiento = random.nextInt(2);
            if (lanzamiento == 0) {
                caras++;
            } else {
                creus++;
            }
        }

        return new int[]{caras, creus};
    } 
    public static void preuEntrada(boolean capDeSetmana, boolean carnetJove, double Preu) {
        // TODO code application logic here
        if (capDeSetmana == false){
            Preu = 5;
        } else if (capDeSetmana == true){
            Preu = Preu+(Preu*10/100);
        }
        if (carnetJove == true){
            Preu = Preu-(Preu*15/100);
            System.out.println("El preu de l'entrada son: " + Preu + " euros");
        } else if (carnetJove == false){
            System.out.println("El preu de l'entrada son: " + Preu + " euros");
        }
    }
    
}
