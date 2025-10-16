package diagrams;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		String nombre;
		int numHoras;
		double tarifaHora;
		double salBruto;
		double salNeto;
		double tasas = 0;

		Scanner reader = new Scanner(System.in);

		System.out.println("Introduzca el nombre del empleado:");
		nombre = reader.nextLine();

		System.out.println("Introduzca el número de horas trabajadas:");
		numHoras = reader.nextInt();

		System.out.println("Introduzca la tarifa por hora:");
		tarifaHora = reader.nextDouble();

		if (numHoras <= 35) {
			// Bloque true
			salBruto = numHoras * tarifaHora;
		} else {
			// Bloque false
			salBruto = 35 * tarifaHora + (numHoras - 35) * tarifaHora * 1.5;
		}
		
		if(salBruto > 500 && salBruto <= 900){
			tasas = (salBruto-500)*0.25;
		} else if (salBruto > 900){
			tasas = (salBruto-900)*0.45 + 400*0.25;
		}

		salNeto = salBruto - tasas;
		
		System.out.println("Resumen de: " + nombre);
		System.out.println("Salario Bruto: " + salBruto);
		System.out.println("Tasas: " + tasas);
		System.out.println("Salario Neto: " + salNeto);
		
		reader.close();

	}

}
