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
public class ejercicio24 {
    public static void main(String []   args){
        Scanner s =new Scanner(System.in);
        int opcion;
        int dias=0;
        int casado=0;
        int sueldo=0;
        int irpf=0;
        
        System.out.println("Introduzca s cargo (1.Jefe de proyecto,2.Prog senior , 3.Programador junior");
        opcion=Integer.parseInt(s.nextLine());
        System.out.println("Indique los días que ha estado de viaje");
        dias=Integer.parseInt(s.nextLine());
        System.out.println("Indique su estado civil (1.soltero , 2.casado)");
        casado=Integer.parseInt(s.nextLine());
        
        switch(opcion){
            case 1 :
                sueldo=1600;
            break;
            case 2 :
                sueldo=1200;
            break;
            case 3 :
                sueldo=950;
            break;
            default:
        }
        
        int dietas=dias*30;
        int sueldoTotal=sueldo+dietas;
        
        
        if (casado==1){
            irpf=25;
            
        } else if(casado==2){
                irpf=20;
        }
        
        double retencion=(sueldoTotal*irpf)/100;
        
        System.out.println("El sueldo base es "+ sueldo);
        System.out.println("El dinero en dietas es " + dietas);
        System.out.println("---------------------------");
        System.out.println("El sueldo bruto es " + sueldoTotal);
        System.out.println("La retención es " + retencion );
        System.out.println("---------------------------");
        System.out.println("El sueldo a recibir se queda en " + (sueldoTotal-retencion));
    
    }
}
