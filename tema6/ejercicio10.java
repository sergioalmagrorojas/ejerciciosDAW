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
public class ejercicio10 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int longitud;
        int caracter1;
        String caracter="";
        
        for (int i=0;i<10;i++){
            
            longitud=(int)(Math.random()*41+1);
            caracter1=(int)(Math.random()*7+1);
            
            switch(caracter1){
                case 1 :
                    caracter="*";
                break;
                case 2 :
                    caracter="-";
                break;
                case 3 :
                    caracter="@";
                break;
                 case 4 :
                    caracter="=";
                break;
                case 5 :
                    caracter=".";
                break; 
                case 6 :
                    caracter="|";
                break;
            }
            
            for(int x=0;x<longitud;x++){
                System.out.print(caracter);
                
            }
            System.out.print("\n");
        }
    }
}
