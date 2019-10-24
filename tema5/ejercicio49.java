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
public class ejercicio49 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        
        
        int cuenta=0;
        int maximo=0;
        int minimo=0;
        boolean primo;
        int numero;
        int suma=0;
        
        
        
        do{
            System.out.println("Introduce un número , para parar la ejecución introduce un número primo");
            numero=Integer.parseInt(s.nextLine());
            primo=true;
            for(int i=2 ; i<numero;i++){
                if (numero%i==0){
                    primo=false;
                }
            }
            if(!primo) {
                suma+=numero;
                cuenta++;
            }
            if (cuenta==1){
                maximo=numero;
                minimo=numero;
            }
            if (numero>maximo){
                maximo=numero;
            }
            if (numero<minimo){
                minimo=numero;
            }
            
        }while(!primo);
        
        System.out.println("Suma " + suma);
        System.out.println("Media " + suma/cuenta);
        System.out.println("Numeros introducidos " + cuenta);
        System.out.println("Máximo " + maximo);
        System.out.println("Mínimo " + minimo);
         
    }
}
