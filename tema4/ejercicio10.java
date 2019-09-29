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
public class ejercicio10 {
    public static void main(String []   args){
        
        String resultado="";
        Scanner s =new Scanner (System.in);
        System.out.println("Introduzca el mes de nacimiento con un número entero(1-12) ");
        int mes=Integer.parseInt(s.nextLine());
        System.out.println("Ahora el día");
        int dia =Integer.parseInt(s.nextLine());
        
        
        switch (mes){
            case 1 :
                if(dia<20){
                    resultado="Capricornio";
                }else {
                    resultado="Acuario";
                }
            break;
            case 2 :
                if (dia<19){
                    resultado="Acuario";
                    
                }else {
                    resultado="piscis";
                }
            break;
            case 3 :
                if (dia<21){
                    resultado="Piscis";
                    
                }else{
                    resultado="Aries";
                }
            break;
            case 4 :
                if (dia<21){
                    resultado="Aries";
                    
                }else {
                    resultado="Tauro";
                }
            break;
            case 5 :
                if (dia<20){
                    resultado="Tauro";
                    
                }else {
                    resultado="Géminis";
                }
            break;
            case 6 :
                if (dia<21){
                    resultado="Géminis";
                }else{
                    resultado="Cáncer";
                }
            break;
            case 7 :
                if (dia<21){
                    resultado="Cáncer";
                }else{
                    resultado="Leo";
                }
            break;
            case 8 :
                if (dia<22){
                    resultado="Leo";
                    
                }else{
                    resultado="Virgo";
                }
            break;
            case 9:
                if (dia<23){
                    resultado="Virgo";
                }else {
                  resultado="Libra"; 
                }
            break;
            case 10 :
                if (dia<23){
                    resultado="Libra";
                }else {
                    resultado="Escorpio";
                }
            break;
            case 11:
                if (dia<23){
                    resultado="Escorpio";
                }else {
                    resultado="Sagitario";
                }
            break;
            case 12 :
                if (dia<21){
                    resultado="Sagitario";
                    
                }else {
                    resultado="Capricornio";
                }
            default:
        }
        System.out.println("Su signo del zodiaco es : " + resultado);
    }     
}
