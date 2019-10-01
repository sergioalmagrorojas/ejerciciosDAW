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
public class ejercicio11 {
    public static void main(String  []  args){
        Scanner s =new Scanner(System.in);
        int horaIntroducida;
        int minutosIntroducidos;
        
        System.out.println("Introduzca una hora : ");
        horaIntroducida=Integer.parseInt(s.nextLine());
        
        System.out.println("Introduzca los minutos : ");
        minutosIntroducidos=Integer.parseInt(s.nextLine());
        
        int segundos= (horaIntroducida*3600) + (minutosIntroducidos*60);
        int segundosFaltan=86400 - segundos;
        
        System.out.println("Faltan  " + segundosFaltan + " segundos para medianoche");
        
    }
}
