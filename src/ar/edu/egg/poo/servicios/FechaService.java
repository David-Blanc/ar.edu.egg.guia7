package ar.edu.egg.poo.servicios;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class FechaService {
	@SuppressWarnings("deprecation")
	public static Date fechaNacimiento() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Ingrese día de nacimiento: ");
			int dia = sc.nextInt();
			System.out.print("Ingrese mes de nacimiento: ");
			int mes = sc.nextInt() - 1;
			System.out.print("Ingrese año de nacimiento: ");
			int anio = sc.nextInt() - 1900;
			return new Date(anio, mes, dia);
		}
	}

	public static Date fechaActual() {
		return new Date();
	}

	public static int diferencia(Date fecha1, Date fecha2) {
		Calendar cal1 = Calendar.getInstance();
	    Calendar cal2 = Calendar.getInstance();
	    cal1.setTime(fecha1);
	    cal2.setTime(fecha2);
	    int age = cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR);
	    if (cal1.get(Calendar.MONTH) > cal2.get(Calendar.MONTH)
	            || (cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH)
	            && cal1.get(Calendar.DAY_OF_MONTH) > cal2.get(Calendar.DAY_OF_MONTH))) {
	        age--;
	    }
	    return age;
	}

}
