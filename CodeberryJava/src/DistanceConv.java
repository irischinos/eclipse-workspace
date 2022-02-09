import java.util.Scanner;

public class DistanceConv {
   public static void main(String[] args) {
	   System.out.println("Enter the number to convert it to (km) and (m) :");
       Scanner read = new Scanner(System.in);
       int distance = read.nextInt();
       //complete the code
       int kilometers = distance / 1000;
       int meters = distance % 1000;
       System.out.println("Kilometers: " + kilometers);
       System.out.println("Meters: " + meters);
       read.close();
   }
}