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
public class piramideIzquierda {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int i;
        int linea = 1;
        int altura;
        int espaciosIzq;
        int numCaracteres;
         System.out.print("Introduzca la altura (1-10): ");
         altura = s.nextInt();
         
        espaciosIzq = altura - 1;
         while (linea <= altura) {
	  // Inserta espacios a la izquierda
	  for (i = 0; i < espaciosIzq; i++) {
	    System.out.print(" ");
	  }
	  // Pinta caracteres
	  numCaracteres = 0;
	  while (numCaracteres < linea) { 
	    if (numCaracteres < linea) {
	      System.out.print("*");
	      numCaracteres++;
	    }
	    if (numCaracteres < linea) {
	      System.out.print("*");
	      numCaracteres++;
	    }
	    
	  }
	  System.out.println();
	  
	  espaciosIzq--;
	  linea++;
	}
	
	// Pinta la parte inferior de la piramide
	linea -= 2;
	espaciosIzq = 1;
	while (linea > 0) {
	  // Inserta espacios a la izquierda
	  for (i = 0; i < espaciosIzq; i++) {
	    System.out.print(" ");
	  }
	  
	  // Pinta caracteres
	  numCaracteres = 0;
	  while (numCaracteres < linea) { 
	    if (numCaracteres < linea) {
	      System.out.print("*");
	      numCaracteres++;
	    }
	    if (numCaracteres < linea) {
	      System.out.print("*");
	      numCaracteres++;
	    }
	  
	  }
	  System.out.println();
	  
	  espaciosIzq++;
	  linea--;
	}
    }

}
