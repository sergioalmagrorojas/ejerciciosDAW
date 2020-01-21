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
public class canario extends ave {
    public canario(Sexo s ){
        this.sexo=s;
    }
    
    public void pia(){
        System.out.println("piopiopio");
    }
    
    public void canta(){
        System.out.println("No tengo ganas necesito agua");
    }
    
    public void bebe(){
        System.out.println("Mucho mejor :).");
    }
    
}
