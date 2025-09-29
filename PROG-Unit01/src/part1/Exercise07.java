package part1;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		/*
		 * Pedir nombre Pedir dirección Pedir teléno
		 * 
		 * Pintar toda la información
		 */
		Scanner reader = new Scanner(System.in);
		String nombre;
		String direccion;
		String telefono;
		
		System.out.println("Introduzca su nombre:");
		nombre = reader.nextLine();
		
		System.out.println("Introduzca su dirección:");
		direccion = reader.nextLine();
		
		System.out.println("Introduzca su teléfono:");
		telefono = reader.nextLine();
		
		System.out.println("Nombre introducido: " + nombre);
		System.out.println("Nombre introducido: " + direccion);
		System.out.println("Nombre introducido: " + telefono);
		
		reader.close();
	}

}
