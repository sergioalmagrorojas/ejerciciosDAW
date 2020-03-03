/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.ejercicio7;

/**
 *
 * @author sergi
 */
import java.util.ArrayList;
public class ejercicio7 {
  public static void main(String[] args){
    
    ArrayList<Moneda> array=new ArrayList<Moneda>();
    
    Moneda nueva=new Moneda();
    
    array.add(nueva);
    
    String posicion= nueva.getPosicion();
    String cantidad=nueva.getMoneda();
    
    for(int i =0;i<6;i++){
      nueva=new Moneda();
      
      
      array.add(nueva);
      posicion= nueva.getPosicion();
      cantidad=nueva.getMoneda();
      
    }

    
    for(Moneda a:array){
      System.out.println(a);
    }
    
  }
}

