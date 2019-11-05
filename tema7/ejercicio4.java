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
public class ejercicio4 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        int[]a=new int[20];
        int[]alCuadrado=new int[20];
        int[]alCubo=new int[20];
        
        for(int i =0;i<20;i++){
            a[i]=(int)(Math.random()*101+1);
            alCuadrado[i]=a[i]*a[i];
            alCubo[i]=alCuadrado[i]*a[i];
            
        }
        for(int i=0;i<20;i++){
            System.out.print(a[i] + " ");
            System.out.print(alCuadrado[i] + " ");
            System.out.println(alCubo[i] + " ");
        }
        //System.out.println("");
    }      
}
