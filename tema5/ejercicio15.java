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
public class ejercicio15 {
     public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        
        
        System.out.println("Introduce una base");
        int base=Integer.parseInt(s.nextLine());
        System.out.println("Introduce el ultimo exponente ");
        int numeroVeces=Integer.parseInt(s.nextLine());
     
     
        int potencia;
        int exponente;
        
        
        for (int i=0;i<numeroVeces;i++){
            
            potencia=1;
            exponente=i;
            
            for(int x =0;x<exponente;x++){
                potencia*=base;
            }
            System.out.println(base + "  elevado a " + numeroVeces + " = " + potencia);
        }
     }
}
