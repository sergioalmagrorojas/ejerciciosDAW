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
public class ejercicio17 {
  public static void main(String[] args) {
    Carrito miCarrito = new Carrito();
    miCarrito.agrega(new Elemento("Fifa 20", 60.95, 20));
    miCarrito.agrega(new Elemento("Playstation 4 ", 449, 10));
    System.out.println(miCarrito);
    System.out.print("Hay " + miCarrito.numeroProductos());
    System.out.println(" productos en la cesta.");
    System.out.println("El total asciende a " + String.format("%.2f", miCarrito.total()));
    System.out.println("==============================");
    miCarrito.agrega(new Elemento("Samsung note 10 +", 1200, 120));
    miCarrito.agrega(new Elemento("Acer Aspire", 550, 200));
    System.out.println(miCarrito);
    System.out.print("Ahora hay " + miCarrito.numeroProductos());
    System.out.println(" productos en la cesta.");
    System.out.println("El total asciende a " + String.format("%.2f", miCarrito.total()));
  }
}
