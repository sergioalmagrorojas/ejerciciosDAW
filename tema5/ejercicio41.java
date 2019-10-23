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
public class ejercicio41 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        
        int numero;
        int pares=0;
        int impares=0;
        
        
        System.out.println("Introduzca un número");
        numero=Integer.parseInt(s.nextLine());
        
        int numero1 =numero;
        
        while(numero1>0){
            
            if((numero1%10)%2==0){
                pares++;
            }
            
            if(((numero1%10)%2!=0)){
                
                impares++;
                
            }
            numero1=numero1/10;
        } 
        
       
        System.out.println("Dígitos pares : " + pares);
        System.out.println("Dígitos impares : " + impares);
        
    }
}
