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
public class ejercicio24 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        
        System.out.println("Introduzca el numero de numeros que tiene el array: ");
        int cantidad=s.nextInt();
        System.out.println("Introduzca el numero más alto: ");
        int tope=s.nextInt();
        System.out.println("Introduzca el numero más pequeño: ");
        int minimo=s.nextInt();
        
        int[]array=funciones.matematicas.generaArray(cantidad, tope, minimo);
        
        for(int i =0;i<cantidad;i++){
             System.out.print(array[i] + " ");
        }
        System.out.println("");
        
        System.out.println("Ingresa un número y le digo si está en el array: ");
        int numero=s.nextInt();
        
        if(funciones.matematicas.estaArray(numero, array)){
            System.out.println("Está en el array");
        }else {
            System.out.println("No está en el array");
        }
        
        
    }
}
