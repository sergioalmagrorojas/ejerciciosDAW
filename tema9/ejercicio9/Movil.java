/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author sergi
 */
public class Movil extends Terminal {
    private String tarifa;
    private double coste;
    
    public Movil(String numero , String tarifa){
        super(numero);
        this.tarifa=tarifa;
        this.coste=0;
    }
    @Override 
    public void llamada(Terminal x , int tiempoLlamada){
        super.llamada(x,tiempoLlamada);
        double minutosTotales=(double)(tiempoLlamada/60);
        
        switch(this.tarifa){
            case "rata":
                this.coste+=minutosTotales*0.06;
            break;
            case "mono":
                this.coste+=minutosTotales*0.12;
            break;
            case "bisonte":
                this.coste+=minutosTotales*0.30;
            break;
            default:
        }
    }
    @Override 
    public String toString(){
        return "Número " + this.getNumero() + " ||| " + this.getTiempo() + " segundos de llamada"
                + " ||| " + " coste total : " + this.coste + " euros";
    }
}
