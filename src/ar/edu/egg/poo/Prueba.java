package ar.edu.egg.poo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ar.edu.egg.poo.entidades.Cafetera;
import ar.edu.egg.poo.entidades.Circunferencia;
import ar.edu.egg.poo.entidades.Cocina;
import ar.edu.egg.poo.entidades.Cuenta;
import ar.edu.egg.poo.entidades.CuentaBancaria;
import ar.edu.egg.poo.entidades.Empleado;
import ar.edu.egg.poo.entidades.NIF;
import ar.edu.egg.poo.entidades.Operacion;
import ar.edu.egg.poo.entidades.Persona;
import ar.edu.egg.poo.entidades.Puntos;
import ar.edu.egg.poo.entidades.Raices;
import ar.edu.egg.poo.entidades.Receta;
import ar.edu.egg.poo.entidades.Rectangulo;
import ar.edu.egg.poo.entidades.Rectangulo2;
import ar.edu.egg.poo.servicios.CafeteraServicio;
import ar.edu.egg.poo.servicios.CircunferenciaServicios;
import ar.edu.egg.poo.servicios.CuentaBancariaServicio;
import ar.edu.egg.poo.servicios.LibroServicios;
import ar.edu.egg.poo.servicios.NIFService;
import ar.edu.egg.poo.servicios.OperacionServicios;
import ar.edu.egg.poo.servicios.PersonaServicio;
import ar.edu.egg.poo.servicios.PuntosServicios;
import ar.edu.egg.poo.servicios.RaicesServicio;
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

//		Puntos n1 = PuntosServicios.crearPuntos();
//        System.out.println(PuntosServicios.distancia(n1));

//		Receta milanesa = new Receta("Milanesas", Arrays.asList("carne", "pan", "huevo", "ajo", "sal", "pimienta", "aceite de girasol"));
//		Receta carbonara = new Receta("Carbonara", Arrays.asList("pasta", "queso", "pimienta", "panceta", "sal", "huevo"));
//		Cocina cocina = new Cocina();
//		cocina.agregarReceta(milanesa);
//		cocina.agregarReceta(carbonara);
//		System.out.println(cocina.buscarRecetaPorNombre("Milanesas"));
//		System.out.println(cocina.buscarRecetaPorIngredientes(Arrays.asList("huevo")));

//		Cuenta cuenta = new Cuenta(2000, "Renato Palacios");
//		cuenta.retirar_dinero(1000);

//		Empleado empleado = new Empleado("Renato Palacios", 30, 2000);
//		System.out.println(empleado);
//		System.out.println(empleado.calcular_aumento());

//		Rectangulo2 ractangulo1 = new Rectangulo2(4, 6);
//		System.out.println(ractangulo1.calcular_area());

//		CuentaBancariaServicio cuentaServicios = new CuentaBancariaServicio();
//		CuentaBancaria cuenta = cuentaServicios.crearCuenta(32165497, 32654987, 10000);
//		cuentaServicios.ingresarDinero(cuenta, 1000);
//		cuentaServicios.retirarDinero(cuenta, 2000);
//		cuentaServicios.extraccionRapida(cuenta, 5000);
//		System.out.println(cuentaServicios.consultarSaldo(cuenta));
//		cuentaServicios.consultarDatos(cuenta);

//		CafeteraServicio cafServ = new CafeteraServicio();
//		Cafetera cafetera = new Cafetera(1000, 250);
//		cafServ.servirTaza(cafetera, 200);
//		cafServ.servirTaza(cafetera, 200);
//		cafServ.llenarCafetera(cafetera);
//		cafServ.servirTaza(cafetera, 150);
//		cafServ.vaciarCafetera(cafetera);
//		cafServ.agregarCafe(cafetera, 200);
//		cafServ.servirTaza(cafetera, 400);

//		Persona p1 = PersonaServicio.crearPersona("María", 20, 'M', 65, 1.54);
//        Persona p2 = PersonaServicio.crearPersona("Juan", 42, 'H', 95, 1.90);
//        Persona p3 = PersonaServicio.crearPersona("Máximo", 30, 'H', 80, 1.82);
//        Persona p4 = PersonaServicio.crearPersona("Juan", 17, 'M', 49, 1.65);
//        
//        System.out.println(p1.getNombre()+", mayor de edad: "+PersonaServicio.esMayorDeEdad(p1)+". IMC : "+PersonaServicio.calcularIMC(p1));
//        System.out.println(p2.getNombre()+", mayor de edad: "+PersonaServicio.esMayorDeEdad(p2)+". IMC : "+PersonaServicio.calcularIMC(p2));
//        System.out.println(p3.getNombre()+", mayor de edad: "+PersonaServicio.esMayorDeEdad(p3)+". IMC : "+PersonaServicio.calcularIMC(p3));
//        System.out.println(p4.getNombre()+", mayor de edad: "+PersonaServicio.esMayorDeEdad(p4)+". IMC : "+PersonaServicio.calcularIMC(p4));
//	
//        Persona[] personas = {p1, p2, p3, p4};
//
//        System.out.println("Con peso debajo del ideal: "+PersonaServicio.porcentajeDebajoPeso(personas)+"%");
//        System.out.println("Con peso ideal: "+PersonaServicio.porcentajePesoIdeal(personas)+"%");
//        System.out.println("Con sobrepeso: "+PersonaServicio.porcentajeSobrepeso(personas)+"%");
//        System.out.println("Mayores de edad: "+PersonaServicio.porcentajeMayoresEdad(personas)+"%");
//        System.out.println("Menores de edad:"+PersonaServicio.porcentajeMenoresEdad(personas)+"%");

//		Raices raices = RaicesServicio.crearEcuacion(1, 5, -1);
//		RaicesServicio.calcular(raices);
		
		NIF nif = NIFService.crearNif(48214658);
		NIFService.mostrar(nif);
	}

}