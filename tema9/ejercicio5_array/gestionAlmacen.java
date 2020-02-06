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
import java.util.Scanner;
public class gestionAlmacen {
    static int maximo=15;
    public static void main(String[] args){
         Scanner s =new Scanner(System.in);
         
         int opcion;
         String codigoIntroducido="";
         int primeraLibre;
         String descripcion="";
         int precioCompra;
         int precioVenta;
          int stock;
          String codigo="";
          int stockIntroducido;
         
         articulo[] articulos=new articulo[maximo];
         
         for(int i =0;i<maximo;i++){
             articulos[i]=new articulo();
         }
         
         do{
             System.out.println("Gestión de almacenes");
             System.out.println("1.Listado .");
             System.out.println("2.Nuevo Artículo .");
             System.out.println("3.Eliminar Artículo .");
             System.out.println("4.Modificar Artículo .");
             System.out.println("5.Compra de Producto .");
             System.out.println("6.Venta de Producto .");
             System.out.println("7.Salir del Programa");
             
             opcion=s.nextInt();
             
             switch(opcion){
                 case 1 :
                     System.out.println("");
                     System.out.println("Lista de Artículos ");
                    
                     for(int i =0;i<maximo;i++){
                         if(!(articulos[i].obtenerCodigo().equals("Libre"))){
                             System.out.println(articulos[i]);
                         }
                         
                     }
                     
                 break;
                     
                     
                 case 2:
                     System.out.println("Nuevo Artículo : ");
                    
                     primeraLibre=0;
                    codigo=articulos[primeraLibre].obtenerCodigo();
                     while ((primeraLibre < maximo) && (!(codigo.equals("Libre")))) {
                         primeraLibre++;
                         if (primeraLibre < maximo) {
                             codigo = articulos[primeraLibre].obtenerCodigo();
                         }
                     }
                     if(primeraLibre==maximo){
                         System.out.println("No se pueden dar de alta más artículos");
                     }else{
                         System.out.print("Código:");
                         
                         boolean codigoRepe=true;
                         while(!codigoRepe){
                             codigoRepe=false;
                             codigoIntroducido=s.nextLine();
                             s.nextLine();
                             for(int i =0;i<maximo;i++){
                                 if(codigoIntroducido.equals(articulos[i].obtenerCodigo())){
                                     codigoRepe=true;
                                 }
                             }
                             if(codigoRepe){
                                 System.out.println("El producto no se puede dar de alta , introduce otro código");
                                 
                             }
                         }
                         s.nextLine();
                         articulos[primeraLibre].ponerCodigo(codigoIntroducido);
                         s.nextLine();
                         System.out.print("Descripción: ");
                         descripcion=s.nextLine();
                         articulos[primeraLibre].ponerDesc(descripcion);
                         
                         
                         System.out.print("Precio Compra: ");
                          precioCompra=s.nextInt();
                         articulos[primeraLibre].ponerPrecioCompra(precioCompra);
                         
                         
                         System.out.print("Precio Venta: ");
                         precioVenta=s.nextInt();
                         articulos[primeraLibre].ponerPrecioVenta(precioVenta);
                        
                         
                         System.out.print("Cantidad del producto : ");
                         stock=s.nextInt();
                         articulos[primeraLibre].ponerStock(stock);
                         
                         
                         
                     }
                     System.out.println("");
                 break;
                     
                 case 3:
                     System.out.println("Eliminar Artículo");
                     System.out.println("-----------------");
                     
                     System.out.print("Articulo que quiere eliminar :");
                     codigoIntroducido=s.nextLine();
                     s.nextLine();
                     int i =-1;
                     codigo="";
                     do{
                         i++;
                         if(i<maximo){
                             codigo=articulos[i].obtenerCodigo();
                         }
                     }while(!(codigo.equals(codigoIntroducido))&&(i<maximo));
                     
                     if(i==maximo){
                         System.out.println("El artículo que quiere eliminar no existe.");
                     }else{
                         articulos[i].ponerCodigo("Libre");
                         System.out.println("Artículo borrado correctamente.");
                     }
                     System.out.println("");
                 break;
                 case 4:
                     System.out.println("Modificación . ");
                     System.out.println("---------------");
                     
                      System.out.print("Articulo que quiere modificar :");
                     codigoIntroducido=s.nextLine();
                     s.nextLine();
                     i=-1;
                     
                     do{
                         i++;
                     }while(!((articulos[i].obtenerCodigo().equals(codigoIntroducido))));
                     
                     System.out.println("Código " + articulos[i].obtenerCodigo());
                     System.out.print("Nuevo: ");
                     codigoIntroducido=s.nextLine();
                     articulos[i].ponerCodigo(codigoIntroducido);
                     
                     
                     System.out.println("Descripcion " + articulos[i].obtenerDesc());
                     System.out.print("Nueva: ");
                     descripcion=s.nextLine();
                     articulos[i].ponerDesc(descripcion);
                     
                    
                     System.out.println("Precio de compra: " + articulos[i].obtenerPrecioCompra());
                     System.out.print("Nuevo: ");
                     precioCompra=s.nextInt();
                     articulos[i].ponerPrecioCompra(precioCompra);
                     
                     
                     System.out.println("Precio de venta: " + articulos[i].obtenerPrecioVenta());
                     System.out.print("Nuevo: ");
                     precioVenta=s.nextInt();
                     articulos[i].ponerPrecioVenta(precioVenta);
                     
                     
                     System.out.println("Stock: " + articulos[i].obtenerStock());
                     System.out.print("Nuevo: ");
                     stock=s.nextInt();
                     articulos[i].ponerStock(stock);
                     if(i==maximo){
                         System.out.println("El artículo que quiere modificar no existe.");
                     }else{
                         articulos[i].ponerCodigo("Libre");
                         System.out.println("Artículo modificado correctamente.");
                     }
                     System.out.println("");
                break;
                     
                 case 5:
                     System.out.println("Entrada de mercacia.");
                     System.out.println("--------------------");
                     
                     System.out.print("Codigo del articulo: ");
                     codigoIntroducido=s.nextLine();
                     s.nextLine();
                     i=-1;
                     
                     do{
                         i++;
                         if(i<maximo){
                             codigo=articulos[i].obtenerCodigo();
                         }
                     }while((!(codigo.equals(codigoIntroducido))&&(i<maximo)));
                     if(i==maximo){
                         System.out.println("El articulo no existe.");
                     }else{
                         System.out.print("Cantidad del articulo: ");
                         stockIntroducido=s.nextInt();
                         articulos[i].ponerStock((stockIntroducido)+ articulos[i].obtenerStock());
                         System.out.println("La mercancia ha entrado al almacen .");
                     }
                     System.out.println("");
                  break;
                 case 6:
                     System.out.println("Salida de mercacia.");
                     System.out.println("-------------------");
                     System.out.print("Código del artículo: ");
                     codigoIntroducido=s.nextLine();
                     s.nextLine();
                     i=-1;
                     
                     do{
                         i++;
                         if(i<maximo){
                             codigo=articulos[i].obtenerCodigo();
                         }
                     }while((!(codigo.equals(codigoIntroducido))&&(i<maximo)));
                     if(i==maximo){
                         System.out.println("El articulo no existe.");
                     }else{
                         
                         System.out.print("Cantidad del articulo: ");
                         stockIntroducido=s.nextInt();
                         if(articulos[i].obtenerStock()-stockIntroducido>0){
                            articulos[i].ponerStock((stockIntroducido)- articulos[i].obtenerStock());
                            System.out.println("La mercancia ha salido del almacen .");
                         }else{
                             System.out.println("No hay suficiente mercancia.");
                         }
                     }
                     System.out.println("");
                 break;
             }
             
         }while (opcion!=7);
        
        
    }
}
