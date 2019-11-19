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
public class ejercicio44 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.println("Introduce un número entero positivo: ");
        int numeroIntroducido = s.nextInt();

        System.out.println("Introduce la posición del digito:");
        int parte2 = s.nextInt();
        
        System.out.println("Introduce el nuevo digito:");
        int digito = s.nextInt();
        
        int inverso = 0;

        
        while (numeroIntroducido > 0) {
            inverso = (inverso * 10) + (numeroIntroducido % 10);
            numeroIntroducido = numeroIntroducido / 10;
        }

        numeroIntroducido = 0;

       
        while (parte2 > 1) {
            numeroIntroducido = (numeroIntroducido * 10) + (inverso % 10);
            inverso = inverso / 10;
            parte2--;
        }
        
        
        parte2 = 0;
        while (inverso > 0) {
            parte2 = (parte2 * 10) + (inverso % 10);
            inverso = inverso / 10;
        }

        System.out.println("El numero resultante es : " + numeroIntroducido +digito + parte2);

    }
}
