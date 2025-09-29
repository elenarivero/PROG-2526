package part1;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		
		/*
		 * 1. Pedir un número al usuario (imprimir mensaje y esperar el dato)
		 * 2. Compruebo si es par
		 * 3. Imprimo mensaje
		 */
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		int numero;
		boolean esPar;
		String cadenaEsPar;
		
		// Pedimos un número al usuario
		System.out.println("Introduzca un número:");
		numero = reader.nextInt();
		
		// Comprobamos si el número es par
		cadenaEsPar = (numero%2 == 0) ? "Sí" : "No";
		
		// Imprimimos si el número es par o impar
		System.out.println("¿El número es par? " + cadenaEsPar);
		
		// Cerramos el Scanner
		reader.close();
		
	}

}
