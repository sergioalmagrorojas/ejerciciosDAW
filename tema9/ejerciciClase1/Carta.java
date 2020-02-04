/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciClase1;

import static ejerciciClase1.programa.cartas;
import java.util.Random;

/**
 *
 * @author sergi
 */
public class Carta {
     private int numero;
     private int palo;
     
     public Carta(int numero , int palo){
         this.numero=numero;
         this.palo=palo;
     }
     public int obtenerNumero(){
         return numero;
     }
     public int obtenerPalo(){
         return palo;
     }
     public void setNumero(int numero){
         this.numero=numero;
     }
     public void setPalo(int palo){
         this.palo=palo;
     }
     public String mostrarCartas(){
         String nombrePalo="";
     
        switch(this.palo){
            case 1 :
                nombrePalo="Espadas";
            break;
            case 2 : 
                nombrePalo="Bastos";
            break;
            case 3 :
                nombrePalo="Oros";
            break;
            case 4 :
                nombrePalo="Copas";
            break;
     
        }
        return numero + " de " + nombrePalo;
    }
     
}


