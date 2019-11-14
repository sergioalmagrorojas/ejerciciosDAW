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
public class ejercicio17 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
         int numero;
        int[] aleatorios=new int [10];
        
        for(int i =0;i<10;i++){
            aleatorios[i]=(int)(Math.random()*101);
        }
        for(int i =0;i<10;i++){
            System.out.print(aleatorios[i] + " | ");
        }
        System.out.println("");
       boolean numeroEsta=false;
       
        do{
        System.out.print("Introduzca un número que este en el conjunto anterior : ");
        numero=s.nextInt();
        
        for(int i =0;i<10;i++){
            if(aleatorios[i]==numero){
                numeroEsta=true;
            }
        }
        if(!numeroEsta){//si el numero no esta muetsra el mensaje 
            System.out.println("El número no se encuentra en el conjunto ");
        }
        }while(!numeroEsta);
        
        do{
            int auxiliar =aleatorios[9];
            
            for(int i =9;i>0;i--){//recorre el array al reves (desde el 9 hacia atras)
                aleatorios[i]=aleatorios[i-1];
            }
            aleatorios[0]=auxiliar;
        }while(!(aleatorios[0]==numero));//da vueltas mientras que no se cumpla que en la posicion 0 este el numero
        
        System.out.println("");
        //muestro el array resultado
        System.out.println("ARRAY RESULTADO: ");
        for(int i =0;i<10;i++){
            System.out.print(aleatorios[i] + " | ");
        }
    }
}
