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
public class ejercicio67 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        
        
        System.out.print("Introduzca el numero de escalones : ");
        int escalon=s.nextInt();
        System.out.print("Ahora el grosor: ");
        int grosor=s.nextInt();
        /*System.out.print("Ahora el largo : ");
        int largo=s.nextInt();*/
        
        for(int i =0;i<=escalon;i++){
            for(int x=0;x<grosor;x++){
                for(int z =0;z<i;z++){
                       System.out.print("****");                                      
                }
                System.out.println("");
            }
            
        }
    }
}
