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
public class ejercicio13 {
    public static void main(String[]    args){
        int aux;
        Scanner s =new Scanner(System.in);
        System.out.println("Vaya introduciendo números y pulsando intro ");
        int primero=Integer.parseInt(s.nextLine());
        int segundo=Integer.parseInt(s.nextLine());
        int tercero=Integer.parseInt(s.nextLine());
    
        if (primero>segundo){
            aux=primero;
            primero=segundo;
            segundo=aux;
        }
        if(segundo>tercero){
            aux=segundo;
            segundo=tercero;
            tercero=aux;
        }
        if (primero>segundo){
            aux=primero;
            primero=segundo;
            segundo=aux;
        }
        
        System.out.println("Los números ordenados son : " + primero + " , " + segundo + " , " + tercero);
    }
}
