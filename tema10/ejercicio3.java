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
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class ejercicio3 {
  public static void main(String[] args){
    Scanner s =new Scanner (System.in);
    
    ArrayList<Integer> array=new ArrayList<Integer>();
    
    System.out.println("Introduzca 10 números : ");
    for (int i =0;i<10;i++){
      array.add(s.nextInt());
    }
    
    System.out.println("Lista ordenada : " );
    
    Collections.sort(array);
    
    System.out.println(array);
    
    
  }
}
