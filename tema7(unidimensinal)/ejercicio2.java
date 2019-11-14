/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7_1;

/**
 *
 * @author sergi
 */
public class ejercicio2 {
    public static void main(String[] args) {
        
        char []vector=new char[10];
        
        vector[0]='a';
        vector[1]='x';
        vector[4]='@';
        vector[6]=' ';
        vector[7]='+';
        vector[8]='Q';
        
        for (int i =0;i<10;i++){
            System.out.println(vector[i]);
        }
    }
}
