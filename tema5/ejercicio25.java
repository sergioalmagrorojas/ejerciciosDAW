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
public class ejercicio25 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int numero;
        int vuelta=0;
        
        System.out.println("Escriba un número y le doy la vuelta ");
        numero=Integer.parseInt(s.nextLine());
        
        while(numero>0){
            vuelta=vuelta*10 + numero%10;
            numero=numero/10;
        }
        System.out.println("Número dado la vuelta " + vuelta);
    }
}
