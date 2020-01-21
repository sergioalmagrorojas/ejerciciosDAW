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
public class ave extends animal {
    public ave() {
        super();
    }
    public ave(Sexo s ){
        this.sexo=s;
    }
    
    public void volar(){
        System.out.println("Mira como vuelo..");
    }
    
    public void ponHuevo(){
        if(this.obtenerSexo()==sexo.Hembra){
            System.out.println("Huevo puesto");
        }else {
            System.out.println("No puedo poner huevos .");
        }
    }
    
    public void recogeComida(){
        System.out.println("Ahora vengo , tengo que recoger comida .");
    }
}
