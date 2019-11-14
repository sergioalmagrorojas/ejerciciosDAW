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
public class ejercicio5 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        int[] numeros = new int [10];
        int max=0;
        int min =10000000;
        System.out.println("Vaya introduciendo números y le dire cuando llegue a 10 max y min : ");
        for(int i =0; i<10;i++){
            numeros[i]=s.nextInt();
            if(numeros[i]>max){
                max=numeros[i];
            }
            if(numeros[i]<min){
                min=numeros[i];
            }
        }
        
        System.out.println("");
        
        for(int i=0;i<10;i++){
            System.out.println(numeros[i]);
            if(numeros[i]==max){
                System.out.println(" máximo");
            }
            if(numeros[i]==min){
                System.out.println(" mínimo");
            }
        }
        
        System.out.println("");
        
    }
}
