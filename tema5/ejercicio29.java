/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5_1;
import java.util.Scanner;
/**
 *Escribe un programa que muestre por pantalla todos los números enteros
 * positivos menores a uno leído por teclado que no sean divisibles entre 
 * otro tambiénleídodeigualforma.
 * @author sergi
 */
public class ejercicio29 {
    public static void main(String[] args){
        
        Scanner s =new Scanner(System.in);
        int minimo=0;
        int maximo;
        int divisor;
        
        
        System.out.println("Introduzca el valor tope");
        maximo=Integer.parseInt(s.nextLine());
        
        System.out.println("Introduzca el divisor");
        divisor=Integer.parseInt(s.nextLine());
        
        
        for(int i=minimo;i<=maximo;i++){
            if(i%divisor!=0){
                System.out.println(i);
            }
        }
    
    }
}
