package condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		/*
		 * (la aplicación genera dos números aleatorios)
		 * la aplicación muestra los dos números aleatorios
		 * (el usuario realiza el cálculo de la suma)
		 * la aplicación le pide al usuario la suma de los dos números
		 * la aplicación dice si es correcto o no
		 */

		// Clase para generar números aleatorios Random (Math.random())
		Random aleatorio = new Random();
		
		// Primer número aleatorio
		int num1 = aleatorio.nextInt(1, 100);
		
		// Segundo número aleatorio
		int num2 = aleatorio.nextInt(1, 100);
		
		// Suma de los valores aleatorios
		int sumaAleatorios = num1 + num2;
		
		// Valor introducido por el usuario
		int sumaUsuario;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Le mostramos al usuario los dos números aleatorios
//		System.out.println("Número 1: " + num1);
//		System.out.println("Número 2: " + num2);
		
		// Le preguntamos al usuario cuánto vale la suma
		System.out.println("¿Cuánto es la suma de " + num1 + " y " + num2 + "?");
		sumaUsuario = reader.nextInt();
		
		// Comprobamos si lo introducido por el usuario coincide con la suma de los números
		if(sumaUsuario == sumaAleatorios) {
			System.out.println("¡HAS ACERTADO!");
		} else {
			System.out.println("ERROR. La suma es " + sumaAleatorios);
		}
		
		//System.out.println(sumaUsuario == sumaAleatorios ? "¡HAS ACERTADO!" : "ERROR. La suma es " + sumaAleatorios);
				
		// Cerramos el Scanner
		reader.close();
		
	}

}
