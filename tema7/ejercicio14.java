/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7_1;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class ejercicio14 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        String[] colores={"verde" , "amarillo", "rojo" , "azul" , "morado", "naranja" , "rosa" , "negro" ,"blanco"};
        String[] usuario=new String[8];
        String[] resultado=new String[8];
        int x=0;
        
        
        System.out.println("Introduzca 8 palabras: ");
        for(int i =0;i<8;i++){
            usuario[i]=s.nextLine();
            for(String a :colores){
               
                if(usuario[i].equals(a)){
                    resultado[x++]=a;
                }
                
            }
        }
        System.out.println("ARRAY ORIGINAL: ");
       
            //System.out.print(usuario[i] + " | ");
            for(String f : usuario){
                System.out.print(f + " | ");
            }
        
        for(int i=0;i<8;i++){
            boolean color=false;
            for(String a :colores){
                if(usuario[i].equals(a)){
                    color=true;
                }
                
            }
            
            if(!color){
                resultado[x++]=usuario[i];
            }
        }
        System.out.println("");
        System.out.println("ARRAY ORDENADO: ");
        for(String r :resultado){
            System.out.print(r + " | ");
        }
        
    }
}
