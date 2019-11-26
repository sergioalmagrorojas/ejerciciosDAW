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
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        
        int minimo=1001;
        int maximo=0;
        int fila,columna;
        int columnaMayor=0;
        int columnaMenor=0;
        int mayorFila=0;
        int menorFila=0;
        int[][] array=new int [6][10];
        
        //relleno el array
        for(fila =0;fila<6;fila++){
            for(columna=0;columna<10;columna++){
                array[fila][columna]=(int)(Math.random()*1001);
            }
        }
        
        //muestro el array
        for(fila =0;fila<6;fila++){
            for(columna=0;columna<10;columna++){
                System.out.printf("%6d |" , array[fila][columna]);
                
                if(array[fila][columna]>maximo){
                    maximo=array[fila][columna];
                    mayorFila=fila;
                    columnaMayor=columna;
                }
                if(array[fila][columna]<minimo){
                    minimo=array[fila][columna];
                    menorFila=fila;
                    columnaMenor=columna;
                }
            }
            System.out.println("|");
        }
        
        System.out.println("El numero mayor es : " + maximo + " y se encuentra en la posicion : " + mayorFila + " | " + columnaMayor);
        System.out.println("El numero menor es : " + minimo + " y se encuentra en la posicion : " + menorFila + " | " + columnaMenor);
    }
}
