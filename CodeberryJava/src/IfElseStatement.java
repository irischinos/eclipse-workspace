import java.util.Scanner;

public class IfElseStatement {
	public static void main(String[] args) {
		System.out.println("How old are you?: ");
		Scanner age = new Scanner(System.in);
		int yourAge = age.nextInt();
		if( yourAge < 18 ) {
			System.out.println("So sorry, you are too young");
		} else {
			System.out.println("Welcome!");
		}
		age.close();
	}
}
