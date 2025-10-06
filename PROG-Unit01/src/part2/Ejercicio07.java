package part2;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Constante donde almacenar el precio por adulto
		final double PRECIO_ADULTO = 20;
		
		// Constante donde almacenar el precio por entrada infantil
		final double PRECIO_INFANTIL = 15.50;
		
		// Constante donde almacenar el límite a partir del cual realizar el descuento
		final double LIMITE = 100;
		
		// Constante donde almacenar el descuento a aplicar
		final double DESCUENTO = 0.95;
		
		// Variable donde almacenar el número de entradas infantiles
		int entradasInfantiles;
		
		// Variable donde almacenar el número de entradas de adultos
		int entradasAdultos;
		
		// Variable donde almacenar el precio sin descuento
		double precio;
		
		// Variable donde almacenar el precio con el descuento aplicado
		double precioDescuento;
		
		// Se pregunta al usuario por el número de entradas infantiles
		System.out.println("¿Cuántas entradas infantiles quiere comprar?");
		entradasInfantiles = reader.nextInt();
		
		// Se pregunta al usuario por el número de entradas de adultos
		System.out.println("¿Cuántas entradas para adultos quiere comprar?");
		entradasAdultos = reader.nextInt();
		
		// Calculamos el precio total de entradas infantiles y entradas de adultos
		precio = entradasInfantiles * PRECIO_INFANTIL + entradasAdultos * PRECIO_ADULTO;
		
		// Si el precio total es mayor de 100 se aplica el descuento
		precioDescuento = precio >= LIMITE ? precio * DESCUENTO: precio;
		
		// Mostramos el precio con el descuento
		System.out.println("El precio a pagar es " + precioDescuento);
		
		// Cerramos scanner
		reader.close();
	}

}
