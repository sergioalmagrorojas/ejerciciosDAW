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
public class mamifero extends animal{
    
    public mamifero() {
        super();
    }
    public mamifero(Sexo s ){
        this.sexo=s;
    }
    
    public void cria(){
        if(this.obtenerSexo()==Sexo.Macho){
            System.out.println("No puedo tener crías");
        }else{
            System.out.println("Haciendo cria...");
        }
    }
    public void come(){
        System.out.println("Estoy comiendo...");
    }
    public void recogerComida(){
        System.out.println("Voy a por comida , ahora vuelvo...");
    }
}
