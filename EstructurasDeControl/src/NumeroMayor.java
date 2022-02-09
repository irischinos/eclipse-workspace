import java.util.Scanner;

public class NumeroMayor {
	public static void main(String[] args) {
		/*
		 * Pedir 3 números al usuario y mostrar un mensaje con el número mayor
		 * */
		
		System.out.println("Introduce 3 números");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt(); 
		int num2 = sc.nextInt();
		int num3 = sc.nextInt(); 
		
		if( num1 > num2 && num1 > num3 ) {
			System.out.println("El número mayor es: " + num1);
		} else if ( num2 > num3 && num2 > num1 ){
			System.out.println("El número mayor es: " + num2);
		} else if( num3 > num1 && num3 > num2 ) {
			System.out.println("El número mayor es: " + num3);
		} else {
			System.out.println("ERROR");
		}
		sc.close();
	}
}
