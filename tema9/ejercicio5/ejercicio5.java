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
public class ejercicio5 {
    public static void main(String[] args){
        Pizzeria pizza1=new Pizzeria("Carbonara" , "Familiar");
        Pizzeria pizza2=new Pizzeria("Prosciutto" , "Pequeña");
        Pizzeria pizza3=new Pizzeria("Margarita" , "Mediana");
        
        pizza1.sirvePizza();
        pizza3.sirvePizza();
        
        System.out.println(pizza1);
        System.out.println(pizza3);
        System.out.println(pizza2);
        
        pizza1.sirvePizza();
        
        System.out.println("Pedidas " + Pizzeria.getPedidasTotal());
        System.out.println("Servidas " +Pizzeria.getServidasTotal());
        
    }
}
