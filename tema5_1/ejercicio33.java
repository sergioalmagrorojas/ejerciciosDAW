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
public class ejercicio33 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        int alturaIntroducida;
        
        
        System.out.println("Introduzca la altura de la U");
        alturaIntroducida=Integer.parseInt(s.nextLine());
        
        for (int i =1;i<alturaIntroducida;i++){
            System.out.print("* ");
            
            for (int x=2;x<alturaIntroducida;x++){
                System.out.print("  ");
            }
            
            System.out.println("*");
        }
        
        System.out.print("  ");
        for(int i =2;i<alturaIntroducida;i++){
            System.out.print("* ");
        }
        
    }
}
