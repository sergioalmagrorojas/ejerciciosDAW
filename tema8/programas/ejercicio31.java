/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class ejercicio31 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Introduzca el numero de filas: ");
        int filas=s.nextInt();
        System.out.println("Introduzca el numero de columnas: ");
        int columnas=s.nextInt();
        System.out.println("Introduzca el numero más grande: ");
        int maximo=s.nextInt();
        System.out.println("Introduzca el numero más pequeño: ");
        int minimo=s.nextInt();
        
        int[][]array=funciones.matematicas.generaArrayBi(filas, columnas, minimo, maximo);
        
        //mostrar array
        funciones.matematicas.mostrarArrayBi(array);
        System.out.println("");
        //mostrar fila del array
        System.out.print("Que columna quiere mostrar?: ");
        int columna=s.nextInt();
        funciones.matematicas.muestraArray(funciones.matematicas.columnaArray(array, columna));
    }
}
