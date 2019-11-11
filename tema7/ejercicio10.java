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
public class ejercicio10 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        int []numeros=new int [20];
        int []esPar=new int [20];
        int []esImpar=new int [20];
        int pares=0;
        int impares=0;
        
        for (int i =0;i<20;i++){
            numeros[i]=(int)(Math.random()*101);
            if(numeros[i]%2==0){
                esPar[pares++]=numeros[i];
            }else {
                esImpar[impares++]=numeros[i];
            }
        }
        
        System.out.println("");
        
        for (int i =0;i<20;i++){
            System.out.print(numeros[i] + " ");
        }
        
        
        for (int j=0;j<pares;j++){
            numeros[j]=esPar[j];
        }
        
        for (int x =pares;x<20;x++){
            numeros[x]=esImpar[x-pares];
        }
        System.out.println("");
        System.out.println("ARRAY RESULTADO : ");
        for(int i =0;i<20;i++){
            System.out.print(numeros[i] + " ");
        }
    }
    
}