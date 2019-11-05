/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7_1;
import java.util.Scanner;
/**
 *
 * @author sergi
 */
public class ejercicio3 {
    public static void main(String[] args) {
        
        Scanner s =new Scanner(System.in);
        
        int []vector=new int[10];
        
        
        
        for (int i =0;i<10;i++){
            System.out.println("Vaya introduciendo números : ");
             vector[i]=s.nextInt();
            
        }
        
        System.out.println("Los números son : ");
        
        for(int i =9;i>=0;i--){
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
}
