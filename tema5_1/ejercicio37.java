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
public class ejercicio37 {
    public static void main(String[] args) {
         Scanner s =new Scanner(System.in);
         
         int numero;
         int numeroDigitos=0;
         int reves=0;
         int digito=0;
         
         System.out.println("Introduzca un número entero: ");
         numero=s.nextInt();
         
         int aux=numero;
         
         do{// voy contando los digitos 
             reves=(reves*10)+(aux%10);
             aux=aux/10;
             numeroDigitos++;
        }while(aux>0);
         
         for(int i=0;i<numeroDigitos;i++){
             digito=(reves%10);
             reves=reves/10;
             for(int x=0;x<digito;x++){
                 System.out.print("|");
             }
             if(i<numeroDigitos-1){
                 System.out.print("-");
             }
         }
         
    }
}
