package ar.edu.egg.poo.servicios;

import ar.edu.egg.poo.entidades.Rectangulo;

import java.util.Scanner;

public class RectanguloServicios {

    public static Rectangulo crearRectangulo() {
        Rectangulo rectangulo = new Rectangulo();

        try (Scanner leer = new Scanner(System.in)) {
            System.out.print("Base: ");
            rectangulo.setBase(leer.nextInt());
            System.out.print("Altura: ");
            rectangulo.setAltura(leer.nextInt());
        } catch (Exception e) {
            System.out.println("Error al ingresar los datos del rectángulo.");
        }

        return rectangulo;
    }

    public static void mostrarSuperficie(Rectangulo rectangulo) {
        System.out.println("La superficie del rectángulo es: " + rectangulo.superficie());
    }

    public static void mostrarPerimetro(Rectangulo rectangulo) {
        System.out.println("El perímetro del rectángulo es: " + rectangulo.perimetro());
    }

    public static void mostrarDibujo(Rectangulo rectangulo) {
        System.out.println("El dibujo del rectángulo es: ");
        rectangulo.dibujo();
    }

}
