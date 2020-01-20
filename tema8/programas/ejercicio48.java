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
public class ejercicio48 {
    public static void main(String[] args){
        
        int[] array1={4,5,6,7,8,9,10};
        int [] array2={11,12,13,14,15,16,17};
        
        for(int mostrar: concatena(array1,array2)){
            System.out.print(mostrar + " ");
        }
        
    }
    public static int[] concatena(int[] a , int [] b){
        int [] numeros= new int [a.length + b.length];
        for(int i =0;i<a.length;i++){
            numeros[i]=a[i];
        }
        for(int i =0;i<b.length;i++){
            numeros[i+a.length]=b[i];
        }
        return numeros;
    }
}
