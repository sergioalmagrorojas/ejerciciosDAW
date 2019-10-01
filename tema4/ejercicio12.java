/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4_1;

/**
 *
 * @author sergi
 */
import java.util.Scanner;
public class ejercicio12 {
    public static void main(String []   args){
        Scanner s =new Scanner(System.in);
        int contador=0;
        String introducido;
        
        System.out.println("Para que sirve VirtualBox? ");
        System.out.println("a)Virtualizar un SSOO b)Un servidor de base de datos c)Ninguna es correcta");
        introducido=s.nextLine();
        if (introducido.equals("a")){
            contador++;
        }
        System.out.println("Que es java?");
        System.out.println("a)Un lenguaje de progrmacion b)Un SGBDD c)Ninguna es correcta");
        introducido=s.nextLine();
        if (introducido.equals("a")){
            contador++;
        }
        System.out.println("Que lenguajes se manejan en lenguajes de marca?");
        System.out.println("a)CSS b)CSS y html c)Ninguna es correcta");
        introducido=s.nextLine();
        if (introducido.equals("b")){
            contador++;
        }
        if (contador==0){
            System.out.println("No has acertado ninguna respuesta");
        }
        if (contador==1){
            System.out.println("Has acertado 1");
        }
        if (contador==2){
            System.out.println("Has acertado 2");
        }
        if (contador==3){
            System.out.println("Las has acertado todas");
        }
    }
}
