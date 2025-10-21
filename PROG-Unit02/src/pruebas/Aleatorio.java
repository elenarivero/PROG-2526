package pruebas;

import java.util.Random;

public class Aleatorio {

	public static void main(String[] args) {
		
		Random pepito = new Random();
		
		double num = pepito.nextInt(1, 100);
		boolean valor = pepito.nextBoolean();
		
		System.out.println(valor);
		System.out.println(num);
	}

}
