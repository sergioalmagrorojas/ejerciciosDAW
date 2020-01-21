/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author sergi
 */
public class lagarto extends animal {
    public lagarto(Sexo s ){
        this.sexo=s;
    }
    
    public void tomaSol(){
        System.out.println("Hace demasiada calor");
    }
    
    public void trepa(){
        System.out.println("Me voy .");
    }
    
    public void come(){
        System.out.println("Voy a cazar insectos.");
    }
    
}
