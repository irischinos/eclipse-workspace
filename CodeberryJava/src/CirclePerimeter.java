import java.util.Scanner;

public class CirclePerimeter {

   public static void main(String[] args) {
	   System.out.println("Value of radius: ");
       Scanner scanner = new Scanner(System.in);
       double pi = 3.14;
       //your code goes here
       int radius = scanner.nextInt();
       double perimeter = (radius + radius) * pi;
       System.out.println("The perimeter of the circle is: " + perimeter);
       scanner.close();
   }
}