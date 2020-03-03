/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.ejercicio8;
import java.util.Objects;
/**
 *
 * @author sergi
 */
public class Carta {
  String [] palo={"Copas" , "Oro" , "Espadas" ,"Bastos"};
  String[] numero={"as" , "2" , "3" , "4" , "5" , "6" , "7" ,"sota" , "caballo" , "rey"};
  String elegirPalo;
  String elegirNumero;
  public Carta(){
    this.elegirPalo=palo[(int)(Math.random()*4)];
    this.elegirNumero=numero[(int)(Math.random()*10)];
  }
  
  public String getPalo(){
    return this.elegirPalo;
  }
  public String getNumero(){
    return this.elegirNumero;
  }
  public String toString(){
    return this.elegirNumero + " de " + this.elegirPalo;
  }
  
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Carta ca = (Carta) obj;
    if (!Objects.equals(this.elegirNumero, ca.elegirNumero)) {
      return false;
    }
    if (!Objects.equals(this.elegirPalo, ca.elegirPalo)) {
      return false;
    }
    return true;
  }
    
  }


