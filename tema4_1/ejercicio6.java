/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4_1;

import java.util.Scanner;

/**
 *
 * @author sergi
 */

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la altura y le diré cuanto tarda en caer ");
        double gravedad= 9.81;
        double  altura=Integer.parseInt(s.nextLine());
        double segundos =Math.sqrt(2*altura/gravedad);
        
        
        
        if (altura==0){
            System.out.println("La altura debe de ser mayor que 0");
        }
        
        System.out.println("El tiempo  es :  " +  segundos);
        
        
    }
}
