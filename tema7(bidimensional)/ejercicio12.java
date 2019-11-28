/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.bidimensional;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class ejercicio12 {
     public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        int[][] matriz =new int[9][9];
        int fila,columna;
        int maximo=500;
        int minimo=901;
        int suma=0;
        
        System.out.println("Este programa muestra la diagonal desde la esquina inferior izquierda "
                + "hasta la superior derecha : ");
        //genera los número y muestra la matriz
        for(fila =0;fila<9;fila++){
            for(columna =0;columna<9;columna++){
                matriz[fila][columna]=(int)(Math.random()*400+500);
                System.out.printf("%7d | " , matriz[fila][columna]);
            }
            System.out.println("");
        }
        System.out.println("");
        //muestra la diagonal y calcula las variables 
        for(fila=0;fila<9;fila++){
           int x=matriz[8-fila][fila];
            System.out.print(x + " ");
            suma=suma+x;
            if(x>maximo){
                maximo=x;
            }
            if(x<minimo){
                minimo=x;
            }
            
        }
        System.out.println("");
        
        System.out.println("Media: " + suma/9);
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        
    }
}
