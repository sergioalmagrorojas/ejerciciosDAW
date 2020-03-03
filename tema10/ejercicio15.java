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
public class ejercicio15 {
  public static void main(String[] args){
    Scanner s =new Scanner(System.in);
    String producto="";
    int cantidad=0;
    double subtotal;
    double unidad;
    double total=0;
    int lugar =0;
    String descuento="";
    String opcion;
    double aDescontar=0;
    
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
          if(arrayProductos.contains(producto)){
            lugar=arrayProductos.indexOf(producto);
            arrayCantidad.set(lugar , arrayCantidad.get(lugar) + cantidad );
            
          }else{
            arrayProductos.add(producto);
            arrayCantidad.add(cantidad);
            
          }
          s.nextLine();
      }
      
    }while(!(producto.equals("fin")));
    System.out.println("¿Tiene algún código de descuento?");
    opcion=s.nextLine();
    
    switch(opcion){
      case "si":
        System.out.print("Introduzcalo: ");
        descuento=s.nextLine();
      break;
      case "no":
        System.out.println("Aquí tiene su ticket.");
      break;
      default:
    }
    
    System.out.println("---------------------------------");
    for(int i =0;i<arrayProductos.size();i++){
      String productoFactura=arrayProductos.get(i);
     
      unidad=lista.get(productoFactura);
      
      int cantidadFactura=arrayCantidad.get(i);
      
      subtotal=unidad*cantidadFactura;
      
      total+=subtotal;
      
      System.out.printf("%-10s %9.2f %6d %9.2f\n" , productoFactura , unidad , cantidadFactura , subtotal );
    }
    if((opcion.equals("si"))&&(descuento.equals("ECODTO"))){
      aDescontar=total/10;
      total=total-aDescontar;
      System.out.println("---------------------------------");
      System.out.println("Total: " + (total+aDescontar));
      System.out.println("Descontado: " + aDescontar);
    }
    
    System.out.println("---------------------------------");
    System.out.printf("Total: %.2f  €", total);
    System.out.println("");
    
  }
}
