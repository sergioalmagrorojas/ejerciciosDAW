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
public class ejercicio11 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        int[][] matriz =new int[10][10];
        int fila,columna;
        int maximo=200;
        int minimo=301;
        int suma=0;
        
        System.out.println("Este programa muestra la diagonal desde la esquina superior izquierda "
                + "hasta la inferior derecha : ");
        //genera los número y muestra la matriz
        for(fila =0;fila<10;fila++){
            for(columna =0;columna<10;columna++){
                matriz[fila][columna]=(int)(Math.random()*101+200);
                System.out.printf("%7d | " , matriz[fila][columna]);
            }
            System.out.println("");
        }
        System.out.println("");
        //muestra la diagonal y calcula las variables 
        for(fila=0;fila<10;fila++){
           int x=matriz[fila][fila];
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
        
        System.out.println("Suma: " + suma);
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        
    }
}
