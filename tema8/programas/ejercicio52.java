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
public class ejercicio52 {
    public static void main(String[] args){
        
        int[]array1={1,2,3,4,5,6,7,8,9,10};
        int[] array2={11,12,13,14,15,16,17,18,19,20};
        
        System.out.println(aleatorioDeArray(array1));
        System.out.println(aleatorioDeArray(array2));
        System.out.println(aleatorioDeArray(array1));
        System.out.println(aleatorioDeArray(array2));
        System.out.println(aleatorioDeArray(array1));
        System.out.println(aleatorioDeArray(array2));
    }
    public static int aleatorioDeArray(int[] a){
        return a[(int)(Math.random()*a.length)];
    }

}
