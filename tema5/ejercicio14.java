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
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        
        
        System.out.println("Introduce una base ");
        int base =Integer.parseInt(s.nextLine());
        System.out.println("Introduzca un exponente ");
        int exponente=Integer.parseInt(s.nextLine());
        
        int potencia=1;
        
        if(exponente==0){
            potencia=potencia;
        }
        if (exponente>0){
            for(int i =0;i<exponente;i++){
                potencia=potencia*base;
            }
            
        }
        if(exponente<0){
            for(int i =0;i<-exponente;i++){
                potencia=potencia*base;
            }
        }
        System.out.println(base + " ^ " + exponente + " = " + potencia );
    } 
}
