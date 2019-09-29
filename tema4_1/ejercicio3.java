/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4_1;

/**
 *
 * @author sergi
 * Escribe un programa en que dado un número del 1 a 7
 * escriba el correspondientenombredeldíadelasemana.
 */
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Eliga con un entero el día que desea visualizar");
        int opcion=Integer.parseInt(s.nextLine());
        
        switch(opcion){
            case 1 :
                System.out.print("LUNES\n");
            break;
            case 2:
                System.out.print("MARTES\n");
            break;
            case 3 :
                System.out.print("MIERCOLES\n");
            break;
            case 4 :
                System.out.print("JUEVES\n");
            break;
            case 5 :
                System.out.print("VIERNES\n");
            break;
            case 6 :
                System.out.print("SABADO\n");
            case 7 :
                System.out.print("DOMINGO\n");
            break;
            default:
        }
        
    }
}
