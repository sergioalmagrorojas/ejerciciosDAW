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
public class ejercicio16 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        
        
        int numero;
        System.out.println("Introduce un número y te digo si es primo o no");
        numero=Integer.parseInt(s.nextLine());
        boolean primo=true;
        
        for(int i=4;i<numero;i++){
            if ((numero%i)!=0){
                primo=false;
            }
            
        }
        if (!primo){
            System.out.println("no es primo");
        } else{
            System.out.println("es primo");
        }
    }
}
