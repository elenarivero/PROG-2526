package loops;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Variable donde almacenar la altura introducida por el usuario
		double altura;

		// Variable donde almacenar la altura máxima
		double alturaMaxima;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos una altura al usuario
		System.out.println("Introduce una altura:");
		altura = reader.nextDouble();

		// Le asignamos a alturaMaxima la primera altura introducida
		alturaMaxima = altura;

		// Mientras la altura introducida sea distinta de -1
		while (altura != -1) {

			// si la altura introducida es mayor que la máxima almacenada, actualizo la
			// máxima
			if (altura > alturaMaxima) {
				alturaMaxima = altura;
			} // Fin if

			// Le pedimos una altura al usuario
			System.out.println("Introduce una altura:");
			altura = reader.nextDouble();

		} // Fin while

		// Comprobamos si la altura máxima es distinto de -1
		// Este caso se dará cuando la primera altura introducida sea -1
		if(alturaMaxima != -1) {
			System.out.println("La altura máxima es: " + alturaMaxima);
		} else {
			System.out.println("No se ha introducido ninguna altura válida");
		}
		
		// Cerramos el Scanner
		reader.close();
	}

}
