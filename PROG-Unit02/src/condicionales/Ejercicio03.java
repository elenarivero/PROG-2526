package condicionales;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		int modDNI;
		char letra;

		int numDNI;

		Scanner reader = new Scanner(System.in);

		System.out.println("Introduzca su DNI");
		numDNI = reader.nextInt();

		modDNI = numDNI % 23;

		if (numDNI >= 10000000 && numDNI <= 99999999) {
			switch (modDNI) {
			case 0:
				letra = 'T';
			case 1:
				letra = 'R';
			case 2:
				letra = 'W';
			case 3:
				letra = 'A';
				//... Faltan casos 
			case 21:
				letra = 'K';
			default:
				letra = 'E';
			}

			System.out.println("Tu letra es " + letra);
		} else {
			System.out.println("DNI no válido");
		}

		reader.close();
	}

}
