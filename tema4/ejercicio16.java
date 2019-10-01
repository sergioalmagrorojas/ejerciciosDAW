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
public class ejercicio16 {
    public static void main(String []   args){
        Scanner s =new Scanner(System.in);
        int correcto=0;
        String opcion;
        
        System.out.println(" Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente. ");
        System.out.println("V/F");
        opcion=s.nextLine();
        if(opcion.equals("V")){
            correcto+=3;
        }
        System.out.println(" Haaumentado sus gastos de vestuario");
        System.out.println("V/F");
        opcion=s.nextLine();
        if(opcion.equals("V")){
            correcto+=3;
        }
         System.out.println(" Ha perdido el interés que mostraba anteriormente por ti ");
        System.out.println("V/F");
        opcion=s.nextLine();
        if(opcion.equals("V")){
            correcto+=3;
        }
        System.out.println(" Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla \n"
                + "el pelo y se asea con más frecuencia(si esmujer");
        System.out.println("V/F");
        opcion=s.nextLine();
        if(opcion.equals("V")){
            correcto+=3;
        }
         System.out.println("No te deja que mires la agenda de su teléfono móvil");
        System.out.println("V/F");
        opcion=s.nextLine();
        if(opcion.equals("V")){
            correcto+=3;
        }
         System.out.println(" A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
        System.out.println("V/F");
        opcion=s.nextLine();
        if(opcion.equals("V")){
            correcto+=3;
        }
          System.out.println(" Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        System.out.println("V/F");
        opcion=s.nextLine();
        if(opcion.equals("V")){
            correcto+=3;
        }
        System.out.println(" Muchos días viene tarde después de trabajar ");
        System.out.println("V/F");
        opcion=s.nextLine();
        if(opcion.equals("V")){
            correcto+=3;
        }
        System.out.println("Has notado que últimamente se perfuma más ");
        System.out.println("V/F");
        opcion=s.nextLine();
        if(opcion.equals("V")){
            correcto+=3;
        }
        System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
        System.out.println("V/F");
        opcion=s.nextLine();
        if(opcion.equals("V")){
            correcto+=3;
        }
        
        
        if(correcto<=10){
            System.out.println("Enhorabuena no peligra tu relación!");
        }
        if((correcto>10)&&(correcto<=22)){
            System.out.println("Quizás exista el peligro de otra persona ");
        }
        if((correcto>22)&&(correcto<=30)){
            System.out.println("Su relación esta a punto de romperse!!!");
        }
    }
}
