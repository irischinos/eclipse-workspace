import java.util.Scanner;

public class TotalAmount {

   public static void main(String[] args) {
	   System.out.println("Welcome! write 2 amounts: ");
       Scanner sc = new Scanner(System.in);
       //get salaries
       System.out.println("First amount: ");
       int salary1 = sc.nextInt();
       System.out.println("Second amount: ");
       int salary2 = sc.nextInt();
       //your code goes here
       int totalAmount = salary1 + salary2;
       System.out.println("Total amount is: " + totalAmount);
       sc.close();
   }
}