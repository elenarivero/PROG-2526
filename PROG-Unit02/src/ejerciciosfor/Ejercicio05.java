package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// !5 = 5*4*3*2*1 = 120
		// Variable donde almacenar el factorial
		long factorial = 1;

		// Número que se le pide al usuario
		int numero;

		// Scanner para leer de teclado
		Scanner reader = new Scanner(System.in);

		// Pedimos un número al usuario
		System.out.println("Introduzca un número");
		numero = reader.nextInt();

		for (int cont = numero; cont >= 1; cont--) {
			// 5*4*3*2*1
			System.out.print(cont);
			if (cont != 1) {
				// Sólo imprimimos * si no es 1
				System.out.print("*");
			}
			// Vamos calculando el factorial
			factorial *= cont;
		}

		// Imprimimos el factorial
		System.out.println("=" + factorial);

		// Cierre del scanner
		reader.close();

	}

}
