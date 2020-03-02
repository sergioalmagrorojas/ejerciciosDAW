/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author sergi
 */
public class ejercicio6 {
  public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
    HashMap<String, Integer> diccionario = new HashMap<String, Integer>();
    
    diccionario.put("sergio" , 1234);
    diccionario.put("pablo" , 1234);
    diccionario.put("rafa" , 1234);
    diccionario.put("pepe" , 1234);
   
    boolean salir=false;
    int intentos=3;
    String nombre="";
    int contrasena;
    
    do{
      System.out.println("INTRODUZCA USUARIO : ");
      nombre=s.nextLine();
      
      System.out.println("INTRODZCA CONTRASEÑA : ");
      contrasena=s.nextInt();
      if (diccionario.containsKey(nombre)){
        if(diccionario.get(nombre).equals(contrasena)){
          System.out.println("Ha accedido al sistema . ");
          salir=true;
        }else {
          System.out.println("Contraseña incorrecta , pruebe de nuevo .");
        }
      }
      intentos--;
      if(salir==false){
        System.out.println("Te quedan " + intentos + " intentos restantes.");
      }
      s.nextLine();
    }while((intentos>0) && (!salir));
  }
  
}
