/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author sergi
 */
public class ejercicio8 {
    public static void main(String[] args){
        Terminal movil1=new Terminal("674 456 789");
        Terminal movil2=new Terminal("772 234 567");
        Terminal movil3=new Terminal("801 456 789");
        
        System.out.println(movil1);
        System.out.println(movil2);
        
        movil1.llamada(movil3, 800);
        movil2.llamada(movil1, 300);
        movil3.llamada(movil2, 200);
        
        System.out.println(movil1);
        System.out.println(movil2);
        System.out.println(movil3);
        
    }
}
