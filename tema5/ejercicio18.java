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
public class ejercicio18 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int numero1;
        int numero2;
        int auxiliar;
        
        System.out.println("Introduce dos números y te digo los enteros entre ellos");
        numero1=Integer.parseInt(s.nextLine());
        numero2=Integer.parseInt(s.nextLine());
        
        
        if(numero1>numero2){
            auxiliar=numero1;
            numero1=numero2;
            numero2=auxiliar;
        }
        if (numero1==numero2){
            System.out.println("Los dos números son iguales");
        }
        for (int i =numero1;i<=numero2;i=i+7){
            System.out.print(i + " ");
        }  
    }
}
