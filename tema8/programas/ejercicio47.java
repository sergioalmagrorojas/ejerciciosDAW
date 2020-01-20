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
public class ejercicio47 {
    public static void main(String[] args){
        
        int[] array1={4,5,6,7,8,9,10};
        int [] array2={11,12,13,14,15,16,17,18,19,20};
        
        System.out.println("array 1 : " + convierteArrayEnString(array1));
        
        System.out.println("array 2 : " + convierteArrayEnString(array2));
    }
    public static String convierteArrayEnString(int[] a){
        String numerosAString=" ";
        for(int numero:a){
            numerosAString+=" " + numero;
        }
        return numerosAString;
    }
}
