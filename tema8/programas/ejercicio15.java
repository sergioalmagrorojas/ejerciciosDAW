/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

/**
 *
 * @author sergi
 */
public class ejercicio15 {
    public static void main(String[] args){
        
        for(int i =1;i<=1000;i++){
            if(funciones.matematicas.esPrimo(i)){
                System.out.println( i + " ");
            }
        }
    }
}
