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
public class ejercicio27 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        int minimo=1;
        int numero;
        int cuentaMultiplos=0;
        int sumaMultiplos=0;
        boolean multiplo=true;
        
        System.out.println("Dime un número: ");
        numero=Integer.parseInt(s.nextLine());
        
        for(int i=minimo;i<numero;i++){
            if (i%3==0){
            multiplo=true;
            cuentaMultiplos++;
            sumaMultiplos+=i;
            }
            for (int x =minimo;x<i;x++){
                if ((i%3!=0)){
                    multiplo=false;
                }
                
            }
            
        }
        if(multiplo){
                System.out.println("Numero de múltiplos : " + cuentaMultiplos);
                System.out.println("Suma de múltiplos : " + sumaMultiplos);
            }  
        
    }
}