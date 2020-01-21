/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_array;

/**
 *
 * @author sergi
 */
public class Disco {
    private int duracion;
    private String autor;
    private String titulo;
    private String codigo="Libre";
    private String genero;
    
    
    public String obtenerTitulo(){
        return titulo;
    }
    
    public void ponerTitulo(String titulo){
        this.titulo=titulo;
    }
    
    public int obtenerDuracion(){
        return duracion;
    }
    
    public void ponerDuracion(int duracion){
        this.duracion=duracion;
    }
    
    public String obtenerAutor(){
        return autor;
    }
    
    public void ponerAutor(String autor){
        this.autor=autor;
    }
    
    public String obtenerCodigo(){
        return codigo;
    }
    
    public void ponerCodigo(String codigo){
        this.codigo=codigo;
    }
    
    public String obtenerGenero(){
        return genero;
    }
    
    public void ponerGenero( String genero){
        this.genero=genero;
    }
    
    public String toString(){
        
        String pintar="Discos actuales:    \n";
        pintar+="Duración : " + this.duracion + "\n";
        pintar+="Autor : " + this.autor + "\n";
        pintar+="Título: " + this.titulo + "\n";
        pintar+="Código : " + this.codigo + "\n";
        pintar+="Género : "+ this.genero + "\n";
        
        return pintar + "\n";
        
    }
}
