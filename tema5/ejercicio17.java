/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5_1;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class ejercicio17 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
    
        int numero=0;
        int suma=0;
        System.out.println("Introduca un numero positivo(entero)");
        numero=Integer.parseInt(s.nextLine());
        if (numero<0){
            System.out.println("debe introducir un número positivo.");
        }
        
        
        for (int x=numero;x<numero + 100; x++){
                suma+=x;
            }
        
        System.out.println("La suma de los números es " + suma);
    }
}
