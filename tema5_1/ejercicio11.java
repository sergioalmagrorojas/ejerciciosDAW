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
public class ejercicio11 {
    public static void main(String[] args) {
        
        Scanner s =new Scanner(System.in);
        int numero;
        
        System.out.println("Introduce un número y lo elevo al cuadrado y al cubo");
        numero=Integer.parseInt(s.nextLine());
        
        for (int i =numero;i<=numero+5;i++){
            
            System.out.printf("%2d %6d %10d\n", i , i*i , i*i*i);
        }
        
    }
}
