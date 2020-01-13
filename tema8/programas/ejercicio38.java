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
public class ejercicio38 {
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
        
        funciones.matematicas.muestraArray(filtraCapicuas(array));
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
    
    public static boolean esCapicua(int x) {
         return x == volteado(x); 
    }
    
    public static  int[] filtraCapicuas(int x[]){
        int [] arrayCapicuas=new int [x.length];
        int cantidad=0;
        
        for(int numero :x){
            if(esCapicua(numero)){
                arrayCapicuas[cantidad++]=numero;
            }
        }
        int [] arrayFinal=new int [cantidad];
        for (int i =0;i<cantidad;i++){
            arrayFinal[i]=arrayCapicuas[i];
        }
        return arrayFinal;
    } 
    
}
