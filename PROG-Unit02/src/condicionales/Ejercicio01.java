package condicionales;

import java.util.Scanner;

public class Ejercicio01 {

	/*
	 * E=1, R.E.=Capicúa, R.O.=Capicúa
	 * 
	 */

	public static void main(String[] args) {
		// Número solicitado al usuario, debe estar entre 0 y 9999
		int numero;

		// Variable para comprobar si el número es capicúa
		boolean esCapicua;

		// Varibles para las cifras de un número
		int unidades;
		int decenas;
		int centenas;
		int miles;

		// Scanner para leer de teclado
		Scanner reader = new Scanner(System.in);

		// Le pedimos un número al usuario
		System.out.println("Introduzca un número:");
		numero = reader.nextInt();

		if (numero < 0 || numero > 9999) {
			System.out.println("ERROR: El número tiene que estar entre 0 y 9999");
		} else {
			if (numero < 10) {
				// Si el número tiene una cifra es capicúa
				esCapicua = true;
			} else if (numero < 100) {
				// Si es de dos cifras será capicúa si las dos cifras son iguales
				unidades = numero % 10;
				decenas = numero / 10;
				esCapicua = (unidades == decenas);
			} else if (numero < 1000) {
				// Si es de dos cifras es capicúa si la primera y la última cifra son iguales
				unidades = numero % 10;
				centenas = numero / 100;
				esCapicua = (unidades == centenas);
			} else {
				// Si no ha entrado en ningún caso anterior es de 4 cifras
				unidades = numero % 10;
				decenas = (numero / 10) % 10;
				centenas = (numero / 100) % 10;
				miles = numero / 1000;
				esCapicua = (unidades == miles) && (decenas == centenas);
			}

			// Imprimimos si el número es capicúa o no
			System.out.println(esCapicua ? "Es capicúa" : "No es capicúa");
		}

		// Cerramos scanner
		reader.close();

	}

}
