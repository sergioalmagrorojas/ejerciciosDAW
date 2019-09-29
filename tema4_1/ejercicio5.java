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
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a;
        int b ;
        
        
        System.out.println("Introduzca el valor de a: ");
        a=Integer.parseInt(s.nextLine());
        System.out.println("Introduzca el valor de b :");
        b=Integer.parseInt(s.nextLine());
        
        if (a==0){
            System.out.print("La ecuacion no tiene solucion");
        }
        
        System.out.print("La x es : " + (-b/a));
          
  }
}
