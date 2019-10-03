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
public class ejercicio25 {
    public static void main(String []   args){
        Scanner s =new Scanner(System.in);
        int alto;
        int ancho;
        
        double envio=3.25;
        double total=0;
        
        
        System.out.print("Introduzca el alto de la bandera : ");
        alto=Integer.parseInt(s.nextLine());
        System.out.print("Introduzca el ancho de la bandera : ");
        ancho=Integer.parseInt(s.nextLine());
        
        int precio=alto*ancho;
        
        System.out.println("Quiere escudo bordado?");
        boolean escudo= ((s.nextLine()).toLowerCase()).equals("s");
        
        double precioEscudo;
        String cadena;
       
                
         if (escudo){
            cadena="Con escudo";
            precioEscudo=2.50;
        } else {
             cadena="Sin escudo";
             precioEscudo=0;
         }
        
        
        total=precio+precioEscudo+envio;
        
        System.out.println("Precio base: "+ precio + " $");
        System.out.printf("%s : %3.2f\n" , cadena ,precioEscudo );
        System.out.println("Gastos de envio : " + envio + " $");
        System.out.println("Total : " + total);
        
    }
}
