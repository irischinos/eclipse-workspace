/*
 * Conditional Statement (if)
 * 
 * You have $12,000 to buy a car. 
 * You're given a program which takes the price of car as an input.
 * Task : Output "yes" if the price is lower than or equal to 12,000. */
import java.util.Scanner;

public class IfConditionalStatement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Price of the car: ");
	    int price = scanner.nextInt();
	    if ( price <= 12000 ) {
	        System.out.println("Yes, you can buy it!");
	     }
	    scanner.close();
	}
}
