package ar.edu.egg.poo;

import ar.edu.egg.poo.entidades.Circunferencia;
import ar.edu.egg.poo.entidades.Operacion;
import ar.edu.egg.poo.entidades.Puntos;
import ar.edu.egg.poo.entidades.Rectangulo;
import ar.edu.egg.poo.servicios.CircunferenciaServicios;
import ar.edu.egg.poo.servicios.LibroServicios;
import ar.edu.egg.poo.servicios.OperacionServicios;
import ar.edu.egg.poo.servicios.PuntosServicios;
import ar.edu.egg.poo.servicios.RectanguloServicios;

public class Prueba {
	public static void main(String[] args) {
//		LibroServicios newLibro = new LibroServicios();
//		newLibro.crearLibro();

//		Circunferencia c1 = CircunferenciaServicios.crearCircunferencia();
//		System.out.println("Radio: " + c1.getRadio() + ", Área: " + c1.area() + ", Perímetro: " + c1.perimetro());

//		Operacion o1 = OperacionServicios.crearOperacion();
//        System.out.println(o1.getNumero1() + "+" + o1.getNumero2() + "=" + o1.sumar());
//        System.out.println(o1.getNumero1() + "-" + o1.getNumero2() + "=" + o1.restar());
//        System.out.println(o1.getNumero1() + "*" + o1.getNumero2() + "=" + o1.multiplicar());
//        System.out.println(o1.getNumero1() + "/" + o1.getNumero2() + "=" + o1.dividir());

//		Rectangulo r1 = RectanguloServicios.crearRectangulo();
//		RectanguloServicios.mostrarDibujo(r1);
//		RectanguloServicios.mostrarSuperficie(r1);
//		RectanguloServicios.mostrarPerimetro(r1);

		Puntos n1 = PuntosServicios.crearPuntos();
        System.out.println(PuntosServicios.distancia(n1));

	}
	
}