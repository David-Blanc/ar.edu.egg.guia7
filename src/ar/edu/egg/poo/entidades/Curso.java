package ar.edu.egg.poo.entidades;

import java.util.Scanner;

public class Curso {
	private String nombreCurso;
	private int cantidadHorasPorDia;
	private int cantidadDiasPorSemana;
	private String turno;
	private double precioPorHora;
	private String[] alumnos;

	private static final Scanner leer = new Scanner(System.in);

	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno,
			double precioPorHora, String[] alumnos) {
		super();
		this.nombreCurso = nombreCurso;
		this.cantidadHorasPorDia = cantidadHorasPorDia;
		this.cantidadDiasPorSemana = cantidadDiasPorSemana;
		this.turno = turno;
		this.precioPorHora = precioPorHora;
		this.alumnos = alumnos;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public int getCantidadHorasPorDia() {
		return cantidadHorasPorDia;
	}

	public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
		this.cantidadHorasPorDia = cantidadHorasPorDia;
	}

	public int getCantidadDiasPorSemana() {
		return cantidadDiasPorSemana;
	}

	public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
		this.cantidadDiasPorSemana = cantidadDiasPorSemana;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getPrecioPorHora() {
		return precioPorHora;
	}

	public void setPrecioPorHora(double precioPorHora) {
		this.precioPorHora = precioPorHora;
	}

	public String[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(String[] alumnos) {
		this.alumnos = alumnos;
	}

	public void cargarAlumnos() {
		alumnos = new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("Nombre del alumno " + (i + 1) + ": ");
			String nombre = leer.nextLine();
			alumnos[i] = nombre;
		}

	}

	public void crearCurso() {
		System.out.print("Nombre del curso: ");
		setNombreCurso(leer.nextLine());

		System.out.print("Cantidad de horas por día: ");
		setCantidadHorasPorDia(leer.nextInt());

		System.out.print("Cantidad de días por semana: ");
		setCantidadDiasPorSemana(leer.nextInt());

		leer.nextLine();

		System.out.print("Turno (mañana o tarde): ");
		setTurno(leer.nextLine());

		System.out.print("Precio por hora: ");
		setPrecioPorHora(leer.nextDouble());

		cargarAlumnos();
	}

	public double  calcularGananciaSemanal() {
		return cantidadHorasPorDia * precioPorHora * alumnos.length * cantidadDiasPorSemana;
	}
}
