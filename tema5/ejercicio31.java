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
public class ejercicio31 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        int alturaIntroducida;
        System.out.println("Introduzca la altura de la L");
        alturaIntroducida=Integer.parseInt(s.nextLine());
       // int ancho=alturaIntroducida/2;
        
        
        
            
            for(int i=1;i<alturaIntroducida;i++){
                System.out.print("*");
                System.out.println();
            }
            
            for (int i=0;i<alturaIntroducida/2+1;i++){
                System.out.print("*");
                
            }
            System.out.println();
    }
}
