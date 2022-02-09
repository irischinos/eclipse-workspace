/* 
 * Time Converter
 * 
 * You need a program to convert days to seconds.
 * The given code takes the amount of days as input. Complete the code to convert it
 * to seconds and output the result. */

import java.util.Scanner;

public class DaysToSeconds {
	public static void main(String[] args) {
		System.out.println("How many days you wanna convert to seconds?: ");
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		int hoursInADay = 24;
		int totalHoursInADay = hoursInADay * days;
		int minutes = totalHoursInADay * 60;
		int seconds = minutes * 60;
		System.out.println(days + " days are: " + seconds + " seconds");
		scanner.close();
	}
}