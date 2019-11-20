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
public class ejercicio61 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce el alto de la V");
        int altura=Integer.parseInt(s.nextLine());
        int espaciosDelante=0;
        int espaciosInternos=altura*2-1;
        int alto=0;
        
        if(altura<3){
            System.out.println("La altura debe de ser mayor o igual a 3 ");
        }else {
            do{
                for(int i =1;i<=espaciosDelante;i++){
                    System.out.print(" ");
                }//inserta espacios en cada linea
                System.out.print("++");//pinta la linea con el simbolo
                
                for (int i =1;i<espaciosInternos;i++){
                    System.out.print(" ");
                }//pinta los espacios de dentro de la V
                
                System.out.println("++");//pinta el simbolo con el salto de linea 
                
                alto++;
                espaciosInternos=espaciosInternos-2;
                espaciosDelante++;
                
            }while (alto<altura);
        }
    }
}
