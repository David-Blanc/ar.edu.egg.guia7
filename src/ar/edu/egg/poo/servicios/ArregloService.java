package ar.edu.egg.poo.servicios;

import java.util.Arrays;
import java.util.Comparator;

public class ArregloService {
	public static void inicializarA(Double[] arreglo) {
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = Math.random() * 100;
		}
	}

	public static void mostrar(Double[] arreglo) {
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i] + " ");
		}
		System.out.println();
	}

	public static void ordenar(Double[] arreglo) {
		Comparator<Double> comparator = Comparator.reverseOrder();
		Arrays.sort(arreglo, comparator);
	}

	public static void inicializarB(Double[] arregloB, Double[] arregloA) {
		for (int i = 0; i < 10; i++) {
            arregloB[i] = arregloA[i];
        }
        Arrays.fill(arregloB, 10, arregloB.length, 0.5);
	}
}
