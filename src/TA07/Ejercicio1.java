package TA07;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Hashtable<String, Integer> listaAlumnos = new Hashtable<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		while (true) {

			System.out.println("Elige opcion:");
			System.out.println("1. Introduce alumno");
			System.out.println("2. Ver notas");
			menu = scanner.nextInt();

			switch (menu) {
			case 1:
				introduceAlumno(listaAlumnos);
				break;

			default:
				break;
			}
			scanner.close();
		}

	}

	private static void introduceAlumno(Hashtable<String, Integer> lista) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nombre del alumno? ");
		String alumno = scanner.next();
		scanner.close();
		System.out.println("El alumno es: " + alumno);
		double notaMedia = introduceNotas();
		System.out.println("La nota media es: " + notaMedia);
	}

	private static double introduceNotas() {
		System.out.println("Introduce un numero para la nota o 'fin' para calcular la nota media ");
		ArrayList<Double> listaNotas = new ArrayList<>();
		double notaMedia = 0;
		boolean end = false;
		Scanner scanner = new Scanner(System.in);
		double nota = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Hola 1");
			nota = scanner.nextDouble();
			System.out.println("Hola 2");
			listaNotas.add(nota);
		}
		scanner.close();

		
		int cont = 0;
		for(Double d : listaNotas) {
		    notaMedia = notaMedia + d;
		    cont++;
		}
		
		notaMedia = notaMedia / cont;



		return notaMedia;

	}

}
