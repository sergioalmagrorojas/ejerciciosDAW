/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5_1;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class ejercicio43 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Este programa parte un número en dos.");
        System.out.println("Introduce un número entero positivo: ");
        int numeroIntroducido = x.nextInt();

        System.out.println("Introduce la posición a partir de la cual quiere partir el número:");
        int parte2 = x.nextInt();

        int inverso = 0;

        // Invertimos el numero para contar la posicion desde la izquierda
        while (numeroIntroducido > 0) {
            inverso = (inverso * 10) + (numeroIntroducido % 10);
            numeroIntroducido = numeroIntroducido / 10;
        }

        numeroIntroducido = 0;

        // Parte en dos el numero
        while (parte2 > 1) {
            numeroIntroducido = (numeroIntroducido * 10) + (inverso % 10);
            inverso = inverso / 10;
            parte2--;
        }
        
        // termina de dar la vuelta al numero para ponerlo al derecho
        parte2 = 0;
        while (inverso > 0) {
            parte2 = (parte2 * 10) + (inverso % 10);
            inverso = inverso / 10;
        }

        System.out.println("Los numeros partidos son: " + numeroIntroducido + " y " + parte2);

    }
}
