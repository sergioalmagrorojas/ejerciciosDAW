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
public class ejercicio39 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce un número y calculo los factoriales hasta ese número");
        int numeroIntroducido=Integer.parseInt(s.nextLine());
        //int multiplicacion=0;
        //int aux=numeroIntroducido;
        for (int x =1; x<=numeroIntroducido;x++){
             int multiplicacion=x ;
            
            //do{
                for (int i =1;i<x;i++){
                    multiplicacion=multiplicacion*i;
                }
            //}while (numeroIntroducido>0);
            System.out.println(x + " ! = " + multiplicacion);
        }
        
    }
}
