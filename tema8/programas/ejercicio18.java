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
public class ejercicio18 {
    public static void main(String[] args){
        Scanner s =new Scanner (System.in);
        long decimal;
        
        System.out.print("Introduzca un número decimal : ");
        decimal=s.nextLong();
        
        System.out.println("El número " + decimal + " en binario es : " + funciones.matematicas.decimalBinario(decimal));
        
    }
}
