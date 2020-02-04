/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciClase1;

/**
 *
 * @author sergi
 */
import java.util.ArrayList;
import java.util.Random;

public class programa {
    public static ArrayList<Carta> cartas = new ArrayList();
    public static void main(String[] args) {
        int tamaño = (int) (Math.random() * 11 + 10);
        System.out.println(tamaño);

        for (int i = 0; i < tamaño; i++) {
            cartas.add(generaCarta());
        }

        for (int i = 0; i < cartas.size(); i++) {
            System.out.println(cartas.get(i).mostrarCartas());
        }
    }

    public static Carta generaCarta() {

        Random aleatorio = new Random();
        boolean encontrada;
        int numero, palo;

        do {
            encontrada = false;
            numero = aleatorio.nextInt(12) + 1;
            palo = aleatorio.nextInt(4) + 1;

            for (int i = 0; i < cartas.size(); i++) {
                if (cartas.get(i).obtenerNumero() == numero && cartas.get(i).obtenerPalo() == palo) {
                    encontrada = true;
                }
            }
        } while (encontrada);

        return new Carta(numero, palo);
    }
}
