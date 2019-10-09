 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5_1;

/**
 *
 * @author sergi
 */
import java.util.Scanner;
public class ejercicio10 {
     public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Por favor, vaya introduciendo números y pulsando INTRO.");
        System.out.println("Para terminar, introduzca un número negativo.");
        int numeroIntroducido = 0;
        int suma = 0;
        int numeros=0;
        
       
        
        while (numeroIntroducido >= 0) {
            numeroIntroducido = Integer.parseInt(s.nextLine());
            suma+=numeroIntroducido;
            numeros++;  
        }
        System.out.println("La media   es " + (suma - numeroIntroducido)/(numeros-1));
    }
}