package examen2425;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		// Declaramos tres variables enteras para almacenar los números
		int numero1;
		int numero2;
		int numero3;
		
		// Declaramos una variable para almacenar la media
		double media;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos 3 números al usuario
		System.out.println("Introduzca el número 1:");
		numero1 = reader.nextInt();
		
		System.out.println("Introduzca el número 2:");
		numero2 = reader.nextInt();
		
		System.out.println("Introduzca el número 3:");
		numero3 = reader.nextInt();
		
		// Calculamos la media
		media = (numero1 + numero2 + numero3) / 3.0;
		
		// Imprimimos el resultado
		System.out.println("La media es: " + media);
		
		// Cerramos el scanner
		reader.close();
		
	}
}
