package dowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int numAleatorio;
		int min = 1;
		int max = 101;
		
		String respuesta;
		
		Scanner reader = new Scanner(System.in);
		
		do {
			numAleatorio = rand.nextInt(min, max);
			System.out.println("¿Es " + numAleatorio + "?");
			respuesta = reader.next();
			
			
		}while(!respuesta.equals("iguales"));
		
		
		reader.close();

	}

}
