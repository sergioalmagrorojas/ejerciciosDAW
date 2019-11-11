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
public class ejercicio6 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        int [] array=new int [15];
        
        
        
        for (int i =0;i<15;i++){
            System.out.print("Introduzca números (hasta 15) y los muestro rotados: ");
            array[i]=s.nextInt();
        }
        System.out.println("");
        
        System.out.println("ARRAY ORIGINAL : ");
        for(int i =0;i<15;i++){
            System.out.print(array[i] + "  ");
        }
        
        System.out.println("");
        
        int rotado= array[14];
        
        for(int i =14;i>0;i--){
            array[i]=array[i-1];
        }
        array[0]=rotado;
    
        System.out.println("ARRAY ROTADO : ");
        for(int i =0;i<15;i++){
            System.out.print(array[i] + "  ");
        }
    }
}
