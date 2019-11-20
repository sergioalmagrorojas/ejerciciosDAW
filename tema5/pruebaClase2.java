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
public class pruebaClase2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String r;

        System.out.println("Por favor, introduzca la altura del reloj de arena: ");
        int alturaIntroducida = Integer.parseInt(s.nextLine());
        System.out.println("Introduzca el carácter para dibujar ");
        r = s.nextLine();
        System.out.println("Introduzca las veces que quiere que se pinte el reloj");
        int veces = Integer.parseInt(s.nextLine());

        int altura = 1;
        int asteriscos = alturaIntroducida;
        int espaciosPorDelante = 0;

       
        if ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)) {
            System.out.print("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3");

        } else {
          for(int j=0;j<veces;j++){
            while (altura < alturaIntroducida / 2 + 1) {

                for (int i = 1; i <= espaciosPorDelante; i++) {
                    System.out.print(" ");
                }

                for (int i = 0; i < asteriscos; i++) {
                    System.out.print(r);

                }

                System.out.println();
                altura++;
                espaciosPorDelante++;
                asteriscos -= 2;
            }
            espaciosPorDelante = alturaIntroducida / 2;
            altura = 1;

            while ((altura <= alturaIntroducida / 2 + 1)) {
                for (int i = 1; i <= espaciosPorDelante; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < asteriscos; i++) {
                    System.out.print(r);
                }
                System.out.println();
                altura++;
                espaciosPorDelante--;
                asteriscos += 2;
            }
        
            System.out.println();//doy un salto de linea e introduzco otra vez los valores de siempre 
            alturaIntroducida+=2;//sirve para decir que lo incremente siemrpe con + 2 (para que se haga impar )
            asteriscos=alturaIntroducida;
            altura=1;
            espaciosPorDelante=0;
          }
           
        }
    }
}

