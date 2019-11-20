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
public class ejercicio8 {
    public static void main(String []   args){
        Scanner s =new Scanner(System.in);
        
        int numero;
        System.out.println("Introduce un número y le indico su tabla de multiplicar (hasta (numero*15)");
        numero=Integer.parseInt(s.nextLine());
        
        for(int i =0;i<=15;i++){
            System.out.println(numero + "x" + i + "=" + (numero*i));
        }
        
    }
}
