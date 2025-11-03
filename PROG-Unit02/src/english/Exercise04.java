package english;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		int quantityToPay;
		int quantityGiven;
		int change;
		
		final int COIN_2_EURO = 200;
		final int COIN_1_EURO = 100;
		final int COIN_50_CENT = 50;
		final int COIN_20_CENT = 20;
		final int COIN_10_CENT = 10;
		final int COIN_5_CENT = 5;
		final int COIN_2_CENT = 2;
		final int COIN_1_CENT = 1;
		
		int counter = 0;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce the quantity to pay:");
		quantityToPay = reader.nextInt();
		
		System.out.println("Introduce the quantity given:");
		quantityGiven = reader.nextInt();
		
		if(quantityGiven >= quantityToPay) {
			change = quantityGiven - quantityToPay;
			
			counter = change / COIN_2_EURO;
			change = change%COIN_2_EURO;
			
			System.out.print(counter + " ");
			
			counter = change / COIN_1_EURO; //change = 140
			change = change%COIN_1_EURO;
			
			System.out.print(counter + " ");
			
			counter = change / COIN_50_CENT; // change = 40
			change = change%COIN_50_CENT;
			
			System.out.print(counter + " ");
			
			counter = change / COIN_20_CENT; // change = 40
			change = change%COIN_20_CENT;
			
			System.out.print(counter + " ");
			
			counter = change / COIN_10_CENT; // change = 40
			change = change%COIN_10_CENT;
			
			System.out.print(counter + " ");
			
			counter = change / COIN_5_CENT; // change = 40
			change = change%COIN_5_CENT;
			
			System.out.print(counter + " ");
			
			counter = change / COIN_2_CENT; // change = 40
			change = change%COIN_2_CENT;
			
			System.out.print(counter + " ");
			
			counter = change / COIN_1_CENT; // change = 40
			change = change%COIN_1_CENT;
			
			System.out.print(counter + " ");
		} else {
			System.out.println("ERROR: You are trying to pay less!");
		}
		
		reader.close();
		

	}

}
