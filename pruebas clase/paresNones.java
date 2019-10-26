/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6_1;
import java.util.Scanner;
/**
 *
 * @author sergi
 */
public class paresNones {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        int opcion=(int)(Math.random()*2+1);
        
        switch(opcion){
            case 1 :
                System.out.println("Yo juego con pares , a ti te toca nones");
            break;
            case 2 :
                System.out.println("Yo juego con nones ,  a ti te toca pares");
            break;
            default:
        }
        
        int numeroMaquina=(int)(Math.random()*11);
        
        System.out.println("Elige un número (del 0 al 10)");
        int numeroUsuario=Integer.parseInt(s.nextLine());
        
        int suma=numeroMaquina+numeroUsuario;
        
        if ((suma%2==0)&&(opcion==1)){
            System.out.println("He ganado!!");
            System.out.println("He jugado con el " +numeroMaquina + " y la suma total es " + suma);
        }
        if((suma%2!=0)&&(opcion==1)){
            System.out.println("Has ganado :(");
            System.out.println("He jugado con el " +numeroMaquina + " y la suma total es " + suma);
        }
       
        if ((suma%2!=0)&&(opcion==2)){
            System.out.println("He ganado!!");
            System.out.println("He jugado con el " +numeroMaquina + " y la suma total es " + suma);
        }
        if((suma%2==0)&&(opcion==2)){
            System.out.println("Has ganado :(");
            System.out.println("He jugado con el " +numeroMaquina + " y la suma total es " + suma);
        }
    }
}
