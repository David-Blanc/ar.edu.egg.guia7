package ar.edu.egg.poo.entidades;

import java.util.Scanner;

public class Juego {
	private int numero;
	private int intentos = 5;
	private int ganadas1;
	private int ganadas2;
	private String jugador1;
	private String jugador2;
	private int partidas;
	private Scanner leer = new Scanner(System.in);

	public Juego() {
		ganadas1 = 0;
		ganadas2 = 0;
		partidas = 0;
	}

	public void iniciar_juego() {
		System.out.print("Jugador 1, escribe tu nombre: ");
		jugador1 = leer.nextLine();
		System.out.print("Jugador 2, escribe tu nombre: ");
		jugador2 = leer.nextLine();

		while (true) {
			partidas++;
			String jug1;
			String jug2;
			int eleccion = 0;
			if (partidas % 2 == 0) {
				jug1 = jugador2;
				jug2 = jugador1;
			} else {
				jug1 = jugador1;
				jug2 = jugador2;
			}

			System.out.print(jug1 + ", elige un número entre 1 y 100: ");
			numero = leer.nextInt();
			for (int i = 0; i < 20; i++) {
				System.out.println("");
			}

			System.out.println(jug2 + ", tienes " + intentos + " intentos:");

			for (int i = 1; i <= intentos; i++) {
				System.out.print("Intento "+i+": ");
				eleccion = leer.nextInt();

				if (eleccion == numero) {
					System.out.println("Adivinaste el número!. Número de intentos: " + i);
					if (jug2.equalsIgnoreCase(jugador2)) {
						ganadas2++;
					} else {
						ganadas1++;
					}
					break;
				} else if (eleccion < numero) {
					System.out.println("El número es más alto.");
				} else {
					System.out.println("El número es más bajo.");
				}

				if (i == intentos) {
					System.out.println("Haz perdido. El número era " + numero + ".");
				}
			}

			System.out.print("¿Quieren seguir jugando? (S/N): ");
			String respuesta = leer.next();
			if (respuesta.equalsIgnoreCase("N")) {
				System.out.println("Gracias por jugar.");
				System.out.println(jugador1 + " ganó " + ganadas1 + " veces.");
				System.out.println(jugador2 + " ganó " + ganadas2 + " veces.");
				break;
			}
		}
	}

	public static void main(String[] args) {
		Juego juego = new Juego();
		juego.iniciar_juego();
	}

}
