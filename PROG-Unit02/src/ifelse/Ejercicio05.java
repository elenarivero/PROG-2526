package ifelse;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Creo constantes para las distintas opciones del juego
		// Constante para PIEDRA
		final String PIEDRA = "PIEDRA";
		
		// Constante para TIJERAS
		final String TIJERAS = "TIJERAS";
		
		// Constante para PAPEL
		final String PAPEL = "PAPEL";

		// Variable donde almacenar la jugada del jugador 1
		String jugada1;
		
		// Variable donde almacenar la jugada del jugador 2
		String jugada2;

		Scanner reader = new Scanner(System.in);
		
		// Leemos jugada1
		jugada1 = reader.next();

		// Leemos jugada2
		jugada2 = reader.next();

		if(!jugada1.equals(PIEDRA) && !jugada1.equals(TIJERAS) && !jugada1.equals(PAPEL)){
			System.out.println("Jugada 1 incorrecta");
		} else if (!jugada2.equals(PIEDRA) && !jugada2.equals(TIJERAS) && !jugada2.equals(PAPEL)){
			System.out.println("Jugada 2 incorrecta");
		} else if (jugada1.equals(jugada2)) {// si introducen la misma cadena empatan
			System.out.println("EMPATE: " + jugada1 + " y " + jugada2);
		} else if (jugada1.equals(PIEDRA) && jugada2.equals(TIJERAS) 
				|| jugada1.equals(PAPEL) && jugada2.equals(PIEDRA)
				|| jugada1.equals(TIJERAS) && jugada2.equals(PAPEL)) {
			// Si gana el jugador 1
			System.out.println("Gana el jugador 1");
		} else {
			// En caso contrario gana el jugador 2
			System.out.println("Gana el jugador 2");
		}

		reader.close();

	}

}
