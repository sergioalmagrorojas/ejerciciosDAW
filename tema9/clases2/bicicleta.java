/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.clases2;

/**
 *
 * @author sergi
 */
public class bicicleta extends vehiculos {
    
    public String color; 
    
    public bicicleta(String x){
        this.color=x;
    }
    
    public void caballito(){
        System.out.println("Haciendo el caballito...");
    }
}
