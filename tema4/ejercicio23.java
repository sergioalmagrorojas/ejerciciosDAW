/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4_1;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class ejercicio23 {
    public static void main(String []   args){
        Scanner s =new Scanner(System.in);
        double precio;
        String tipoIva="";
        String promo="";
        double total=0;
        
        
        
       System.out.println("Introduzca el precio del producto: ");
       precio=Double.parseDouble(s.nextLine());
       System.out.println("Introduzca el tipo de iva (general , reducido o superreducido)");
       tipoIva=s.nextLine();
       System.out.println("Introduzca codigo promocional (nopro , mitad , menos5 o 5porc ");
       promo =s.nextLine();
       
       
       int ivaNumero=0;
       
       
       switch(tipoIva){
           case "general":
               ivaNumero=21;
           break;
           case "reducido":
               ivaNumero=10;
           break;
           case "superreducido":
               ivaNumero=4;
           break;
           default:
       }
       
       double descuentoDeIva=ivaNumero/100;
       
       double iva=precio*descuentoDeIva;
       
       double sinDescuento=precio+iva;
       
       double promoNumero=0;  
       
       switch(promo){
           case "nopro":
               
           break;
           case "mitad":
               promoNumero=sinDescuento/2;
           break;
           case "menos5":
               promoNumero=5;
           break;
           case "5porc":
               promoNumero=sinDescuento*0.05;
           break;
           default:
       }
       
        total=sinDescuento-promoNumero;
       
       
       System.out.printf("Precio :  %5.2f\n" , precio);
       System.out.printf("Iva : %5.2f\n" , iva);
       System.out.printf("Con iva : %5.2f\n", sinDescuento);
       System.out.println("Promoción: " + promo);
       System.out.printf("Total : %5.2f \n" , total);
    }
}
