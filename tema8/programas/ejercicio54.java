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
public class ejercicio54 {
    public static void main(String[] args){
        
        System.out.println(ocurrencias(1,1100));
        System.out.println(ocurrencias(2,2345));
        int [] array={3,33,43,55,44};
        System.out.println(ocurrencias(3,array));
    }
    public static int ocurrencias(int digito, int n){
        int veces=0;
        
        while(n>0){
            if (n%10==digito){
                veces++;
            }
            n=n/10;
        }
        return veces;
    }
    public static int ocurrencias(int digito, int[] a){
        int veces=0;
        for (int x:a){
            veces+=ocurrencias(digito,x);
        }
        return veces;
    }

}
