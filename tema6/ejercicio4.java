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
public class ejercicio4 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        for (int i =0;i<20;i++){
            int numeros=(int)(Math.random()*11);
            System.out.print(numeros + "  ");
        }
        
    }
}
