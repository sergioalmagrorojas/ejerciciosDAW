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
public class ejercicio32 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        int numero;
        int vuelta=0 ;
        int largo=0;
        int digitos;
        int suma=0;
        
        System.out.println("Introduzca un número positivo");
        numero=Integer.parseInt(s.nextLine());
        
        if (numero==0){
            largo=1;
        }
        do {
            vuelta=vuelta*10+numero%10;
            numero=numero/10;
            largo++;
        }while(numero>0);
        
        for(int i =0; i<largo;i++){
            
            digitos=(int)(vuelta%10);
            
            if ((digitos%2)==0){
                System.out.println(digitos + " ");
                suma+=digitos;
            }
            vuelta/=10;
        }
        System.out.println("Suma de los pares : " + suma);
    }
}
