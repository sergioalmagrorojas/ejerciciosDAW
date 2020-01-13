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
public class ejercicio36 {
    public static void main(String[] args){
        int [] array=new int [50];
        
        for (int i =0;i<50;i++){
            array[i]=(int)(Math.random()*200+1);
        }
        System.out.println("");
        
        System.out.println("Array original: ");
        for (int i =0;i<50;i++){
            System.out.print(array[i] + " ");
        }
        
        System.out.println("");
        
        System.out.println("Array de primos : ");
        
        funciones.matematicas.muestraArray(filtraPrimos(array));
    }
    
    public static boolean esPrimo(int x) {

        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
        return true;
    }
    
    
    
    public static  int[] filtraPrimos(int x[]){
        int [] arrayPrimos=new int [x.length];
        int cantidad=0;
        
        for(int numero :x){
            if(esPrimo(numero)){
                arrayPrimos[cantidad++]=numero;
            }
        }
        int [] arrayFinal=new int [cantidad];
        for (int i =0;i<cantidad;i++){
            arrayFinal[i]=arrayPrimos[i];
        }
        return arrayFinal;
    } 
}
