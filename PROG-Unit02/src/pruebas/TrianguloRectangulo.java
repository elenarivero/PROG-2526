package pruebas;

import java.util.Scanner;

public class TrianguloRectangulo {

	public static void main(String[] args) {
		// Triangulo Rectangulo
		// Tamaño del triángulo
		int tamaño;
		
		// Scanner para leer el tamaño
		Scanner reader = new Scanner(System.in);
		
		// Le pedimos el tamaño al usuario
		System.out.println("Introduzca el tamaño del triángulo:");
		tamaño = reader.nextInt();
		
		for(int i=tamaño; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// Cierre del scanner
		reader.close();

	}

}
