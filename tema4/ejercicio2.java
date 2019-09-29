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
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner s =new Scanner (System.in);
        int hora ;
        
        System.out.println("Introdzca una hora (entera)");
        hora=Integer.parseInt(s.nextLine());
        
        if ((hora<0)&&(hora>24)){
            System.out.println("Las horas deben de estar comprendidas entre 0 y 24 ");
        }
        if ((hora>=6) &&(hora<=12)){
            System.out.println("Buenos Días!!");
         }
        if((hora>=13)&&(hora<=20)){
                System.out.println("Buenas Tardes!!");
         }
         if ((hora>=21)&&(hora<24)||(hora>=0)&&(hora<=5)){
                System.out.println("Buenas Noches!!");
         }
         
         
    }
}
