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
public class ejercicio40 {
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
        
        funciones.matematicas.muestraArray(filtra7(array));
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
    public static int digitos(int x ){
        int cuentaDigitos=0;
        while(x>0){
            x/=10;
            cuentaDigitos++;
        }
        return cuentaDigitos;
     }
    public static int digitoN(int x, int n) {
        x = volteado(x);
        while (n-- > 0) {
            x = x / 10;
        }
        return (int) x % 10;
    }
    public static int buscaDigitos(int x , int f){
        int i ;
        for(i=0;(i<digitos(x)) && (digitoN(x , i)!=f); i++){
        }
        if(i==digitos(x)){
            return -1;
        }else {
            return i;
        }
    }
    
    public static boolean contieneEl7(int n) {
        return buscaDigitos(n, 7) != -1;
    }
    
    public static  int[] filtra7(int x[]){
        int [] array7=new int [x.length];
        int cantidad=0;
        
        for(int numero :x){
            if(contieneEl7(numero)){
                array7[cantidad++]=numero;
            }
        }
        int [] arrayFinal=new int [cantidad];
        for (int i =0;i<cantidad;i++){
            arrayFinal[i]=array7[i];
        }
        return arrayFinal;
    } 
}
