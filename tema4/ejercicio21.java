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
public class ejercicio21 {
    public static void main(String []   args){
        Scanner s =new Scanner(System.in);
        double nota1;
        double nota2;
        double media;
        String apto="";
        System.out.println("Dime tu nota de programación (1º examen)");
        nota1 =Double.parseDouble(s.nextLine());
        System.out.println("Dime tu nota de programación (2º examen)");
        nota2 =Double.parseDouble(s.nextLine());
        media=(nota1+nota2)/2;
        
        
        if((media>5)&&(media<=10)){
            System.out.println("Tu nota es : " + media);
        }
        if (media<5){
            System.out.println("¿Has aprobado la recuperación?");
            apto=s.nextLine();
            if(apto.equals("apto")){
                System.out.println("Tu nota es un 5");
            }
            if (apto.equals("no apto")){
                System.out.println("Tu nota es : " + media);
            }
        }
        
    }
}
