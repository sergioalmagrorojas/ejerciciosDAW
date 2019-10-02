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
public class ticket {
    public static void main(String []   args){
        Scanner s =new Scanner(System.in);
        
        String nombre1="";
        double precio1;
        double iva1;
        int cantidad1;
        
        
        
        System.out.println("Introduzca el nombre del 1º producto");
        nombre1=s.nextLine();
        System.out.println("Introduzca el IVA del 1º producto");
        iva1=Double.parseDouble(s.nextLine());//El Iva se recoge en todos los productos como un entero que luego se divide entre 100.
        System.out.println("Introduzca el precio del 1º producto");
        precio1=Double.parseDouble(s.nextLine());
        System.out.println("Introduzca la cantidad deseada");
        cantidad1=Integer.parseInt(s.nextLine());
        
        double ivaProducto1=(iva1/100)*precio1;
        double precioTotal1=(precio1*cantidad1)+ivaProducto1;
        double sinIva1=precio1*cantidad1;
        
        
        String nombre2="";
        double precio2;
        double iva2;
        int cantidad2;
        
        
        System.out.println("Introduzca el nombre del 2º producto");
        nombre2=s.nextLine();
        System.out.println("Introduzca el IVA del 2º producto");
        iva2=Double.parseDouble(s.nextLine());
        System.out.println("Introduzca el precio del 2º producto");
        precio2=Double.parseDouble(s.nextLine());
        System.out.println("Introduzca la cantidad deseada");
        cantidad2=Integer.parseInt(s.nextLine());
        
        double ivaProducto2=(iva2/100)*precio2;
        double precioTotal2=(precio2*cantidad2)+ivaProducto2;
        double sinIva2=precio2*cantidad2;
        
        
        String nombre3="";
        double precio3;
        double iva3;
        int cantidad3;
        
        
        System.out.println("Introduzca el nombre del 3º producto");
        nombre3=s.nextLine();
        System.out.println("Introduzca el IVA del 3º producto");
        iva3=Double.parseDouble(s.nextLine());
        System.out.println("Introduzca el precio del 3º producto");
        precio3=Double.parseDouble(s.nextLine());
        System.out.println("Introduzca la cantidad deseada");
        cantidad3=Integer.parseInt(s.nextLine());
        
        double ivaProducto3=(iva3/100)*precio3;
        double precioTotal3=(precio3*cantidad3)+ivaProducto3;
        double sinIva3=cantidad3*precio3;
        
        
        String nombre4="";
        double precio4;
        double iva4;
        int cantidad4;
        
        
        System.out.println("Introduzca el nombre del 4º producto");
        nombre4=s.nextLine();
        System.out.println("Introduzca el IVA del 4º producto");
        iva4=Double.parseDouble(s.nextLine());
        System.out.println("Introduzca el precio del 4º producto");
        precio4=Double.parseDouble(s.nextLine());
        System.out.println("Introduzca la cantidad deseada");
        cantidad4=Integer.parseInt(s.nextLine());
        
        double ivaProducto4=(iva4/100)*precio4;
        double precioTotal4=(precio4*cantidad4)+ivaProducto4;
        double sinIva4=precio4*cantidad4;
        
        
        
        double sinIva=sinIva1+sinIva2+sinIva3+sinIva4;
        double ivaTotal=ivaProducto1+ivaProducto2+ivaProducto3+ivaProducto4;
        double subtotal=precioTotal1+precioTotal2+precioTotal3+precioTotal4;
        
        
        
        
        System.out.println("Nombre     Precio   Cantidad    IVA     Total ");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-10s %4.2f %7d %10.2f %10.2f\n" , nombre1 , precio1 , cantidad1 ,ivaProducto1 , precioTotal1);
        System.out.printf("%-10s %4.2f %7d %10.2f %10.2f\n" , nombre2 , precio2 , cantidad2 ,ivaProducto2 , precioTotal2);
        System.out.printf("%-10s %4.2f %7d %10.2f %10.2f\n" , nombre3 , precio3 , cantidad3 ,ivaProducto3 , precioTotal3);
        System.out.printf("%-10s %4.2f %7d %10.2f %10.2f\n" , nombre4 , precio4 , cantidad4 ,ivaProducto4 , precioTotal4);
        System.out.println("__________________________________________________");
        System.out.printf("Totales : %24.2f %10.2f\n", ivaTotal , sinIva);
        System.out.printf("Subtotal :%35.2f\n" , subtotal);
    }
}
