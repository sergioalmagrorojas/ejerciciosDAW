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
public class ejercicioSorpresa1 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        int alturaInicial;
        int incremento;
        int cantidad;
        int altura1;
        do{
            System.out.println("Introduza altura inicial");
            alturaInicial=Integer.parseInt(s.nextLine());
            if(!(alturaInicial>3)&&(alturaInicial%2==1)){
                System.out.println("La altura debe ser impar y mayor que 3");
            }
        } while(!(alturaInicial>=3)&&(alturaInicial%2==1));
        System.out.println("Introduzca el caracter de relleno");
        String caracter =s.nextLine();
        
        do{
            System.out.println("Introduza el incremento de altura ");
            incremento=Integer.parseInt(s.nextLine());
            if(!(incremento%2==0)){
                System.out.println("La altura debe ser par y mayor o igual a 2");
            }
        } while(!(incremento%2==0));
        
        System.out.print("introduzca el número de veces a dibujar : ");
        cantidad=Integer.parseInt(s.nextLine());
        
        altura1=(alturaInicial+1)/2;
        int anchuraLinea=altura1*2-1;
        //espacios
        for (int i=0;i<altura1;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            //relleno
            for (int j=0;j<anchuraLinea;j++){
                System.out.print(caracter);
            }
        }
    }
}
