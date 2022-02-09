import java.util.Scanner;

public class DescuentosAplicados {
	public static void main(String[] args) {
		// si la cuenta es de menos de 1000
		// sila cuenta es de 1000 - 4999 10%
		// si la cuenta es de 5000 a 9999 20%
		// si la compra es de 10000 o más 30%

		
		System.out.println("¿Cuál fue el total de tu compra?");
		Scanner sc = new Scanner(System.in);
		double compra = sc.nextDouble(); 
		
				
		if( compra >= 1000 && compra < 5000 ) {
			double descuento1 = compra * 0.90;
			System.out.println("Tienes 10% de descuento, pagarás: " + "$" + descuento1);
		} else if( compra >= 5000 && compra < 10000 ) {
			double descuento2 = compra * 0.80;
			System.out.println("Tienes 20% de descuento, pagarás: " + "$" + descuento2);
		} else if( compra >= 10000 ) {
			double descuento3 = compra * 0.70;
			System.out.println("Tienes 30% de descuento, pagarás: " + "$" + descuento3);
		} else if( compra < 1000 ) {
			System.out.println("No aplica descuento, pagarás: " + "$" + compra);
		} else {
			System.out.println("ERROR");
		}
	}
	
}