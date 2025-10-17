package ifelse;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		double x1;
		double x2;
		
		double discriminante;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduzca los coeficientes de la ecuación:");
		a = reader.nextInt();
		b = reader.nextInt();
		c = reader.nextInt();
		
		discriminante = b*b - 4*a*c;
		
		// si a == 0 es de primer grado
		if(a == 0) {
			// Tenemos una ecuación de primer grado
			x1 = (double)-c / b;
			System.out.println("La ecuación tiene sólo una solución: " + x1);
		} else if(discriminante >= 0) {
			// Si es positivo, tiene solución y se aplica la fórmula
			x1 = (-b + Math.sqrt(discriminante)) / (2*a);
			x2 = (-b - Math.sqrt(discriminante)) / (2*a);
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		} else {
			// Si es negativo no tiene solución
			System.out.println("La ecuación no tiene solución");
		}
		
		
		reader.close();

	}

}
