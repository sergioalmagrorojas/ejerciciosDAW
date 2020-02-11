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
public class Terminal {
    private String numero;
    private int tiempo;
    
    
    Terminal(String numero){
        this.numero=numero;
        this.tiempo=0;
    }
    
    public  String getNumero(){
        return numero;
    }
    public void setTiempo(int tiempo){
        this.tiempo=tiempo;
    }
    public void setNumero(String numero){
        this.numero=numero;
    }
    
    public int getTiempo(){
        return tiempo;
    }
    
    public String toString(){
        return "Número " + numero + " ||| " + this.tiempo + " segundos de llamada";
    }
    
    public void llamada(Terminal x , int tiempoLlamada){
        this.tiempo+=tiempoLlamada;
        x.tiempo+=tiempoLlamada;
    }
    
}
