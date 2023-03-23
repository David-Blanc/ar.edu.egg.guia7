package ar.edu.egg.poo.servicios;

import ar.edu.egg.poo.entidades.Operacion;

import java.util.Scanner;

public class OperacionServicios {

    public static Operacion crearOperacion() {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.print("Número 1: ");
            int numero1 = leer.nextInt();
            System.out.print("Numero 2: ");
            int numero2 = leer.nextInt();
            return new Operacion(numero1, numero2);
        }
    }

}