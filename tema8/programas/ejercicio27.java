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
public class ejercicio27 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        
        System.out.println("Introduzca el numero de numeros que tiene el array: ");
        int cantidad=s.nextInt();
        System.out.println("Introduzca el numero más alto: ");
        int tope=s.nextInt();
        System.out.println("Introduzca el numero más pequeño: ");
        int minimo=s.nextInt();
        
        int[]array=funciones.matematicas.generaArray(cantidad, tope, minimo);
        
        funciones.matematicas.muestraArray(array);
        System.out.println("");
        
        
        //array volteado
        System.out.println("Introduzca el numero de movimientos hacia la derecha : ");
        int posiciones=s.nextInt();
       
        funciones.matematicas.muestraArray(funciones.matematicas.rotaArrayDerecha(array, posiciones));
        
        
        System.out.println("");
    }
}
