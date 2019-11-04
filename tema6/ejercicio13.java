/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6_1;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class ejercicio13 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int tirada1;
        int tirada2;
        
        do{
            tirada1=(int)(Math.random()*7+1);
            tirada2=(int)(Math.random()*7+1);
            
            System.out.println("dado 1 : " + tirada1 + " dado 2 : "+ tirada2);

        }while(tirada1!=tirada2);
    }
}
