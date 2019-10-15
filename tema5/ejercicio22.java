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
public class ejercicio22 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        int inicio=2;
        int fin=100;
        boolean primo=true;
        
        
        for(int i=inicio ; i<=fin;i++){
            primo=true;
            for (int x =inicio;x<i;x++){
                if (i%x==0){
                    primo=false;
                }
            }
            if(primo){
            System.out.printf(i + "\n");
            }   
            
        }
    }
}
