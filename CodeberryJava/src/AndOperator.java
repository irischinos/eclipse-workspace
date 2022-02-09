/*
 * You're a tour manager and need a program that will identify small countries.
A country is considered small if its population is under 10000 and its area is under 10000 hectares.
The given program takes population and area as input.

Task
Complete the program to output "small country" if both conditions are met. Don't output anything otherwise.
*/
import java.util.Scanner;

public class AndOperator {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Population: ");
	    int population = read.nextInt();
	    System.out.println("Area: ");
	    int area = read.nextInt();
	    if ( population < 10000 && area < 10000 ) {
	         System.out.println("Is a small country");
	    } read.close();	     
	}   
}
