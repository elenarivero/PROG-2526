package englishpart2;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		double price;
		int tax;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("TAX CALCULATOR");
		System.out.println("Introduce the price:");
		price = reader.nextDouble();
		
		System.out.println("Introduce the tax:");
		tax = reader.nextInt();
		
		price = price + price*tax/100; // price(1 + tax/100)
		
		System.out.println("The price with tax is " + price);
		
		reader.close();
	}

}
