/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.ejercicio9;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author sergi
 */
public class ejercicio9 {
  public static void main(String[] args) {

    ArrayList<Carta> cartas = new ArrayList<Carta>();

    Carta a = new Carta();

    cartas.add(a);

    for (int i = 0; i < 10; i++) {
      while (cartas.contains(a)) {
        a=new Carta();
      }
      cartas.add(a);
    }
    
    Collections.sort(cartas);

    
    for (Carta carta : cartas) {
      System.out.println(carta);
    }

  }
}
