/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7_1;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class ejercicio20 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        System.out.print("Introduzca el número de reyes que quiere que se almacenen: ");
        
        int numero = Integer.parseInt(s.nextLine());
        
        String[] rey = new String[numero];
        
        int contador=numero;
        
        for (int i = 0; i < numero; i++) {
            System.out.printf("Nombre de rey (restantes %2d) : " ,  contador );
            rey[i] = s.nextLine();
            contador--;
        }
        
        for (int i = 0; i < numero; i++) {
            int ordenCronologico = 1;
            
            for (int j = 0; j < i; j++) {
                
                if (rey[i].equals(rey[j])) {
                    ordenCronologico++;
                }
            }
            System.out.println(rey[i] + " " + ordenCronologico + "º");
        }
        
    }
}
