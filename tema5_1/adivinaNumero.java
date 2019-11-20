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
public class adivinaNumero {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int numeroIntroducido;
        int cuenta=0;
        boolean acertado = false;
        int numeroMisterioso = 8888;
        int min=0;
        int max=0;
            System.out.println("Estoy pensando un número  intenta adivinarlo(0-10000).");
            do {
                System.out.print("Introduce un número: ");
                numeroIntroducido = Integer.parseInt(s.nextLine());
                cuenta++;
                
                
                if (numeroIntroducido == numeroMisterioso) {
                    acertado = true;
                    System.out.println("¡Enhorabuena! ¡has acertado!");
                }
                
                if (numeroIntroducido<min){
                min=numeroIntroducido;
                }
                if ((numeroIntroducido > numeroMisterioso)&&(numeroIntroducido<10000)) {
                    System.out.println("El número que estoy pensando es menor que " + max + " y " + " mayor que " + min);                   
                }
                
                
            } while (!acertado);
            
        
    
     }
}
