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
public class ejercicio60 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        System.out.println("Introduce la altura de los calcetines");
        int alto =Integer.parseInt(s.nextLine());
        
        for (int i=0;i<alto-2;i++){
            System.out.println("***   ***");
        }
        //System.out.println();
        for(int j=0;j<2;j++){
            System.out.println("****  ****");
        }
    
    
    }
}
