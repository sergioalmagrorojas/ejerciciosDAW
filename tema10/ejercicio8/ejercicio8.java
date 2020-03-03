/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.ejercicio8;

import java.util.ArrayList;
import tema10.ejercicio7.Moneda;

/**
 *
 * @author sergi
 */
public class ejercicio8 {

  public static void main(String[] args) {

    ArrayList<Carta> array = new ArrayList<Carta>();

    Carta a = new Carta();

    array.add(a);

    for (int i = 0; i < 10; i++) {
      while (array.contains(a)) {
        a=new Carta();
      }
      array.add(a);
    }

    for (Carta carta : array) {
      System.out.println(carta);
    }

  }
}
