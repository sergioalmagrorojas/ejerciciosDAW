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
public class ejercicio03 {
  public static void main (String[] args) {
    int altura;
    Scanner s =new Scanner(System.in);
    do {
      System.out.print("Introduzca la altura de la pirámide (entre 3 y 30): ");  
      altura = Integer.parseInt (s.nextLine());
    } while ((altura < 3) || (altura > 30));
    
    // primera parte:
    for (int i=1; i<=altura; i++) {
      // pinto primer asterisco
      System.out.print("*");
      // pinto espacios en blanco internos
      for (int j=1; j<=(i-2); j++) {
        System.out.print(" ");
      }
      // pinto asterisco final
      if (i > 1) {
        System.out.print("*");
      }
      System.out.println("");
    }
    
    // segunda parte:
    for (int i=altura-1; i>=1; i--) {
      // pinto primer asterisco
      System.out.print("*");
      // pinto espacios en blanco internos
      for (int j=1; j<=(i-2); j++) {
        System.out.print(" ");
      }
      // pinto asterisco final
      if (i > 1) {
        System.out.print("*");
      }
      System.out.println("");
    }
    
    
    
  }
}

