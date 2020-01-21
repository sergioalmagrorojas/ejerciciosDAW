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
public class perro extends mamifero{
    
    public perro(Sexo s ){
        this.sexo=s;
    }
    
    public void bebeAgua(){
        System.out.println("Tengo sed , voy a beber agua.");
    }
    public void ladra(){
        System.out.println("guauguau.");
    }
    public void tumbate(){
        System.out.println("No tengo ganas.");
    }
    
}
