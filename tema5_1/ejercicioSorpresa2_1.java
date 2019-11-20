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
public class ejercicioSorpresa2_1 {
   public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int menor=0,nota=0,aux,contador=0;
	float media;
	aux=nota;
	char letra = 's';
	while(letra=='s') {
		System.out.print("Quieres introducir alguna nota?(s/n): ");
		letra = scan.next().charAt(0);
		if(letra=='s') {
			System.out.print("Introduce una nota: ");
			nota=scan.nextInt();
			if(nota>=5 && nota<=10) {
				aux+=nota;
				contador++;
			}
			}
			else if(nota<5 && nota>=0) {
				contador++;
				if(menor>nota)
					menor=nota;
				
			
			}
			
		}
		if(menor==10) {
		media=(aux/contador);
		if(media<5)
			media=menor;}
		else
			media=menor;
		
		System.out.print("La nota media es: "+ media);
			
		}
}
