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
public class ejercicio18 {
     public static void main(String []   args){
        Scanner s =new Scanner(System.in);
        int numero;
        int digito=0;
        System.out.println("Introduzca un entero y pulse intro");
        numero=Integer.parseInt(s.nextLine());
        
        if(numero<10){
            digito=numero;
        }
        if((numero>10)&&(numero<100)){
            digito=numero/10;
        }
        if((numero>100)&&(numero<1000)){
            digito=numero/100;
        }
        if((numero>1000)&&(numero<10000)){
            digito=numero/1000;
        }
        
        System.out.println("El primer digito es : " + digito);
    }
}
