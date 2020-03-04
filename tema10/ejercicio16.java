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
import java.util.HashMap;
import java.util.Scanner;
public class ejercicio16 {
  public static void main(String[] args){
    Scanner s =new Scanner(System.in);
    String pais="";
    String aprender="";
    HashMap<String,String> libro=new HashMap<String,String>();
    
    libro.put("españa", "madrid");
    libro.put("francia", "paris");
    libro.put("portugal", "lisboa");
    
    while(!(pais.equals("salir"))){
      System.out.println("Introduzca país: ");
      pais=s.nextLine();
      if(!(pais.equals("salir"))){
        if(libro.containsKey(pais)){
          System.out.println("La capital del país " + pais + " es : "  + libro.get(pais));
        }else{
          System.out.print("No conozco ese país , digame su capital : ");
          aprender=s.nextLine();
          libro.put(pais, aprender);
          System.out.println("Capital aprendida , gracias :).");
        }
      }
      
      
    }
    
    
  }
}
