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
public class ejercicio42 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int numero;
        boolean primo=true;
       
        System.out.println("Introduce un número");
        numero=Integer.parseInt(s.nextLine());
        
        for(int i=numero ; i<=numero+4;i++){
            primo=true;
            for (int x =2;x<i;x++){
                if (i%x==0){
                    primo=false;
                }
            }
            if(primo){
                System.out.println("Es primo " + i);
            }else {
                System.out.println("No es primo " + i);
            }
        }
        
        
    
    
    
    }
}
