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
public class ejercicio22 {
    public static void main(String []   args){
        Scanner s =new Scanner(System.in);
        String diaSemana;
        int dia=0;
        int minutos;
        int hora;
        int minutosViernes;
        int minutosActual;
        
        System.out.println("Introduzca un día de la semana : ");
        diaSemana=s.nextLine();
        
        switch (diaSemana){
            case "lunes":
                dia=0;
            break;
            case "martes":
                dia=1;
            break;
            case "miercoles":
                dia=2;
            break;
            case "jueves":
                dia=3;
            break;
            case "viernes":
                dia=4;
            break; 
            default:
        }
        System.out.println("Hora : ");
         hora=Integer.parseInt(s.nextLine());
        
        System.out.println("Minutos : ");
         minutos=Integer.parseInt(s.nextLine());
        
         minutosViernes=(4*24*60) + (15*60);
         minutosActual=(dia*24*60) + (hora*60) + minutos;
         
         System.out.println("Quedan : " + (minutosViernes-minutosActual) + " minutos para el comienzo del \n"
                 + " fin de semana (viernes 15:00 pm)");
        
        
    }
}
