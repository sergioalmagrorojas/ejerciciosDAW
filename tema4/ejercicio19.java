/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4_1;

/**
 *
 * @author sergi
 */
import java.util.Scanner;
public class ejercicio19 {
    public static void main(String []   args){
        Scanner s =new Scanner(System.in);
        
        int numero;
        int digito=0;
        System.out.println("Introduzca un entero y pulse intro");
        numero=Integer.parseInt(s.nextLine());
        
        
        if(numero<10){
            digito=1;
        }
        if((numero>10)&&(numero<100)){
            digito=2;
        }
        if((numero>100)&&(numero<1000)){
            digito=3;
        }
        if((numero>1000)&&(numero<10000)){
            digito=4;
        }
        if((numero>10000)&&(numero<100000)){
            digito=5;
        }
        
        System.out.println("El número " + numero +" tiene : " + digito + " digito/s");
        
        
    }
}
