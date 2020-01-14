/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9;
import java.util.Scanner;
import tema9.clases2.vehiculos;
import tema9.clases2.bicicleta;
import tema9.clases2.coche;
/**
 *
 * @author sergi
 */
public class ejercicio2 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int opcion=0;
        int kilometros;
        bicicleta bmx=new bicicleta("roja");
        coche citroenC3= new coche(64);
        
        do {
            System.out.println("VEHICULOS");
            System.out.println("----------------");
            System.out.println("1. Anda con la bicicleta ");
            System.out.println("2. Haz el caballito con la bicicleta ");
            System.out.println("3. Anda con el coche ");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta  ");
            System.out.println("6. Ver kilometraje del coche  ");
            System.out.println("7. Ver kilometraje total  ");
            System.out.println("8. Salir  ");
            System.out.println("Elige una opción (1-8):");
            opcion=s.nextInt();
            
            switch(opcion){
                case 1 :
                    System.out.println("Cantidad de kilometros : ");
                    kilometros=s.nextInt();
                    bmx.andar(kilometros);
                break;
                case 2 :
                    bmx.caballito();
                break;
                case 3 :
                    System.out.println("Cantidad de kilometros: ");
                    kilometros=s.nextInt();
                    citroenC3.andar(kilometros);
                break;
                case 4 :
                    citroenC3.quema();
                break;
                case 5 :
                    System.out.println("Kilometros recorridos de la bicicleta: "  + bmx.obtenerKilometros());
                break;
                case 6:
                    System.out.println("Kilometros recorridos del coche: "  + citroenC3.obtenerKilometros());
                break;
                case 7 :
                    System.out.println("Kilometros totales (sumando los dos vehiculos) : " + vehiculos.obtenerKilometrosTotales());
                break;
                
            }
        } while (opcion != 8);
    }
}
