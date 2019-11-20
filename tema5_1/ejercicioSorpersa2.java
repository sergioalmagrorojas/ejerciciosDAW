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
public class ejercicioSorpersa2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int menor = 0;
        int nota = 0;
        int suma;
        int contador = 0;
        double media;

        suma = nota;

        do {
            System.out.print("Introduzca notas: ");
            nota = s.nextInt();

            if (nota >= 5 && nota <= 10) {
                suma += nota;
                contador++;
            } else if (nota < 5 && nota >= 0) {
                contador++;
                if (menor > nota) {
                    menor = nota;
                }

            }
        } while (nota > 0);

        if (menor == 10) {
            media = (suma / contador);
            if (media < 5) {
                media = menor;
            }
        } else {
            media = menor;
        }
        System.out.println("La nota media es: " + media);
    }
}
