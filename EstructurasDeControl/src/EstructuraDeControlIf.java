import java.util.Scanner;

public class EstructuraDeControlIf {
	public static void main(String[] args) {
		// Estructuras de control de flujo
		// Nos sirve para la toma de decisiones

		// Estructuras de control de flujo nos sirven para
		// cambiar el flujo de nuestro programa
		// evaluando una condición y a partir de la evaluación
		// se realiza una acción  u otra

		/*
		if(condicion) {
		codigo
		} else {
			codigo
		}
		*/
		
		System.out.println("Introduce tu edad");
		Scanner sc = new Scanner(System.in);
		int edad = sc.nextInt(); 
		
		if(edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
		/*
		 * Pedir 3 números al usuario y mostrar un mensaje con el número mayor
		 * */
	}
}
