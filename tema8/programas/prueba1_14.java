/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;
import funciones.matematicas;
import java.util.Scanner;
/**
 *
 * @author sergi
 */
public class prueba1_14 {

    public static void main(String[] args) {
        int n;
        Scanner s =new Scanner(System.in);
        //esprimo
        System.out.print("Introduzca un número entero positivo: ");
        n = s.nextInt();
        if (funciones.matematicas.esPrimo(n)) {
            System.out.println("El " + n + " es primo.");
        } else {
            System.out.println("El " + n + " no es primo.");
        }

        //capicua
        if(funciones.matematicas.capicua(n)){
            System.out.println("El número " +n +"  es capicua");
        }else{
            System.out.println("El número " + n + " no es capicua");
        }
        //siguiente primo
        System.out.println("El siguiente primo mayor que " + n + " es : " + funciones.matematicas.siguientePrimo(n));
        
        
        
        //potencia
        int base;
        int exponente;
        System.out.println("Introdce base : ");
        base=s.nextInt();
        System.out.println("Introduce exponente : ");
        exponente=s.nextInt();
        
        System.out.println(base + "^" + exponente + " = " +funciones.matematicas.potencia(base, exponente));
       
        //digitos
        System.out.println("El número " + n + " tiene " + funciones.matematicas.digitos(n) + " digitos");
        
        //voltea
        System.out.println("El número " + n + " volteado es : " + funciones.matematicas.volteado(n));
        
        //digito elegido
        System.out.println("Introduzca un numero");
        int numeroDigito=s.nextInt();
        System.out.println("Introduzca la posición : ");
        int posicion=s.nextInt();
        System.out.println("En la posicion introducida se encuentra el digito " + funciones.matematicas.digitoN(numeroDigito, posicion));
        //busca digitos
        System.out.println("Introduzca un número");
        int x=s.nextInt();
         System.out.println("Introduzca un digito");
        int f=s.nextInt();
        System.out.println("En el " + x + " el dígito " + f + " se encuentra en la posición " + matematicas.buscaDigitos(x, f));
        //quita numeros
        System.out.println("Introduzca un número");
        int quita=s.nextInt();
         System.out.println("Introduzca cuantos quiere quitar");
        int cantidad=s.nextInt();
        
        System.out.println("El numero " + quita + " con los digitos quitados " + matematicas.quitaNumeros(quita, cantidad));
        //añade numero derecha
        System.out.println("Introduzca un numero:");
        int añade=s.nextInt();
         System.out.println("Introduzca el numero a pegar");
        int añaded=s.nextInt();
        
        System.out.println("El numero que queda es este : " + matematicas.añadeNumero(añade, añaded));
    }
}