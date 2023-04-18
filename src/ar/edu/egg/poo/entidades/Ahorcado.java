package ar.edu.egg.poo.entidades;

import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {
	private int erroresMaximos;
	private int errores;
	private String palabra[];
	private String palabraAvance[];
	private String letrasEncontradas[];
	private int numLetrasEncontradas;
	private int intentos;
	
	private static Scanner leer = new Scanner(System.in);

	public Ahorcado(int erroresMaximos, String[] palabra) {
		this.erroresMaximos = erroresMaximos;
		this.palabra = palabra;
	}

	public Ahorcado() {
	}

	public void crearJuego() {
		System.out.print("Ingrese la palabra: ");
		String p = leer.next();
		palabra = new String[p.length()];
		palabraAvance = new String[p.length()];
		Arrays.fill(palabraAvance, "_");
		for (int i = 0; i < palabra.length; i++) {
			palabra[i] = p.substring(i, i + 1);
		}
		System.out.print("Número de errores máximos: ");
		erroresMaximos = leer.nextInt();
		numLetrasEncontradas = 0;
		letrasEncontradas = new String[palabra.length];
		errores = 0;
		intentos = 0;
	}

	public void longitud() {
		System.out.println("Tamaño de la palabra: " + palabra.length);
	}

	public void buscar(String letra) {
		int aux = 0;
		int aux2 = 0;
		for (int i = 0; i < letrasEncontradas.length; i++) {
			if (letra.equalsIgnoreCase(letrasEncontradas[i])) {
				i = letrasEncontradas.length;
				System.out.println("Ya la mencionó...");
				aux2 = 1;
			}
		}
		if (aux2 == 0) {
			for (int i = 0; i < palabra.length; i++) {
				if (letra.equalsIgnoreCase(palabra[i])) {
					aux += 1;
					palabraAvance[i] = letra.toUpperCase();
				}
				System.out.print(palabraAvance[i] + " ");
			}
			System.out.println("");
			if (aux > 0) {
				System.out.println("La letra '" + letra + "' se encuentra " + aux + " veces.");
				numLetrasEncontradas += 1 * aux;
				letrasEncontradas[intentos - errores] = letra;
			} else {
				System.out.println("La letra '" + letra + "' no se encuentra.");
				errores += 1;
				if (errores == erroresMaximos) {
					System.out.println("---------------GAME OVER---------------");
					System.out.println("---------------------------------------");
				}
			}
			intentos += 1;
		}
	}

	public boolean encontradas(String letra) {
		System.out.println("Encontradas: " + numLetrasEncontradas);
		System.out.println("Faltan encontrar: " + (palabra.length - numLetrasEncontradas));
		for (int i = 0; i < letrasEncontradas.length; i++) {
			if (letra.equalsIgnoreCase(letrasEncontradas[i])) {
				i = letrasEncontradas.length;
				return true;
			}
		}
		return false;
	}

	public void intentos() {
		if (erroresMaximos - errores != 0) {
			System.out.println("Vidas restantes: " + (erroresMaximos - errores));
		}
	}

	public void Juego() {
		crearJuego();
		for (int i = 0; i < 30; i++) {
			System.out.println("");
		}
		System.out.println("---------------------------------------");
		System.out.println("-----------------START-----------------");
		longitud();
		String letra;
		while (erroresMaximos != errores && numLetrasEncontradas != palabra.length) {
			System.out.print("Ingrese una letra: ");
			letra = leer.next();
			buscar(letra);
			intentos();
			System.out.println("");
		}
		if (numLetrasEncontradas == palabra.length) {
			System.out.println("------------CONGRATULATIONS------------");
			System.out.println("---------------------------------------");
		}

	}
}
