/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4_1;

/**
 *
 * @author sergi
 */
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner s =new Scanner (System.in);
        double sueldo;
        System.out.println("Introduzca las horas trabajadas : ");
        int horas=Integer.parseInt(s.nextLine());
         
        if (horas<=40){
            sueldo=horas*12;
            
        } else {
            sueldo =((horas - 40)*16)+ (40 * 12 )  ;
        }
        
         
         
         System.out.println("Horas : " + horas);
         System.out.println("Total : " + sueldo + " euros de salario");
    }
}
