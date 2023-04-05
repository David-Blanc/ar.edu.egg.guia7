package ar.edu.egg.poo.servicios;

import ar.edu.egg.poo.entidades.Raices;

public class RaicesServicio {
	public static double getDiscriminante(Raices raices) {
		return Math.pow(raices.getB(), 2) - 4 * raices.getA() * raices.getC();
	}

	public static boolean tieneRaices(Raices raices) {
		return RaicesServicio.getDiscriminante(raices) >= 0;
	}

	private static boolean tieneRaiz(Raices raices) {
		return RaicesServicio.getDiscriminante(raices) == 0;
	}

	public static double[] obtenerRaices(Raices raices) {
		if (RaicesServicio.tieneRaices(raices)) {
			double discriminante = RaicesServicio.getDiscriminante(raices);
			double raiz1 = (-raices.getB() + Math.sqrt(discriminante)) / (2 * raices.getA());
			double raiz2 = (-raices.getB() - Math.sqrt(discriminante)) / (2 * raices.getA());
			double[] array = { raiz1, raiz2 };
			return array;
		}
		return null;
	}

	private static double obtenerRaiz(Raices raices) {
		if (RaicesServicio.tieneRaiz(raices)) {
			return -(raices.getB() + Math.sqrt(RaicesServicio.getDiscriminante(raices))) / (2 * raices.getA());
		}
		return 0;
	}

	public static void calcular(Raices raices) {
		if (RaicesServicio.tieneRaiz(raices)) {
			System.out.println("Raiz: " + RaicesServicio.obtenerRaiz(raices));
		} else if (RaicesServicio.tieneRaices(raices)) {
			System.out.println("Raiz 1: " + RaicesServicio.obtenerRaices(raices)[0] + ". Raiz 2: "
					+ RaicesServicio.obtenerRaices(raices)[1]);
		} else {
			System.out.println("La ecuación no tiene solución.");
		}
	}

	public static Raices crearEcuacion(double a, double b, double c) {
		return new Raices(a, b, c);
	}
}
