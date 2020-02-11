/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author sergi
 */
public class ejercicio9 {
    public static void main(String[] args){
        Movil movil1=new Movil("674 456 789" , "rata");
        Movil movil2=new Movil("772 234 567" , "mono");
        Movil movil3=new Movil("801 456 789" , "bisonte");
        
        System.out.println(movil1);
        System.out.println(movil2);
        System.out.println("");
        
        movil1.llamada(movil3, 800);
        movil2.llamada(movil1, 300);
        movil3.llamada(movil2, 2500);
        
        System.out.println(movil1);
        System.out.println(movil2);
        System.out.println(movil3);
        
    }
}
