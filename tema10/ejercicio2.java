/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10;

/**
 *
 * @author sergi
 */
import java.util.ArrayList;
public class ejercicio2 {
  public static void main(String[] args){
    ArrayList<Integer> arrayList=new ArrayList<Integer>();
    
    int cantidad=(int)(Math.random()*10+11);
    int suma=0;
    int minimo=200;
    int maximo=0;
    
    for(int i =0;i<cantidad;i++){
      arrayList.add((int)(Math.random()*200));
    }
    System.out.println(arrayList);
    for (int i :arrayList){
      suma+=i;
      if(i>maximo){
        maximo=i;
      }
      if(i<minimo){
        minimo=i;
      }
    }
    
    System.out.println("");
    
    System.out.println("Suma: " + suma);
    System.out.println("Mínimo: " + minimo);
    System.out.println("Máximo : " + maximo);
    System.out.println("Media : " + suma/cantidad);
  }
}
