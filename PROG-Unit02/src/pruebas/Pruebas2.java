package pruebas;

public class Pruebas2 {

	public static void main(String[] args) {
		int mes = 32;
	
		switch (mes) {
		
		case 1, 3, 5, 7, 8, 10, 12: 
			System.out.println("Meses de 31 días");
			System.out.println("31 días");
			break;
		
		case 2:
			System.out.println("28 días");
			break;
		case 4, 6, 9, 11:
			System.out.println("30 días");
			break;
		default:
			System.out.println("Valor incorrecto");
			break;
		}
		
	}

}
