
/*Students are given homework in math, history, and geometry.
Write a program that takes the time spent on each subject as input, and calculates and outputs the total number of hours and minutes spent on each subject, each on a new line accordingly.*/

import java.util.Scanner;

public class TimeToStudy {

   public static void main(String[] args) {
	   System.out.println("How much time do you spend to study?");
       Scanner scanner = new Scanner(System.in);
       System.out.println("Maths: ");
       int math = scanner.nextInt();
       System.out.println("History: ");
       int history = scanner.nextInt();
       System.out.println("Geometry: ");
       int geometry = scanner.nextInt();
       int studyTime = math + history + geometry;
       int hours = studyTime / 60;
       int minutes = studyTime % 60;
       System.out.println("You spend " + hours + " hour(s)" + ", " + "and " + minutes + " minutes.");
       scanner.close();
   }
}