package examenes;

import java.util.Scanner;

public class Ejercicio04bis {

	public static void main(String[] args) {
		// Tamaño del lado del hexágono
		int lado;
		
		// Scanner para leer el lado
		Scanner reader = new Scanner(System.in);
		
		// Preguntamos por el tamaño del lado
		System.out.println("Introduzca el lado del hexágono:");
		lado = reader.nextInt();
		
		
		// Pintamos la primera parte del hexágono. Tiene tantas filas como lado
		// Comenzamos contando en 0 porque luego nos facilita el cálculo de asteriscos
		for(int fila = 0; fila < lado; fila++) {
			// Al inicio de cada fila se pintan una serie de espacios.
			// La cantidad de espacios a pintar es (lado-fila-1)
			for(int espacio = 1; espacio<=(lado-fila-1) ; espacio++) {
				System.out.print(" ");
			}
			
			// Pintamos los asteriscos de la fila en la que nos encontramos
			// La cantidad de asteriscos es igual a (lado + (2*fila))
			// La primera fila tiene la misma cantidad que lado, pero en las sucesivas filas
			// se le va agregando dos asteriscos
			for(int asterisco = 1; asterisco<= (lado +(2*fila)); asterisco++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		// Ahora pintamos la segunda mitad del hexágono. Será igual que la parte superior pero al revés
		// El número de filas a contar es desde 0 hasta lado-2. Si lo hacemos en descendente, los bucles internos
		// tendrán la misma estructura que en la primera parte del hexágono.
		for(int fila = lado-2; fila >= 0; fila--) {
			// Al inicio de cada fila se pintan una serie de espacios.
			// La cantidad de espacios a pintar coincide en este caso con el número de fila en el que estamos
			for(int espacio = 1; espacio<=(lado-fila-1) ; espacio++) {
				System.out.print(" ");
			}
			
			// Pintamos los asteriscos de la fila en la que nos encontramos
			for(int asterisco = 1; asterisco<= (lado +(2*fila)); asterisco++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		// Cierre del Scanner
		reader.close();
	}

}
