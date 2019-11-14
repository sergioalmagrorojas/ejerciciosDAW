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
public class ejercicio13 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int mostrar;
        int max =0;
        int min=100;
        int eleccion;
        
        
        int[] aleatorios=new int [100];
        
        for(int i =0;i<100;i++){
            aleatorios[i]=(int)(Math.random()*501);
            
            if(aleatorios[i]>max){
                max=aleatorios[i];
            }
             if(aleatorios[i]<min){
                min=aleatorios[i];
            }
            
        }
        
        System.out.println("");
        
        for(int i =0;i<100;i++){
            System.out.println(aleatorios[i] + " ");
        }
        System.out.println("");
        System.out.println("Cuál quiere destacar 1)maximo 2) minimo: ");
        eleccion=s.nextInt();
        
        if(eleccion==1){
             mostrar=max;
        }else{
            mostrar=min;
        }
        
        //se muestra el array ya con la opcion del destacado
        
        for (int i =0;i<100;i++){
            if(aleatorios[i]==mostrar){
                System.out.println("*** " + aleatorios[i] + " ***");
            }else {
                System.out.println(aleatorios[i] + "  ");
            }
        }
        System.out.println("");
     
    }
}
