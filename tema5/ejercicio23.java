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
public class ejercicio23 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        int numero;
        int suma=0;
        double media=0;
        int cuentaNumeros=0;
        
        do {
            System.out.println("Introduzca números hasta llegar a la suma de 10000");
            numero=Integer.parseInt(s.nextLine());
            suma+=numero;
            cuentaNumeros++;
        } while(suma<10000);
        
        media=(suma/cuentaNumeros);
    
        System.out.println("La media es : " + media);
        System.out.println("Ha necesitado " + cuentaNumeros + " números para llegar a la cifra de 10000");
    }
}
