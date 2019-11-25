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
public class ejercicio4 {
    public static void main(String[] args)
    throws InterruptedException {
        Scanner s =new Scanner(System.in);
        
        int[][]numeros=new int [4][5];
        int fila,columna;
        int sumaY;
        int sumaX;
        int suma=0;
        
       // System.out.println("Introduzca los numeros del array: ");
        for(fila =0;fila<4;fila++){
            for(columna=0;columna<5;columna++){
                //System.out.print("posición " + fila + "  " + columna + ": "); 
                numeros[fila][columna]=(int)(Math.random()*900+100);
            }
        }
        
        //muestro el array(CON LA SUMA DE LAS FILAS)
        
        for(fila=0;fila<4;fila++){
            sumaY=0;
            for(columna=0;columna<5;columna++){
                System.out.printf("%5d" ,numeros[fila][columna]);
                sumaY+=numeros[fila][columna];
                
            }
             suma += sumaY;
            System.out.printf("|%5d\n" , sumaY);
            
                    
        }
        //muestro el array con la suma de las columnas + la suma de filas y columnas 
        for(columna=0;columna<5;columna++){
            sumaX=0;
            for(fila=0;fila<4;fila++){
                sumaX += numeros[fila][columna];
                Thread.sleep(300);

            }
            suma += sumaX;
            System.out.printf("%5d", sumaX);
            Thread.sleep(300);

        }
        System.out.printf("    SUMA : [%5d]", suma);
        System.out.println("");
        
    }
}
