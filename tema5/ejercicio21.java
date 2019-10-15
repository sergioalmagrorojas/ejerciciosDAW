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
public class ejercicio21 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        
        int numero;
        int sumaImpar=0;
        int numeroImpar=0;
        double media;
        int cuentaNumeros=0;
        int mayorPar=-2;
       
        
        
        do {
            System.out.println("Introduzca un número");
            numero=Integer.parseInt(s.nextLine());
            cuentaNumeros++;
            if (numero%2==1){
                sumaImpar+=numero;
                numeroImpar++;
            }
            if ((numero%2==0)&&(numero>mayorPar)){                
                mayorPar=numero; 
            }
        } while(numero>0);
        
        
        media = (sumaImpar/numeroImpar);
       
        System.out.println("Media " + media);
        System.out.println("Cantidad de números introducidos : " + (cuentaNumeros-1) );
        System.out.println("Mayor par : " + mayorPar);
    }
}
