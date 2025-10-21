package pruebas;

public class Pruebas {

	public static void main(String[] args) {
		int mes = 3;

		int dias = switch (mes) {

		case 1, 3, 5, 7, 8, 10, 12 : 
			yield 31;
		
		case 2 : 
			yield 28;
		
		case 4, 6, 9, 11 : 
			yield 30;
		
		default : 
			System.out.println("Valor incorrecto");
			yield -1;
		
		}; // NO OLVIDAR ;
		
		System.out.println("Dias = " + dias);
	}

}
