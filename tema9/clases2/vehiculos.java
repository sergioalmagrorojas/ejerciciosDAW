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
public abstract class vehiculos {
    //atributos de vehiculo
    public static int  kilometros=0;
    public static int vehiculosCreados=0;
    
    //instancia
    public int kilometrosRecorridos;
    
    public vehiculos(){
        this.kilometrosRecorridos=0;
    }
    //obtiene los kilometros recorridos del coche o bicicleta
    public int obtenerKilometros(){
        return this.kilometrosRecorridos;
    }
    
    //obtiene los kilometros totales
    public static int obtenerKilometrosTotales(){
        return vehiculos.kilometros;
    }
    //operacion de andar 
    public void andar(int x){
        this.kilometrosRecorridos+=x;
        vehiculos.kilometros+=x;
    }
}
