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
import java.util.Scanner;
import java.util.HashMap;
public class ejercicio10 {
  public static void main(String[] args){
    Scanner s =new Scanner(System.in);
    HashMap<String, String> diccionario = new HashMap<String, String>();
    
    diccionario.put("coche" , "car");
    diccionario.put("hola" , "Hello");
    diccionario.put("adiós" , "goodbye");
    diccionario.put("casa" , "house");
    diccionario.put("verde" , "green");
    diccionario.put("marrón" , "brown");
    diccionario.put("negro" , "black");
    diccionario.put("amarillo" , "yellow");
    diccionario.put("rosa" , "pink");
    diccionario.put("blanco" , "white");
    String palabra="";
    System.out.println("Introduzca una palabra : ");
    palabra=s.nextLine();
    
    if(diccionario.containsKey(palabra)){
      System.out.println("La palabra es " + diccionario.get(palabra) + " en inglés.");
    }else{
      System.out.println("Esa palabra no existe.");
    }
  }
}
