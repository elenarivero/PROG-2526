package ejerciciosswitch;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Variable donde almacenar el primer número
		double num1;

		// Variable donde almacenar el segundo número
		double num2;

		// Variable donde almacenar el resultado de la operación
		double res;

		// Variable donde almacenar la opción introducida por el usuario
		String opcion;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Solicitamos el primer número
		System.out.println("Introduzca un número:");
		num1 = reader.nextDouble();

		// Solicitamos el segundo número
		System.out.println("Introduzca otro número:");
		num2 = reader.nextDouble();

		// Imprimimos el menú
		System.out.println("A. SUMAR LOS NÚMEROS");
		System.out.println("B. RESTAR LOS NÚMEROS");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS");
		System.out.println("D. DIVIDIR LOS NÚMEROS");

		// Paso a mayúscula la opción introducida
		opcion = reader.next().toUpperCase();

		// Creamos un switch para comprobar la opción introducida
		switch (opcion) {
		case "A":
			// Suma
			res = num1 + num2;
			System.out.println("La suma es: " + res);
			break;
		case "B":
			// Resta
			res = num1 - num2;
			System.out.println("La resta es: " + res);
			break;
		case "C":
			// Multiplicación
			res = num1 * num2;
			System.out.println("La multiplicación es: " + res);
			break;
		case "D":
			// División
			// Comprobamos si el número 2 es 0. No se puede dividir por 0
			if (num2 != 0) {
				res = num1 / num2;
				System.out.println("La división es: " + res);
			} else {
				// Si el número 2 es 0 mostramos mensaje de error.
				System.out.println("No se puede dividir entre 0");
			}
			break;
		default:
			// Opción incorrecta
			System.out.println("Opción incorrecta");
		}

		// Cerramos scanner
		reader.close();

	}

}
