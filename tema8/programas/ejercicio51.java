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
public class ejercicio51 {
    public static void main(String[] args){
        int[] array =(generaArray(10,100,2));
        
        System.out.println("Array:");
        muestraArray(array);
        
        for(int x : array){
            if(esPrimo(x)){
                System.out.print("El " +x+  " es primmo");
            }else {
                System.out.print("El "+x+" no es primo");
            }
            if(capicua(x)){
                System.out.println(" y es  capicua");
            }else{
                System.out.println(" ni capicua");
            }
        }
        
    
    }
    public static int[] generaArray(int cantidad , int tope , int minimo){
        int[] array=new int[cantidad];
        
        for(int i =0; i<cantidad;i++){
            array[i]=(int)(Math.random()*(tope-minimo+1)+minimo);
        }
        return array;
    }
    public static boolean esPrimo(int x) {

        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void muestraArray(int num[]){
        for (int i=0;i<num.length;i++){
            System.out.println(num[i] + " ");
        }
    }
    public static int volteado(int x){
        int cifra=0;
        int vuelta = 0;
        while(x!=0){
            cifra = x%10;
            vuelta = (vuelta * 10) + cifra;
            x/=10;
        }
        return vuelta;
    }
    public static boolean capicua(int x ){
         return x == volteado(x); 
    }
}
