/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4_1;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class ejercicio17 {
    public static void main(String []   args){
        Scanner s =new Scanner(System.in);
        int numero;
        System.out.println("Introduzca un entero y pulse intro");
        numero=Integer.parseInt(s.nextLine());
        
        System.out.println("El último número introducido es el : " + (numero%10 ));
   }
}
