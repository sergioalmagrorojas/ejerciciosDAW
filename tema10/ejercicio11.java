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
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
public class ejercicio11 {

  public static void main(String[] args) {
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
    
    int numero;
    
    String[] array1 = diccionario.keySet().toArray(new String[0]);


    ArrayList<Integer> array = new ArrayList<Integer>();
    
    array.add((int) (Math.random() * 10));
    
    for (int i = 0; i < 5; i++) {
      do {
        numero = (int) (Math.random() * 10);
      } while (array.contains(numero));
      array.add(numero);
    
    }

    int puntos = 0; 
    System.out.println("Di la traduccion");
    for (int i = 0; i < 6; i++) {
      System.out.print(array1[array.get(i)] + " = ");
      String palabra = s.nextLine();
      if (palabra.equals(diccionario.get(array1[array.get(i)]))) {
        puntos++;
      } 
    }
    System.out.println("");
    System.out.println("Puntuación : " + puntos);
    if(puntos>=3){
      System.out.println("Enhorabuena has pasado el 'corte' ");
    }else{
      System.out.println("Has supendido , adiós.");
    }
  }
}
