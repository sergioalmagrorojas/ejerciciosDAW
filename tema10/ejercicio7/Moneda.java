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
public class Moneda {
  String [] posiciones ={"cara" , "cruz"};
  String [] moneda={"1 centimo" , "2 centimos" , "5 centimos" , "10 centimos" , 
    "20 centimos" , "50 centimos" , "1 euro" , "2 euros"};
  
  String elegirPosicion;
  String elegirMoneda;
  
  public Moneda(){
    this.elegirPosicion=posiciones[(int)(Math.random()*2)];
    this.elegirMoneda=moneda[(int)(Math.random()*8)];
  }
  
  public String getPosicion(){
    return this.elegirPosicion;
  }
  public String getMoneda(){
    return this.elegirMoneda;
  }
  
  public String toString(){
    return this.elegirMoneda + " " + this.elegirPosicion;
  }
  
}
