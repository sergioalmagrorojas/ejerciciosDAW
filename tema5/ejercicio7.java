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
public class ejercicio7 {
    public static void main(String []   args){
        Scanner s =new Scanner(System.in);
        int x=4;
        int numeroSecreto=1234;
        int numeroIntroducido;
        boolean acierto=false;
        
        do {
            System.out.println("Introduzca el número secreto");
            numeroIntroducido=Integer.parseInt(s.nextLine());
            
            if (numeroIntroducido==numeroSecreto){
                 acierto=true;
                 System.out.println("Has abierto la caja fuerte");
            }else {
                System.out.println("Clave incorrecta pruebe de nuevo");
                
            }
            x--;
        } while((x>0)&&(!acierto));
        
        if (!acierto){
            System.out.println("Lo siento ya no tienes más oportunidades");
        }
        
    }
}
