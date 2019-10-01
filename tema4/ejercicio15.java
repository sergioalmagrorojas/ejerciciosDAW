/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4_1;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class ejercicio15 {
    public static void main(String []   args){
        Scanner s =new Scanner(System.in);
        System.out.println("Introduce el caracter de la pirámide");
        String x=s.nextLine();
        System.out.println("1.hacia arriba");
        System.out.println("2.hacia abajo");
        System.out.println("3.hacia la derecha");
        System.out.println("4.hacia la izquierda");
        int opcion=Integer.parseInt(s.nextLine());
        
        switch(opcion){
            case 1 :
                System.out.println("  " + x);
                System.out.println(" " + x + x + x);
                System.out.println(x + x + x + x + x );
            break;
            case 2 :
                System.out.println(x + x + x + x + x );
                System.out.println(" " + x + x + x);
                System.out.println("  " + x);
             break;   
            case 3 :
                System.out.println(x + " " + "  ");
                System.out.println(x + x + x);
                System.out.println(x + x + x + x);
                System.out.println(x + x + x );
                System.out.println(x + " "+ "  ");
            break;
            case 4 :
                System.out.println("  " + " " + x);
                System.out.println(x + x + x + x);
                System.out.println(x+ x + x + x+x);
                System.out.println(x + x + x + x);
                System.out.println(" "+ "  " + x);
            break;
            default:
        }
    }
}
