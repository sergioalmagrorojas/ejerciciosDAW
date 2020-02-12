/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * @author sergi
 */
public class ejercicio11 {
  public static void main(String[] args){
    Tarjeta tarjeta1=new Tarjeta(200);
    Tarjeta tarjeta2=new Tarjeta(200);
    Tarjeta tarjeta3=new Tarjeta(200);
    
    System.out.println(tarjeta1);
    System.out.println(tarjeta2);
    System.out.println(tarjeta3);
    
    tarjeta1.gastar(150);
    tarjeta1.gastar(60);
    tarjeta3.gastar(180);
    
    System.out.println(tarjeta1);
    System.out.println(tarjeta2);
    System.out.println(tarjeta3);
    
    Tarjeta tarjeta4=tarjeta1.fusionar(tarjeta3);
    System.out.println(tarjeta4);
  }
}
