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
public class ejercicio1 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        int dados =3;
        int numeros=0;
        int suma=0;
        for (int i =0;i<dados;i++){
            numeros=(int)(Math.random()*7+1);
            System.out.println(numeros);
            suma+=numeros;
        }
        System.out.println("La suma de las tres tiradas es " + suma);
        
    }
}
