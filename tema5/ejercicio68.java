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
public class ejercicio68 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        
        System.out.println("Introduzca un numero entero: ");
        long numero=s.nextInt();
        long trastocado=0;
        long aux=numero;
        
        while (aux > 0) {
            trastocado = (trastocado * 10) + (aux % 10);

            aux /= 10;
        }
        
        aux=0;
        
        while(trastocado>0){
             
            if(trastocado%2==0){
                 aux=(aux*10)+(trastocado%10) + 1;
            }else {
                aux=(aux*10)+(trastocado%10)-1;
            }
            trastocado=trastocado/10;
        }
        System.out.println("El número  " + numero + " trastocado es : " + aux);
    }
}
