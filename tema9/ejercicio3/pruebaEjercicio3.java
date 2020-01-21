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
public class pruebaEjercicio3 {
    public static void main(String[] args){
        
    
        perro rastreator=new perro(Sexo.Macho);
        rastreator.tumbate();
        
        pinguino pepe=new pinguino(Sexo.Macho);
        pepe.caza();
        
        canario juanita=new canario(Sexo.Hembra);
        juanita.pia();
        
        ave francisco=new ave (Sexo.Macho);
        francisco.ponHuevo();
        
        lagarto maria=new lagarto(Sexo.Hembra);
        maria.trepa();
        
        mamifero gata=new mamifero(Sexo.Hembra);
        gata.cria();
    }
}
