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
public class ejercicio19 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        String r;
        
        System.out.println("Introduzca la altura");
        int altura=Integer.parseInt(s.nextLine());
        System.out.println("Introduzca el caracter de relleno");
        r=s.nextLine();
        
        int ancho=1;
        int longitud=1;
        int espacios=altura-1;
        
        do{
            
        
        for(int i=0;i<espacios;i++){
            System.out.print(" ");
        }//espacios
        for (int i =0;i<longitud;i++){
            System.out.print(r);
        }
        System.out.println();
        ancho++;
        espacios--;
        longitud=longitud+2;
            
        }while(ancho<=altura);
    }
}
