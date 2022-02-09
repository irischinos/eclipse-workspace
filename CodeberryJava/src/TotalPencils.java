import java.util.Scanner;

public class TotalPencils
{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); 
        int pupils = myObj.nextInt();
        int pencils = myObj.nextInt();
        
        //your code goes here
        int totalPencils = pupils * pencils;
        System.out.println(totalPencils);
        myObj.close();
    }
}