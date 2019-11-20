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
public class ejercicio64 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        
        int ancho=6;
        int altura=3;
        int eleccion=0;
       
        while(eleccion!=4){
            
            for(int i =0;i<ancho;i++){
                System.out.print("+");
            }
            
            System.out.println();
            
            for (int i =0;i<altura-2;i++){
                System.out.print("+");
                
                for (int x =0;x<ancho-2;x++){
                    System.out.print(" ");
                }
                System.out.println("+");
            }
            
            for(int i =0;i<ancho;i++){
                System.out.print("+");
            }
            
            System.out.println();
            
            System.out.println("Indique la opción deseada");
            System.out.println("1.Hacerlo más pequeño");
            System.out.println("2.Hacerlo más grande");
            System.out.println("3.Cambiar la orientación");
            System.out.print("4.Salir");
            eleccion=Integer.parseInt(s.nextLine());
            
            
            switch(eleccion){
                case 1 :
                    altura--;
                    ancho--;
                break;
                case 2 :
                    altura++;
                    ancho++;
                break;
                case 3:
                    int cambio=ancho;
                    ancho=altura;
                    altura=cambio;
                break;
                default:
            }
            
        }
        
    }
}
