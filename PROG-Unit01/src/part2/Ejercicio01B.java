package part2;

import java.util.Scanner;

public class Ejercicio01B {

	public static void main(String[] args) {
		double numero;
		double parteDecimal;
		int parteEntera;
		int resultado;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca un número decimal");
		numero = reader.nextDouble();
		
		parteEntera = (int) numero;
		
		parteDecimal = numero - parteEntera;
		
		resultado = (parteDecimal < 0.5) ? parteEntera : parteEntera+1;

		System.out.println("El número redondeado es: " + resultado);
		reader.close();
	}

}
