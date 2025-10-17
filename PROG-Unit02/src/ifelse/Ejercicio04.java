package ifelse;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		int number;

		Scanner reader = new Scanner(System.in);

		System.out.println("Introduzca un número");
		number = reader.nextInt();

		if (number < 0 || number > 99999) {
			System.out.println("Número incorrecto");
		} else if (number < 10) {
			System.out.println("Tiene una cifra.");
		} else if (number < 100) {
			System.out.println("Tiene dos cifras");
		} else if (number < 1000) {
			System.out.println("Tiene tres cifras");
		} else if (number < 10000) {
			System.out.println("Tiene cuatro cifras");
		} else {
			System.out.println("Tiene cinco cifras");
		}

		reader.close();

	}

}
