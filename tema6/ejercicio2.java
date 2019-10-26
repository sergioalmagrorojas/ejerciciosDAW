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
public class ejercicio2 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        String palo="";
        String carta="";
        
        int numeroPalo=(int)(Math.random()*5+1);
        int numeroCarta=(int)(Math.random()*14+1);
        
        switch(numeroPalo){
            case 1 :
                palo="picas";
            break;
            case 2 :
                palo="corazones";
            break;
            case 3 :
                palo="diamantes";
            break;
            case 4 :
                palo="tréboles";
            break;
            default:
        }
          if(numeroCarta>=2 && numeroCarta<=10){
            System.out.println(numeroCarta);
          } else{
                switch(numeroCarta){
                    case 1 :
                         carta="As";
                    break;
                    case 11 :
                        carta="J";
                    break;
                    case 12 :
                        carta="Q";
                    break;
                    case 13:
                        carta="K";
                     break;
                    default:
                }
        System.out.println(carta + " de " + palo);
        
           }
    }      
}
