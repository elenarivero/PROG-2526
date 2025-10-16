package diagrams;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int horas;
		int minutos;
		int segundos;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduzca las horas:");
		horas = reader.nextInt();
		
		System.out.println("Introduzca los minutos:");
		minutos = reader.nextInt();
		
		System.out.println("Introduzca los segundos:");
		segundos = reader.nextInt();
		
		// Si los segundos son menores a 59
		if(segundos < 59) {
			segundos++;
		} else { // Segundos mayores a 59
			segundos = 0;
			if(minutos < 59) {
				minutos++;
			} else {
				minutos = 0;
				if (horas < 23) {
					horas++;
				} else {
					horas = 0;
				} // fin else de las horas
			} // fin else de los minutos
		}// fin else de los segundos
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		
		reader.close();
	} // fin main
} // fin clase
