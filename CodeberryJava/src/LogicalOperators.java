/* You can win cash by playing the lottery. If the ticket number is a multiple of 10 and 9, the program outputs “You won $200”.

If it is a multiple of 4 or 6, the program outputs “You won $50”. In all other cases, there is no prize and the output is “Try again”. */

import java.util.Scanner;

public class LogicalOperators {
	public static void main(String[] args) {
		System.out.println("Enter your ticket: ");
		Scanner read = new Scanner(System.in);
	       int number = read.nextInt();
	       
	       //your code goes here
	       if (number % 10 == 0 && number % 9 == 0) {
	           System.out.println("You won $200");
	       } else if (number % 4 == 0 || number % 6 == 0) {
	           System.out.println("You won $50");
	       } else {
	           System.out.println("Try again");
	       } read.close();
	}
}
