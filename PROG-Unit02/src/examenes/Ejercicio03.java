package examenes;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Variable para almacenar el lado del triángulo
		int lado;

		// Scanner para leer el lado
		Scanner reader = new Scanner(System.in);

		// Le pedimos el lado al usuario
		System.out.println("Introduzca el lado del triángulo:");
		lado = reader.nextInt();

		// El triángulo tendrá tantas filas como el tamaño del lado, así que creamos un
		// for para reflejarlo.
		// Para facilitar la lógica de los bucles internos vamos a comenzar contando en
		// 0
		for (int fila = 0; fila < lado; fila++) {
			// Al inicio de cada fila hay una serie de espacios.
			// En la primera fila no hay espacios (0) y en las siguientes hay la misma
			// cantidad que el número de fila en la que nos encontramos, puesto que hemos
			// comenzado a contar en 0
			for (int espacios = 0; espacios < fila; espacios++) {
				System.out.print(" ");
			}

			// La zona de los asteriscos no es sólo asteriscos, es "* "
			// La primera fila tiene tantos asteriscos como el tamaño del lado y luego en
			// las siguientes se le va restando uno. (lado-fila)
			for (int columna = 1; columna <= lado - fila; columna++) {
				// La única fila que contiene todos los asteriscos es la primera.
				// También tiene asteriscos la primera y la última columna de cada fila
				if(fila == 0 || columna == 1 || columna == lado - fila) {
					// Imprimimos "* "
					System.out.print("* ");
				} else {
					// Imprimimos dos espacios puesto que cuando imprimimos asteriscos imprimimos "* "
					System.out.print("  ");
				}
			}

			// Salto de línea del fin de la fila
			System.out.println();
		}

		// Cierre del Scanner
		reader.close();

	}

}
