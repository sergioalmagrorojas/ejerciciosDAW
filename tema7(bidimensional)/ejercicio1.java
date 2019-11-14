/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.bidimensional;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class ejercicio1 {
    public static void main(String[] args) {
        
        
        
        
        int[][] cuadrante=new int [3][6];
        int y , x;
        cuadrante[0][0]=0;
        cuadrante[0][1]=30;
        cuadrante[0][2]=2;
        cuadrante[0][5]=5;
        cuadrante[1][0]=75;
        cuadrante[1][4]=0;
        cuadrante[2][2]=-2;
        cuadrante[2][3]=9;
        cuadrante[2][5]=11;
        
        
        System.out.print("        "); 
        for(x=0;x<6;x++){
            System.out.print("      columna" + x);
        }
        
        for( y=0;y<3;y++){
            System.out.print("\nFila " + y);  
            for(x=0;x<6;x++){
                System.out.printf("%11d   ", cuadrante[y][x]); 
            }
        }
        
        System.out.println("");
        
    }
}
