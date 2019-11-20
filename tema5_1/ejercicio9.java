/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5_1;

/**
 *
 * @author sergi
 */
import java.util.Scanner;
public class ejercicio9 {
    public static void main(String []   args){
        Scanner s =new Scanner(System.in);
        
        int numero;
        int digito=0;
        System.out.println("Introduzca un entero y pulse intro");
        numero=Integer.parseInt(s.nextLine());
        
        
        do{
            numero=numero/10;//tambien se podría poner numero /=10
            digito++;
        }while(numero>10);
        
        System.out.println("El número " + " tiene : " + (digito+1) + " digito/s");
        
        
    }
}

