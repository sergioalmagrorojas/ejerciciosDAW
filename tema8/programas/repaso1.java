/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

/**
 *
 * @author sergi
 */
import java.util.Scanner ;
public class repaso1 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int opcion=0;
        System.out.println("Este programa calcula el área de figuras geometricas: ");
        
        do{
            System.out.println("1.Círculo ");
            System.out.println("2.Triángulo ");
            System.out.println("3.Cuadrado ");
            System.out.println("4.Salir ");
            opcion=s.nextInt();
            
            
            switch(opcion){
                case 1 : 
                    System.out.println("Introduzca el radio del circulo : ");
                    int radio=s.nextInt();
                    System.out.println("El área del círculo es : " + circulo(radio));
                break;
                case 2 :
                    System.out.println("Introduzca la base del triángulo : ");
                    double base= s.nextDouble();
                    System.out.println("Introduzca la altura del triángulo: ");
                    double altura=s.nextDouble();
                    System.out.println("El área del triángulo es : " + triangulo(base,altura));
                break;
                case 3: 
                    System.out.println("Introduzca el lado del cuadrado: ");
                    double lado=s.nextDouble();
                    System.out.println("El área del cuadrado es : " + cuadrado(lado));
                break;
            }
        }while(opcion!=4);
    }
    
    public static double circulo( int radio){
        double area;
        area=(radio*radio)*(Math.PI);
        return area;
    }
    public static double triangulo (double base , double altura){
        double area ;
        area=(base*altura)/2;
        return area;
    }
    public static double cuadrado(double lado){
        double area;
        area=(lado*lado);
        return area;
    }
}
