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
		
		String opcion;
		
		Scanner reader = new Scanner(System.in);
		
		
		
		System.out.println("Introduzca un número:");
		num1 = reader.nextDouble();
		
		System.out.println("Introduzca otro número:");
		num2 = reader.nextDouble();
		
		System.out.println("A. SUMAR LOS NÚMEROS");
		System.out.println("B. RESTAR LOS NÚMEROS");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS");
		System.out.println("D. DIVIDIR LOS NÚMEROS");
		
		// Paso a mayúscula la opción introducida
		opcion = reader.next().toUpperCase();
		
		switch(opcion) {
		case "A":
			res = num1 + num2;
			System.out.println("La suma es: " + res);
			break;
		case "B":
			res = num1 - num2;
			System.out.println("La resta es: " + res);
			break;
		case "C":
			res = num1 * num2;
			System.out.println("La multiplicación es: " + res);
			break;
		case "D":
			if(num2 != 0) {
				res = num1 / num2;
				System.out.println("La división es: " + res);
			} else {
				System.out.println("No se puede dividir entre 0");
			}
			
			break;
		default:
			System.out.println("Opción incorrecta");
		}
		
		
		
		reader.close();
		

	}

}
