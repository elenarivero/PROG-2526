package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Variable para contar los múltiplos de 3
		int contMult = 0;
		
		// Número introducido por el usuario
		int numero;
		
		int contador;
		
		// Scanner para leer de teclado
		Scanner reader = new Scanner(System.in);
		
		// Le pedimos un número al usuario
		System.out.println("Introduzca un número:");
		numero = reader.nextInt();
		
		// Contamos desde 1 hasta número incluidos
		for(contador = 1; contador<=numero; contador++) {
			if(contador % 3 == 0) {
				contMult++;
			}
		}
		
		// Pintamos el número de múltiplos de 3
		System.out.println("Hay " + contMult + " múltiplos de 3");
		
		// Cierre del scanner
		reader.close();
	}

}
