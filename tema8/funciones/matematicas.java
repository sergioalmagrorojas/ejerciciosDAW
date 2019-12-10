/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

/**
 *
 * @author sergi
 */
public class matematicas {
    public static boolean esPrimo(int x) {

        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
        return true;
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
    public static int siguientePrimo(int x) {
        while (!esPrimo(++x)) {
        }
        return x;
    }
    
    public static int potencia(int base ,int exponente){
        int n=1;
        for(int i=0;i<Math.abs(exponente);i++){
            n=n*base;
        }
        return n;
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
      public static int quitaNumeros(int x , int f){
       return x /(int)(potencia(10,f));
    }
     public static long juntaNumeros(int x, int f) {
        return (int) (x * potencia(10, digitos(f))) + f;
    }

    public static int añadeNumero(int x , int f){
        return (int)juntaNumeros(x,f);
    }
    
    public static int[] generaArray(int cantidad , int tope , int minimo){
        int[] array=new int[cantidad];
        
        for(int i =0; i<cantidad;i++){
            array[i]=(int)(Math.random()*(tope-minimo+1)+minimo);
        }
        return array;
    }
    public static int minimo(int[] array){
        int minimo=Integer.MAX_VALUE;
        for (int i : array){
            if(i<minimo){
                minimo=i;
            }
        }
        return minimo;
    }
    public static int maximo(int[] array){
        int maximo=Integer.MIN_VALUE;
        for (int i : array){
            if(i>maximo){
                maximo=i;
            }
        }
        return maximo;
    }
    public static long binarioDecimal(long x){
        long decimal=0;
        int exponente=0;
        long digito;
        
        while (x != 0) {
                digito = x % 10;
                decimal = decimal + digito * (int) Math.pow(2, exponente);
                exponente++;
                x = x / 10;
        }
        return decimal;
    }
    public static long decimalBinario(long x){
        long binario=0;
        int exponente=0;
        long digito;
        
        while (x != 0) {
                digito = x % 2;
                binario = binario + digito * (int) Math.pow(10, exponente);
                exponente++;
                x = x / 2;
        }
        return binario;
    }
    public static double media(int[] array){
        int suma=0;
        for(int i:array){
            suma+=i;
        }
        double  media = (double)suma/array.length;
        return media;
    }
}
