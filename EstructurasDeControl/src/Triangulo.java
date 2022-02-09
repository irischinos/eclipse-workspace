import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		/*
		 * Pedir 3 ángulos al usuario y mostrar si forma un triángulo válido
		 * */
		System.out.println("Introduce la medida de 3 ángulos para saber si puede formarse un Triángulo");
		Scanner sc = new Scanner(System.in);
		int ang1 = sc.nextInt(); 
		int ang2 = sc.nextInt();
		int ang3 = sc.nextInt(); 
		int suma = ang1 + ang2 + ang3;
		
		if ( suma == 180 ) {
			System.out.println("La suma es: " + suma + ", y SÍ se puede formar un triángulo");
		} else {
			System.out.println("La suma es: " + suma + ", y NO se puede formar un triángulo");
		}
	}
}
