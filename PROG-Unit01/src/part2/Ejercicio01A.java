package part2;

import java.util.Scanner;

public class Ejercicio01A {

	public static void main(String[] args) {
		double numero;
		int resultado;

		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca un número con decimales:");
		numero = reader.nextDouble();

		resultado = (int) (numero + 0.5);
		
		System.out.println("El número redondeado es: " + resultado);

		reader.close();
	}

}
