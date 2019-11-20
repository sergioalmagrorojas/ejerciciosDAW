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
public class ejercicio62 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        int numero=Integer.parseInt(s.nextLine());
        int cuentaAfortunados=0;
        int cuentaNormales=0;
        do{
            int digitos=(int)(numero%10);
            if ((digitos==3)||(digitos==7)||(digitos==8)||(digitos==9)){
                cuentaAfortunados++;
            }else {
                cuentaNormales++;
            }
            numero =numero/ 10;

        }while(numero>0);
        
        if(cuentaNormales<cuentaAfortunados){
            System.out.println("El número  es afortunado");
        }else {
            System.out.println("El número  no es afortunado");
        }
    }
}
