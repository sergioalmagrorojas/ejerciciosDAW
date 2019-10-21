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
public class ejercicio36 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        int numero;
        int vuelta=0 ;
        //int digitos=0;
        
        System.out.println("Introduzca un número : ");
        numero=Integer.parseInt(s.nextLine());
        
        int numero1=numero;
        do{
            vuelta=(vuelta*10)+(numero1%10);
            numero1/=10;
            
        }while(numero1>0);
        
        if(vuelta==numero){
            System.out.println("El número " + numero + " es capicúa");
            
        }else{
            System.out.println("El número " + numero + " no es capicúa");
        }
        
    
   
    }
}
