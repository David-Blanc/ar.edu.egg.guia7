package ar.edu.egg.poo;

public class Prueba {
	public static void main(String[] args) {
//		Libro var = new Libro("654321", "El gato con botas", "Pablo Picasso", 200);
//		System.out.println(var.toString());

//		Circunferencia c1 = new Circunferencia();
//		c1.crearCircunferencia();
//		System.out.println("Radio: " + c1.getRadio() + ", Área: " + c1.area() + ", Perímetro: " + c1.perimetro());

//		Operacion o1 = new Operacion();
//        o1.crearOperacion();
//        System.out.println(o1.getNumero1() + "+" + o1.getNumero2() + "=" + o1.sumar());
//        System.out.println(o1.getNumero1() + "-" + o1.getNumero2() + "=" + o1.restar());
//        System.out.println(o1.getNumero1() + "*" + o1.getNumero2() + "=" + o1.multiplicar());
//        System.out.println(o1.getNumero1() + "/" + o1.getNumero2() + "=" + o1.dividir());

		Rectangulo r1 = new Rectangulo();
		r1.crearRectangulo();
		r1.dibujo();
		System.out.println("Superficie: " + r1.superficie());
		System.out.println("Perímetro: " + r1.perimetro());

	}
}