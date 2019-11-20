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
public class ejercicio26 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int numero;
        int vuelta=0;
        int posicion=1;
        int digitos=0;
        int digito;
        
        System.out.println("Escriba un número  ");
        numero=Integer.parseInt(s.nextLine());
       
        System.out.println("Escriba una posicion ");
        digito=Integer.parseInt(s.nextLine());
       
        if (numero==0){
            digitos=1;
        }
        
        while(numero>0){
            vuelta=vuelta*10 + numero%10;
            numero=numero/10;
            digitos++;
        }
        while(vuelta>0){
            if((vuelta%10)==digito){
                System.out.print(posicion + " ");
            }
            vuelta=vuelta/10;
            posicion++;
        } 
        System.out.println();
    }
}
