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
public class ejercicio24 {
    public static void main (String[]   args){
        Scanner s =new Scanner(System.in);
        
        System.out.println("Por favor, introduzca la altura de la pirámide: ");
        int alturaIntroducida = Integer.parseInt(s.nextLine());
        int ancho = 1;
        int espacios = alturaIntroducida - 1;
        
        
        while(ancho<=alturaIntroducida){
            
            
            for(int i=1;i<=espacios;i++){
                System.out.print(" ");
            }//para los espacios
            
            for (int i=1;i<ancho;i++){
                System.out.print(i);
            }//pinta los números
            
            for (int i=ancho;i>0;i--){
                System.out.print(i);
            }//pinta los números
            
            System.out.println();
            ancho++;
            espacios--;
        }

        
        
    }
}
