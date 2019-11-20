/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5_1;
import java.util.Scanner;
/**
 *
 * @author sergi
 */
public class ejercicio30 {
     public static void main(String[] args) {
         Scanner s =new Scanner(System.in);
         
         boolean correcto=true;
         int dia1=0 , dia2=0;
         int hora1 , hora2;
         String introducido1, introducido2;
         String dia1Nombre=" " , dia2Nombre=" ";
         
         do{
             

             System.out.print("Introduzca el primer día(con el nombre) : ");
             introducido1=s.nextLine();
             System.out.print("Introduzca la hora: ");
             hora1=s.nextInt();
             
             switch(introducido1){
                 case "lunes":
                     dia1=1;
                     dia1Nombre="lunes";
                             
                 break;
                 case "martes":
                     dia1=2;
                     dia1Nombre="martes";
                             
                 break;   
                 case "miercoles":
                     dia1=3;
                     dia1Nombre="miercoles";
                             
                 break;
                 case "jueves":
                     dia1=4;
                     dia1Nombre="jueves";
                            
                 break;
                 case "viernes":
                     dia1=5;
                     dia1Nombre="viernes";
                            
                 break;
                 case "sabado":
                     dia1=6;
                     dia1Nombre="sabado";
                             
                 break;
                 case "domingo":
                     dia1=7;
                     dia1Nombre="domingo";
                            
                 break;
                 default: 
             }
             
             System.out.print("Introduzca el segundo día(con el nombre) : ");
             introducido2=s.nextLine();
             
             System.out.print("Introduzca la hora(segundo dia): ");
             hora2=s.nextInt();
             
             switch(introducido2){
                 case "lunes":
                     dia2=1;
                     dia2Nombre="lunes";
                             
                 break;
                 case "martes":
                     dia2=2;
                     dia2Nombre="martes";
                             
                 break;   
                 case "miercoles":
                     dia2=3;
                     dia2Nombre="miercoles";
                            
                 break;
                 case "jueves":
                     dia2=4;
                     dia2Nombre="jueves";
                             
                 break;
                 case "viernes":
                     dia2=5;
                     dia2Nombre="viernes";
                             
                 break;
                 case "sabado":
                     dia2=6;
                     dia2Nombre="sabado";
                             
                 break;
                 case "domingo":
                     dia2=7;
                     dia2Nombre="domingo";
                             
                 break;
                 default: 
             }
             
             if (dia1==0||dia2==0){
                 System.out.println("No existe le día 0 por favor introduzca datos correctos");
                 correcto=false;
             }
             if((hora1<0)||(hora1>23)||(hora2<0)||(hora2>23)){
                 System.out.println("Ha introducido horas incorrectas . Vuelva a intentarlo (0-23)");
                 correcto=false;
             }
             if(dia2<dia1){
                 System.out.println("El segundo día tiene que ser posterior al primero");
                 correcto=false;
             }
         }while(!correcto);
         
         System.out.println("Entre las " + hora1 + " del " + dia1Nombre + " y las " + hora2 + " del " + dia2Nombre);
         System.out.println("Hay " + (((dia2*24 )+ hora2) - ((dia1*24))+hora1) );
     }
}
