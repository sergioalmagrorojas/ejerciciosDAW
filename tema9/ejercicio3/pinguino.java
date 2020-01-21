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
public class pinguino extends ave  {
    
    public pinguino(Sexo s ) {
        this.sexo=s;
    }
    
    public void nada(){
        System.out.println("Voy a darme un chapuzón..");
    }
    public void caza(){
        System.out.println("Tengo hambre , voy a picar algo.");
    }
    public void baila(){
        System.out.println("No se bailar...");
    }
}
