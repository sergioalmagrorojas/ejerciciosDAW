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
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int positivos=0;
        int negativos=0;
        int numeros;
        
        System.out.println("Introduce 10 números");
        
        for (int i =0;i<10;i++){
            
            numeros=Integer.parseInt(s.nextLine());
            
            if (numeros<0){
                negativos++;
            }
            if (numeros>0){
                positivos++;
            }
        }
        System.out.println("Ha introducido " + positivos + " números positivos");
         System.out.println("Ha introducido " + negativos + " números negativos");
    }
}
