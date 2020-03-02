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
public class ejercicio1 {
  public static void main(String[] args){
    ArrayList<String> arrayList=new ArrayList<String>();
    
    arrayList.add("Sergio");
    arrayList.add("juanda");
    arrayList.add("rafa");
    arrayList.add("miguel");
    arrayList.add("pablo");
    arrayList.add("rafa");
    
    for(String a:arrayList){
      System.out.println(a);
    }
  }
}
