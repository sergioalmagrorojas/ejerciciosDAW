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
public class ejercicio11 {
     public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int eleccion;
        int suspensos=0;
        int aprobados=0;
        int bien=0;
        int notables=0;
        int sobresalientes=0;
        
        for(int i =0;i<=20;i++){
            eleccion=(int)(Math.random()*6+1);
            
            switch(eleccion){
                case 1:
                    System.out.println("suspenso");
                    suspensos++;
                break;
                case 2:
                    System.out.println("aprobado");
                    aprobados++;
                break;
                case 3:
                    System.out.println("bien");
                    bien++;
                break;
                case 4:
                    System.out.println("notable");
                    notables++;
                break;
                case 5:
                    System.out.println("sobresaliente");
                    sobresalientes++;
                break;
                default:
            }
            
        }
        System.out.println();
        
        
        System.out.println("LAS CALIFICACIONES SON LAS SIGUIENTES");
        System.out.println("Suspensos: " + suspensos);
        System.out.println("aprobados: " + aprobados);
        System.out.println("bien: " + bien);
        System.out.println("notables: " + notables);
        System.out.println("sobresalientes: " + sobresalientes);
     }
}
