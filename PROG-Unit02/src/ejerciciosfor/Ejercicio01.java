package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Variable donde almacenar el número introducido por el usuario
		int num;
		
		// Scanner para leer el número
		Scanner reader = new Scanner(System.in);
		
		// Le pedimos un número al usuario
		System.out.println("Introduzca un número:");
		num = reader.nextInt();
		
		// for: desde 1 hasta num de 1 en 1
		for(int cont = 1; cont<= num; cont++) {
			System.out.println(cont);
		}
		
		
		
		// Cerramos el Scanner
		reader.close();

	}

}
