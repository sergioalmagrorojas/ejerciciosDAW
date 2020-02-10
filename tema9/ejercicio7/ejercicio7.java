/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author sergi
 */
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args){
       Scanner s =new Scanner (System.in); 
        
       Zona principal=new Zona(1000);
       Zona compraventa=new Zona(200);
       Zona vip=new Zona(25);
       
       int opcion=0;
       int n =0;
       int compra=0;
       do{
           System.out.println("Exposicion de coches . ");
           System.out.println("1.Entradas Libres . ");
           System.out.println("2.Comprar entradas. ");
           System.out.println("3.Salir.");
           
           opcion=s.nextInt();
           
           switch(opcion){
               case 1:
                   System.out.println("Zona principal : " + principal.getEntradasPorVender());
                   System.out.println("Zona Compra-Venta : " + compraventa.getEntradasPorVender());
                   System.out.println("Zona Vip : " + vip.getEntradasPorVender());
                   System.out.println("");
               break;
               case 2 :
                   System.out.println("1. Zona  Principal");
                   System.out.println("2.Zona  Compra-venta");
                   System.out.println("3. Zona Vip");
                   System.out.print("¿Dónde las quiere comprar? : ");
                   compra=s.nextInt();
                   System.out.println("¿Cuántas entradas quiere?:");
                   n=s.nextInt();
                   
                   switch(compra){
                       case 1:
                           principal.vender(n);
                       break;
                       case 2:
                           compraventa.vender(n);
                       break;
                       case 3:
                           vip.vender(n);
                       break;
                       }
                   
           }
           
           
       }while(opcion!=3);
        
    }
}
