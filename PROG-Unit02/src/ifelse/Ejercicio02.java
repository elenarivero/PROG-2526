package ifelse;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		double number;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduzca un número con decimales:");
		number = reader.nextDouble();
		
		if(number > -1 && number< 1 && number!= 0) {
			System.out.println("El número es casi 0");
		} else {
			System.out.println("El número no es casi 0");
		}
		
		reader.close();

	}

}
