/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author sergi
 */
public class Pizzeria {
    
    private  static int pedidasTotal;
    private static int servidasTotal;
    private String estado;
    private String tamaño;
    private String tipo;
    
    public Pizzeria(String tipo,String tamaño){
        this.tamaño=tamaño;
        this.tipo=tipo;
        this.estado="pedida";
        Pizzeria.pedidasTotal++;
    } 
    
    public static int getPedidasTotal(){
        return Pizzeria.pedidasTotal;
    }
    
    public static int getServidasTotal(){
        return Pizzeria.servidasTotal;
    }
    
    public String toString(){
        return "Pizzas " + this.tipo + " " + this.tamaño + " "+ this.estado;
    }
    
    public void sirvePizza(){
        if(this.estado.equals("pedida")){
            this.estado="servida";
            Pizzeria.servidasTotal++;
        }else{
            System.out.println("Esa pizza ya se ha servido . ");
        }
    }
    
}
