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
public class ejercicio19 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        
        int [] array1 = new int [12];
        int [] mayoresA=new int [12];
        int [] menoresA = new int [12];
        
        for ( int i =0 ; i<12 ; i++){
            array1[i]=(int) (Math.random()*201);
        }
        
        for(int i =0;i<12;i++){
            System.out.print(array1[i] + " | ");
        }
        
        System.out.println("");
        
        System.out.println("Introduzca un número para meterlo en el array: ");
        int numeroIntroducido=s.nextInt();
        System.out.println("Introduzca la posicion (0-11)");
        int posicionIntroducida=s.nextInt();
        
        for(int i =11;i>posicionIntroducida;i--){
            array1[i]=array1[i-1];
        }
        
        array1[posicionIntroducida]=numeroIntroducido;
        
        System.out.println("");
        
        System.out.println("ARRAY RESULTADO: ");
        for(int i =0;i<12;i++){
            System.out.print(array1[i] + " | ");
        }
    }
}
