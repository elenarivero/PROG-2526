package examenes;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Variable donde almacenar el tamaño del lado
		int lado;
		
		// Scanner para leer de teclado
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el lado del cuadrado al usuario
		System.out.println("Introduzca el tamaño del lado del cuadrado");
		lado = reader.nextInt();
		
		// Bucle for para las filas
		for(int fila = 1; fila<=lado; fila++) {
			// Bucle for para las columnas
			// Pinta todos los asteriscos para la primera y la última fila
			if(fila == 1 || fila == lado) {
				for(int col = 1; col<=lado; col++) {
					System.out.print("*");
				}
			}
			else { // Pintamos las filas de en medio
				// Pinta asterisco y espacios en medio
				System.out.print("*");
				
				// for para pintar los espacios
				for(int espacio = 1; espacio <= lado-2; espacio++) {
					System.out.print(" ");
				}
				
				// Pintamos asterisco final
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		// Cerramos Scanner
		reader.close();

	}

}
