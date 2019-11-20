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
public class ejercicio28 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        int numero;
        int factorial=1;
        
        
        System.out.println("Indiqueme un número y calculo su factorial");
        numero=Integer.parseInt(s.nextLine());
        
        
        do{
            factorial=numero*factorial;
            numero--;
        }while(numero!=0);
        System.out.println("Factorial : " + factorial);   
    }
}
