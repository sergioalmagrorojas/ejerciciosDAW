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
public class romboHueco {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        int altura;
        int blancosAntes;
        int blancosEnmedio;
                
        System.out.println("Dibujo rombo huecos");
        System.out.print("Introduzca una altura impar y >=3 : ");
        do{
            altura=s.nextInt();
            if(!((altura%2==1)&&(altura>=3))){
                System.out.print("Incorrecto: ");
            }
            
        }while(!((altura%2==1)&&(altura>=3)));
        
        blancosAntes=altura/2;
        blancosEnmedio=1;
        
        for(int i =0;i<(altura/2+1);i++){
            //blancos previos
            for(int j =0;j<blancosAntes;j++){
                System.out.print(" ");
            }
            //pinto caracter
            System.out.print("*");
            
            for(int j =0;j<blancosEnmedio;j++){
                System.out.print(" ");
            }
            if(i>0){
                System.out.print("*");
                blancosEnmedio=blancosEnmedio+2;
            }
            System.out.println("");
            blancosAntes--;
            
        }
    }
}
