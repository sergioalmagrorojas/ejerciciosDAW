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
public class coche extends vehiculos{
    public int cv;
    
    public coche(int x){
        this.cv=x;
    }
    public void quema(){
        System.out.println("Estoy quemando ruedas...");
    }
}
