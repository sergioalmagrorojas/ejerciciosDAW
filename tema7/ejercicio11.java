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
public class ejercicio11 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        int[] array1=new int [10];
        int[] array2=new int[10];
        int[]array3=new int [10];
        int numerosPrimos=0;
        boolean primo=false;
        int numerosNoPrimos=0;
        
        System.out.println("Introduzca números : ");
        
        for(int i=0;i<10;i++){
            primo=true;
            array1[i]=s.nextInt();
            for (int j = 2; j < array1[i] - 1; j++) { 
                if (array1[i]%j==0){
                    primo=false;
                }
            }
            if(primo){
                array2[numerosPrimos++]=array1[i];
            }else {
                array3[numerosNoPrimos++]=array1[i];
            }
        }
        
        System.out.println("");
        
        //se pinta el array inicial con barras verticales
        System.out.println("ARRAY INICIAL : ");
        for(int i =0;i<10;i++){
            System.out.print(array1[i] + " | ");
        }
        
        //array resultado
        
        for (int j=0;j<numerosPrimos;j++){
            
            array1[j]=array2[j];
            
        }
        
        for (int x =numerosPrimos;x<numerosPrimos+numerosNoPrimos;x++){
            array1[x]=array3[x-numerosPrimos];
        }
        
        System.out.println("");
        
        System.out.println("ARRAY FINAL: ");
        
        for(int i =0;i<10;i++){
            System.out.print(array1[i] + " | ");
        }
        
        
    }
}
