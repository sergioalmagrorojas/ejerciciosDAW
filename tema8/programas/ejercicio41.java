/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;
import java.util.Scanner;
/**
 *
 * @author sergi
 */
public class ejercicio41 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int altura;
        System.out.println("Introduzca la altura de la figura: ");
        altura=s.nextInt();
        
        for(int i = altura;i>0;i--){
            System.out.println(linea('*' ,i ));
        }
    }
    
    public static  String linea(char caracter , int repeticiones){
        String linea="";
        for(int i =0;i<repeticiones;i++){
            linea+=caracter;
        }
        return linea;
    }
}
