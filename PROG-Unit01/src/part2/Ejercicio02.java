package part2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int numero;
		int numASumar;
		int resto;

		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		numero = reader.nextInt();

		resto = numero % 7;
		
		numASumar = (resto == 0) ? 0 : (7-resto) ;
		
		System.out.println("La cantidad a sumar es: " + numASumar);

		reader.close();

	}

}
