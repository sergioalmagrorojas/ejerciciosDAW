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
public class ejercicio5 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        int maximo=0;
        int minimo=0;
        int cuenta=0;
        int suma=0;
        int media=0;
        
        for (int i = 0 ; i<=50;i++){
            int numeros=(int)(Math.random()*100+100);
            System.out.print(numeros + " ");
            cuenta++;
            suma+=numeros;
            if (cuenta==1){//para que coja el primer valor introducido como minimo y maximo
                maximo=numeros;
                minimo=numeros;
            }
            if (numeros>maximo){
                maximo=numeros;
            }
            if (numeros<minimo){
                minimo=numeros;
            }
            
        }
        
        media =suma/cuenta;
        
        System.out.println("Media " + suma/cuenta);
        System.out.println("Máximo " + maximo);
        System.out.println("Mínimo " + minimo);
        
    }
}
