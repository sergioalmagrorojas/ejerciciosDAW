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
public class ejercicio21 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        
        int[] aleatorios=new int [15];
        
        
        for(int i =0;i<15;i++){
            aleatorios[i]=(int)(Math.random()*501);
        }
        
        System.out.println("");
        System.out.println("ARRAY ORIGINAL: ");
        for(int i =0;i<15;i++){
            System.out.print(aleatorios[i] + " | ");
        }
        System.out.println("");
        
        for(int i =0;i<15;i++){
            do{
                aleatorios[i]++;
            }while(aleatorios[i]%5!=0);
        }
        System.out.println("");
        System.out.println("ARRAY RESULTADO: ");
        for(int i =0;i<15;i++){
            System.out.print(aleatorios[i] + " | ");
        }
        
        
    }
}
