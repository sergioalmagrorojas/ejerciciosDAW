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
public  class animal {
    
    public Sexo sexo;
    
    public animal(){
        this.sexo=Sexo.Macho;
    }
    
    public animal(Sexo s ){
        this.sexo=s;
    }
    
    public Sexo obtenerSexo(){
        return this.sexo;
    }
    
    public void anda(){
        System.out.println("Estoy andando...");
    }
    
    public void come(){
        System.out.println("Estoy comiendo...");
    }
    
}
