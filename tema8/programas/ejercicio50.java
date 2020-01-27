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
public class ejercicio50 {
    public static void main(String[] args){
        int[] array1={4,5,6};
        int[] array2={7,8,9};
        
        
        for(int x: mezcla(array1,array2)){
            System.out.print(x + " ");
        }
        
    }
    public static int[] mezcla(int[] a, int[] b){
        int[] arrayFinal=new int [a.length+b.length];
        
        int numeros1=0;
        int numeros2=0;
        int i =0;
        do{
            if(numeros1<a.length){
                arrayFinal[i++]=a[numeros1++];
            }
            if(numeros2<b.length){
                arrayFinal[i++]=b[numeros2++];
            }
        }while(i<a.length+b.length);
        return arrayFinal;
        
    }

}
