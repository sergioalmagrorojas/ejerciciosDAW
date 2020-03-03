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
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class ejercicio14 {
  public static void main(String[] args){
    Scanner s =new Scanner(System.in);
    String producto="";
    int cantidad=0;
    double subtotal;
    double unidad;
    double total=0;
    HashMap<String , Double> lista=new HashMap<String, Double>();
    
    lista.put("Avena", 2.21 );
    lista.put("Garbanzos",2.39 );
    lista.put("Tomate", 1.59 );
    lista.put("Jengibre",3.13 );
    lista.put("Quinoa", 4.50);
    lista.put("Guisantes", 1.60 );
    
    ArrayList<String> arrayProductos= new ArrayList<String>();
    ArrayList<Integer> arrayCantidad=new ArrayList<Integer>();
    
    
    do{
      System.out.print("Producto a comprar : ");
      producto=s.nextLine();
      
      
      if(!producto.equals("fin")){
        System.out.print("Cantidad del  producto  : ");
        cantidad=s.nextInt();
        
        arrayProductos.add(producto);
        arrayCantidad.add(cantidad);
        s.nextLine();
      }
      
    }while(!(producto.equals("fin")));
    System.out.println("---------------------------------");
    for(int i =0;i<arrayProductos.size();i++){
      String productoFactura=arrayProductos.get(i);
     
      unidad=lista.get(productoFactura);
      
      int cantidadFactura=arrayCantidad.get(i);
      
      subtotal=unidad*cantidadFactura;
      
      total+=subtotal;
      
      System.out.printf("%-10s %9.2f %6d %9.2f\n" , productoFactura , unidad , cantidadFactura , subtotal );
    }
    System.out.println("---------------------------------");
    System.out.printf("Total: %.3f  €", total);
    System.out.println("");
    
  }
}
