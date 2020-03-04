/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.ejercicio17;

/**
 *
 * @author sergi
 */
public class Elemento {
  String producto="";
  Double precio;
  Integer unidades;
  
  public Elemento(String producto, double precio, int unidades){
    this.producto=producto;
    this.precio=precio;
    this.unidades=unidades;
  }
  public String getProducto(){
    return producto;
  }
  public Double getPrecio(){
    return precio;
  }
  public Integer getUnidades(){
    return unidades;
  }
  
  public void setProducto(String producto){
    this.producto=producto;
  }
  public void setPrecio(double precio){
    this.precio=precio;
  }
  public void setUnidades(int unidades){
    this.unidades=unidades;
  }
  
  public String toString(){
    return producto + " Precio :  " + this.precio + " Unidades " + this.unidades + " Totaal producto : " + this.unidades*this.precio;
  }
}
