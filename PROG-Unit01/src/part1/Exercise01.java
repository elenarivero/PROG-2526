package part1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Creation of the Scanner
		Scanner reader = new Scanner(System.in);

		// Variable to store a number
		int number;

		// Ask the user a number
		System.out.println("Introduce a number:");

		// Reading number
		number = reader.nextInt();

		// Print the final message
		System.out.println("Number introduced by user: " + number);
		
		// Closing Scanner
		reader.close();

	}

}
