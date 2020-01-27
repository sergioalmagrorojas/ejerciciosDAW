/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7_1;
/*programa que dice los numeros que hay en el array en orden inverso al introducido*/
/**
 *
 * @author sergi
 */
import java.util.Scanner;
public class repaso1 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        int[] array=new int[5];
        
        for (int i =0;i<5;i++){
            array[i]=s.nextInt();
        }
        System.out.println("Numeros introducidos al revés");
        for(int i =4;i>=0;i--){
            System.out.println(array[i]);
        }
    }
}
