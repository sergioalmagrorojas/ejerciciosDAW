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
public class ejercicio8 {
    public static void main(String []   args){
        
        Scanner s =new Scanner (System.in);
        double nota1;
        double nota2;
        double nota3;
        double media;
        System.out.println("Introduzca la primera  nota: ");
        nota1=Double.parseDouble(s.nextLine());
        System.out.println("Introduzca la segunda  nota: ");
        nota2=Double.parseDouble(s.nextLine());
        System.out.println("Introduzca la tercera  nota: ");
        nota3=Double.parseDouble(s.nextLine());
        
        
        media=(nota1+nota2+nota3)/3;
        
        System.out.printf("La nota media es : %.3f \n" , media);
        
        if (media<5){
            System.out.println("Insuficiente " + media);
        }
        if ((media>=5)&&(media<6)){
            System.out.println("Suficiente " + media);
        }
        if ((media>=6)&&(media<7)){
            System.out.println("Bien " + media);
        }
        if ((media>=7)&&(media<9)){
            System.out.println("Notable " + media);
        }
        if ((media>=9)&&(media<=10)){
            System.out.println("Suficiente " + media);
        }
    }
}
