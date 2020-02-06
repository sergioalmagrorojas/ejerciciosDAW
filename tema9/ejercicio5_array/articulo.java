/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_array;

/**
 *
 * @author sergi
 */
public class articulo {
    private String codigo="Libre";
    private String descripcion="";
    private int precioCompra;
    private int precioVenta;
    private int stock;
    
    
    
    
    public String obtenerCodigo(){
        return codigo;
    }
    
    public void ponerCodigo(String codigo){
        this.codigo=codigo;
    }
    
    public String obtenerDesc(){
        return descripcion;
    }
    public void ponerDesc(String descripcion){
        this.descripcion=descripcion;
    }
    public int obtenerPrecioCompra(){
        return precioCompra;
    }
    public void ponerPrecioCompra(int precioCompra){
        this.precioCompra=precioCompra;
    }
    
    public int obtenerPrecioVenta(){
        return precioVenta;
    }
    
    public void ponerPrecioVenta(int precioVenta){
        this.precioVenta=precioVenta;
    }
    public int obtenerStock(){
        return stock;
    }
    public void ponerStock(int stock){
        this.stock=stock;
    }
    
    public String toString(){
        String pintar="Artículos actuales : \n";
        
        pintar+="Codigo: " + this.codigo + "\n";
        pintar+="Descripción: " + this.descripcion +"\n";
        pintar+="Precio De Compra: " + this.precioCompra+"\n";
        pintar+="Precio De Venta: " + this.precioVenta+"\n";
        pintar+="Unidades disponibles: " + this.stock+"\n";
        
        return pintar +"\n";
    }
}
