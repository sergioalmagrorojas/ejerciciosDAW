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
import java.util.ArrayList;
public class Carrito {
  
  ArrayList<Elemento> carro=new ArrayList<>();
  
  public void agrega(Elemento producto){
    carro.add(producto);
  }
  
  public int numeroProductos(){
    return carro.size();
  }
  
  public double total(){
    double total=0;
    for(Elemento producto:carro){
      total+=producto.getPrecio()*producto.getUnidades();
    }
    return total;
  } 
  
  public String toString(){
    System.out.println("Contenido");
    String salida="-------------------\n";
    for(Elemento producto:carro){
      salida+= producto + "\n";
    }
    return salida;
  }
  
  
  
}
