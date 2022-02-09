/* Students can apply for a scholarship if their average grade is higher than 3.5.
Write a program that prints “Congratulations” if the student meets the average grade requirement, and “Sorry” if not. */

import java.util.Scanner;

public class ScholarshipIfElse {
	public static void main(String[] args) {
		System.out.println("Type your grade to know if you can get a scholarship: ");
		Scanner scanner = new Scanner(System.in);
		double score = scanner.nextDouble();
		if ( score > 3.5 ) {
			System.out.println("Congratulations");
		} else {
			System.out.println("Sorry");
		}
		scanner.close();
	}
}
