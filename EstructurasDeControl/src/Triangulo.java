import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		/*
		 * Pedir 3 �ngulos al usuario y mostrar si forma un tri�ngulo v�lido
		 * */
		System.out.println("Introduce la medida de 3 �ngulos para saber si puede formarse un Tri�ngulo");
		Scanner sc = new Scanner(System.in);
		int ang1 = sc.nextInt(); 
		int ang2 = sc.nextInt();
		int ang3 = sc.nextInt(); 
		int suma = ang1 + ang2 + ang3;
		
		if ( suma == 180 ) {
			System.out.println("La suma es: " + suma + ", y S� se puede formar un tri�ngulo");
		} else {
			System.out.println("La suma es: " + suma + ", y NO se puede formar un tri�ngulo");
		}
	}
}
