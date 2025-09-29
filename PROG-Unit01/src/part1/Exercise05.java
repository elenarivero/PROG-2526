package part1;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		/*
		 * 1. Pedir el radio al usuario - Mostrar mensaje y esperar a que el usuario lo
		 * introduzca
		 * 2. El usuario introduce el radio
		 * 3. Calculo la longitud
		 * 4. Imprimo la longitud
		 * 5. Calcula el area
		 * 6. Imprimo el area
		 */

		// Radio de la circunferencia
		double radio;
		
		// La longitud de la circunferencia
		double longitud;
		
		// Área de la circunferencia
		double area;
		
		// Creación del scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el radio de la circunferencia 
		System.out.println("Introduce el radio de la circunferencia:");
		radio = reader.nextDouble(); // En este paso el usuario introduce el radio
		
		// Calculamos la longitud de la circunferencia
		longitud = 2*Math.PI*radio;
		
		// Calculamos el área de la circunferencia
		area = Math.PI * Math.pow(radio, 2);
		
		// Mostramos por pantalla el resultado de la longitud y el área
		System.out.println("La longitud de la circunferencia es " + longitud);
		System.out.println("El área de la cinfurencia es " + area);
		
		// Cerramos Scanner
		reader.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
