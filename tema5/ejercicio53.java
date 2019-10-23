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
public class ejercicio53 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce la altura");
        int alto=Integer.parseInt(s.nextLine());
        System.out.println("Introduce el carácter de relleno");
        String r =s.nextLine();
        
        for (int i =0;i<alto;i++){
            for (int x=0;x<alto-i;x++){
                System.out.print(r);
            }
            System.out.println();
        }
    }
}
