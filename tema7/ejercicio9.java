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
public class ejercicio9 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
    
        int [] numeros=new int [8];
        
        System.out.println("Introduzca 8 números : ");
        
        for(int i =0;i<8;i++){
            numeros[i]=s.nextInt();
        }
        
        System.out.println("");
        
        System.out.println("A continuación le muestro si son pares o impares : ");
        
        for(int i =0;i<8;i++){
            if (numeros[i]%2==0){
                System.out.println(numeros[i] + " par");
            }else {
                System.out.println(numeros[i] + " impar");
            }
        }
        System.out.println("");
    }
}
