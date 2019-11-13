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
public class ejercicio16 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        
        int [] aleatorios=new int [20];
        int eleccion;
        
        for (int i =0;i<20;i++){
            aleatorios[i]=(int)(Math.random()*401);
        }
        
        
        System.out.println("ARRAY ORIGINAL: ");
        for(int i =0;i<20;i++){//mostrar el array inicial
            System.out.print(aleatorios[i] + " | ");
        }
        System.out.println("");
        System.out.println("Cuál quiere destacar 1)multiplos de 5 2) multiplos de 7: ");
        eleccion=s.nextInt();
        
        
        for(int i =0;i<20;i++){
            if(eleccion==1){
                if(aleatorios[i]%5==0){
                    System.out.print(" [ " +aleatorios[i] + " ] ");
                }else {
                    System.out.print(aleatorios[i] + "  " );
                }
            }
            if(eleccion==2){
                if(aleatorios[i]%7==0){
                    System.out.print(" [ " +aleatorios[i] + " ] ");
                }else {
                    System.out.print(aleatorios[i] + "  " );
                }
            }
        }
    }
}
