/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5_1;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class ejercicio35 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String r;

        System.out.println("Por favor, introduzca la altura de la X: ");
        int alturaIntroducida = Integer.parseInt(s.nextLine());
        System.out.println("Introduzca el carácter ");
        r = s.nextLine();
        

        int alto = 1;
        int asteriscos = alturaIntroducida-1;
        int espacios = 0;

        if ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)) {
            System.out.print("Debes introducir una altura impar mayor o igual a 3");

        } else {

            do{  

                for (int i = 1; i <= espacios; i++) {
                    System.out.print(" ");
                }
                System.out.print(r);
                for (int i = 1; i < asteriscos; i++) {
                    System.out.print(" ");
                }
                System.out.print(r);
                System.out.println();
                alto++;
                espacios++;
                asteriscos -= 2;
            }while(alto < alturaIntroducida / 2 + 1);
            
            asteriscos = 0;
            espacios=alturaIntroducida/2;           
            alto = 1;

            do{ 
                
                for (int i = 1; i <= espacios; i++) {
                    System.out.print(" ");
                }
                
                System.out.print(r);
                
                for (int i = 0; i <= asteriscos; i++) {
                    System.out.print(" ");
                }
                
                System.out.print(r); 
                
                
                System.out.println();
                alto++;
                espacios--;
                asteriscos+= 2;
            }while((alto <= alturaIntroducida / 2 + 1));

           /* System.out.println();//doy un salto de linea e introduzco otra vez los valores de siempre 
            asteriscos = alturaIntroducida;
            alto++;
            espacios--;*/

        }
    }
}
