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
public class ejercicio38 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca la altura del reloj de arena (impar y mayor que 3)");
        int altura=Integer.parseInt(s.nextLine());
        
        int alto=1;
        int ancho=altura;
        int espacios=0;
        
        if ((altura<3)||(altura%2==0)){
            System.out.println("Tiene que ser mayor o igual a 3 e impar");
            
        }else{
            
            do{
                for (int i =0;i<espacios;i++){//inserta los esapcios
                    System.out.print(" ");
                }
                
                for (int i=1;i<=ancho;i++){//inserta el asterisco
                    System.out.print("*");
                }
                
                System.out.println();
                alto++;
                espacios++;
                ancho-=2;
                
            }while (alto<altura/2+1);
            
            alto=1;
            espacios=altura/2;
            
            do{//bucle de la parte de abajo
                
                for(int i=0;i<espacios;i++){
                    System.out.print(" ");
                }
                for (int i =1;i<=ancho;i++){//da igual poner 1 o 0 
                    System.out.print("*");//con i=1 se pone <= y con i=0 se pone <
                }
                System.out.println();
                alto++;
                espacios--;
                ancho+=2;
            }while(alto<=altura/2+1);
            
            
            
                    
        }
        
        
    }
}
