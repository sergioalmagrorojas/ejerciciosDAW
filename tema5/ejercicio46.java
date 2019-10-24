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
public class ejercicio46 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        int alto;
        int ancho;
        String r;
        int huecos;
        
        System.out.println("Introduce el alto del rectángulo");
        alto=Integer.parseInt(s.nextLine());
        System.out.println("Introduce el ancho del rectángulo");
        ancho=Integer.parseInt(s.nextLine());
        System.out.println("Introduce el carácter");
        r=s.nextLine();
        
        if((alto<=2)||(ancho<=2)){
            System.out.println("La alto y el ancho deben de ser mayor que 2");
        }else{
            for(int i= 1; i<=ancho;i++){
                System.out.print(r);
            }
            for(int i=2;i<alto;i++){
                System.out.print("\n" + r );
                for (huecos=2;huecos<ancho;huecos++){
                    System.out.print(" ");
                }
                System.out.print(r);
            }
            System.out.println();
            for(int i =1;i<=ancho;i++){
                System.out.print(r);
            }
            System.out.println();
        }
    }
}
