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
public class repaso2 {
    public static void main (String[] args){
        Scanner s =new Scanner(System.in);
        int entrada;
        System.out.println("Introduzca un número positivo");
        
        do{
             entrada = s.nextInt();
            if(entrada<=0){
                System.out.println("Introduzca un número mayor que 0");
            }
             int i =1;
             
             while(i<=entrada){
                 System.out.println(i);
                 i++;
             }
             
        }while (entrada<0);
    }
}
