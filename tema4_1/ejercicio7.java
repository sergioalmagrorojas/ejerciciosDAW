/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4_1;

/**
 *
 * @author sergi
 */
import java.util.Scanner;
public class ejercicio7 {
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
        
        System.out.printf("La nota media es : %.3f " , media);
        
    }
}