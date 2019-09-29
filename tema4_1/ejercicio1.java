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
public class ejercicio1 {
   public static void main(String[] args) {
       Scanner s =new Scanner(System.in);
       System.out.println("Introduzca un día de la semana");
       String opcion=s.nextLine();
       
       switch(opcion){
           case "lunes":
           case "martes":
           case "miercoles":
               System.out.println("Desarrollo de interfaces");
           break;
           case "jueves":
           case "viernes":
               System.out.println("Empresa");
           break;
           default:
           System.out.print("No ha ecrito un día de la semana \n");
       }
       
       
   
   }
}

