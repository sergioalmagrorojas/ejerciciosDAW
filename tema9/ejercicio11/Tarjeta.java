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
public class Tarjeta {
  private String numero;
  double dinero;
  
  
  public Tarjeta(double saldo){
    this.dinero=saldo;
    this.numero="";
    for(int i =0;i<5;i++){
      this.numero+=(int)(Math.random()*10+1);
    }
  }
  public void  setDinero(double dinero){
    this.dinero=dinero;
  }
  public double getDinero(){
    return dinero;
  }
  
  public String toString(){
    return "Dinero de la tarjeta " + numero + "|||" + " " + dinero;
  }
  
  public void gastar(double x){
    if(x<dinero){
      dinero-=x;
    }else{
      System.out.println("No hay suficiente dinero");
    }
    
  }
  public Tarjeta fusionar(Tarjeta x){
    double dineroJunto=this.getDinero() + x.getDinero();
    this.setDinero(0);
    x.setDinero(0);
    return new Tarjeta(dineroJunto);
  }
  
  
}
