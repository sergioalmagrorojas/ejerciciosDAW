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
public class ejercicio7 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        int[] aleatorios=new int[100];
        
        for (int i =0;i<100;i++){
            aleatorios[i]=(int)(Math.random()*21);
            System.out.println(aleatorios[i]);
        }
        
        System.out.println("");
        
        System.out.println("Introduzca un valor del array mostrado: ");
        int numero1=s.nextInt();
        System.out.println("Introduzca el valor del cambio: ");
        int numero2=s.nextInt();
        
        System.out.println("");
        
        for(int i =0;i<100;i++){
            if(aleatorios[i]==numero1){
                aleatorios[i]=numero2;
                System.out.println("''" + aleatorios[i] + "''");
            } else{
                System.out.println(aleatorios[i]);
            }
        }
        
        System.out.println("");
        
    }
}
