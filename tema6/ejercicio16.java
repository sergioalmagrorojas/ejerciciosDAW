/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6_1;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class ejercicio16 {
     public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        
        
        int opcion;
        int opcion1=0;
        int opcion2=0;
        int opcion3=0;
        
        
        for(int x=0;x<3;x++){
            
            opcion=(int)(Math.random()*5);
            
            switch(opcion){
                case 0:
                    System.out.print("Corazon ");
                break;
                case 1 :
                    System.out.print("Diamante ");
                break; 
                case 2 :
                    System.out.print("Herradura ");
                break;
                case 3 :
                    System.out.print("Limón ");
                break;
                case 4 :
                    System.out.print("Campana ");
                break;
                default:
            }
            switch(x){
                case 0:
                    opcion1=opcion;
                break;
                case 2 :
                    opcion2=opcion;
                break;
                case 3 :
                    opcion3=opcion;
                break;
                default:
            }
        }
        System.out.println();
        
        if ((opcion1 != opcion2) && (opcion2 != opcion3) && (opcion1 != opcion3)){
            System.out.println("Has perdido tus monedas");
            
        } else if ((opcion1 == opcion2) && (opcion2 == opcion3)) { 
            
            System.out.println("Has ganado 1o monedas");
            
        }else{
            System.out.println("Has recuperado la moneda");
        }
     }
}
