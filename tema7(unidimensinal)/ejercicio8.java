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
public class ejercicio8 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        int [] temperaturas=new int[12];
        
        System.out.println("Vaya introduciendo las temperaturas medias (enero-diciembre)");
        
        for(int i =0;i<12;i++){
            System.out.print(mes[i] + "  ");
            temperaturas[i]=s.nextInt();
            
        }
        
        for(int i =0;i<12;i++){
            for (int j =0;j<temperaturas[i];j++){
                
            
            System.out.print("*");
            
            }
            System.out.println("");
        }
        
    }
}
