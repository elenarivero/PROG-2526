package bucles;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Variable donde almacenar el tamaño del triángulo
		int tam;
		
		// Scanner para leer de teclado
		Scanner reader = new Scanner(System.in);
		
		// Le pedimos el tamaño al usuario
		System.out.println("Introduzca el tamaño del triángulo:");
		tam = reader.nextInt();
		
		// for para las filas
		for(int fila = 1; fila <= tam; fila ++) {
			// Bucle para los espacios
			for(int espacio = 1; espacio<=tam-fila; espacio++) {
				System.out.print(" ");
			}
			
			// Bucle para los asteriscos
			for(int asterisco = 1; asterisco<=fila; asterisco++) {
				// Imprimimos "* " porque siempre hay espacios entre los asteriscos
				System.out.print("* ");
			}
			
			// Salto de línea para pintar la siguiente fila
			System.out.println();
		}
		
		
		// Cierre del Scanner
		reader.close();

	}

}
