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
public class prueba {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        
        char letra=' ';
        System.out.println("Introduzca letra ");
        do{
            letra=s.next().charAt(0);
        } while (letra!='*');
        
        if (letra!='*'){
            System.out.print(letra);
        }
        
    }
}
