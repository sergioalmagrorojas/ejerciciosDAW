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
public class ejercicio35 {
    public static void main(String[] args){
        int[] numeros = new int[4];
        for (int i = 0; i < 4; i++) {
            numeros[i]=(int)(Math.random()*1000+1);
        }
    
        for(int x:numeros){
            System.out.print("El número " + x + " en el sistema de 'palotes' es el siguiente: ");
            System.out.println(funciones.matematicas.palotes(x));
        }
        
    }
}
