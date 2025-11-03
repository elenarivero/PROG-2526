package dowhile;

import java.util.Scanner;

public class Ejecicio03 {

	public static void main(String[] args) {
		// Variable donde almacenar la suma total
		int suma = 0;

		// Contador que se le va a ir sumando a suma
		int contador = 1;

		// Número introducido por el usuario
		int numero;

		// Creamos scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos un número al usuario
		System.out.println("Introduzca un número");
		numero = reader.nextInt();

		do {
			suma += contador;
			contador++;
		} while (contador <= numero); // ¡¡¡¡PUNTO Y COMA!!!!
		
		System.out.println("La suma total es: " + suma);
		
		// Cerramos el scanner
		reader.close();

	}

}
