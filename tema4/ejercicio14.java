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
public class ejercicio14 {
    public static void main(String []   args){
        Scanner s =new Scanner(System.in);
        int numeroIntroducido;
        
        System.out.println("Introduzca un número entero : ");
        numeroIntroducido=Integer.parseInt(s.nextLine());
        
        if ((numeroIntroducido%2==0)&&(numeroIntroducido%5==0)){
            System.out.println("El número es par y divisible entre 5 ");
        }
        if ((numeroIntroducido%2==0)&&(numeroIntroducido%5!=1)){
            System.out.println("El número es par pero no divisible entre 5 ");
        }
        if ((numeroIntroducido%2==1)&&(numeroIntroducido%5==0)){
            System.out.println("El número no es par pero es divisible entre 5 ");
        }
        if ((numeroIntroducido%2==1)&&(numeroIntroducido%5!=1)){
            System.out.println("El número ni es par ni es divisible entre 5");
        }
    
    }
}
