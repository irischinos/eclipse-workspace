/* Tom and Bob are playing a board game, in which both players start with the same number of points. Tom won the first game and got 1 point, while Bob lost the game, and therefore lost 1 point.

You are given a program that is intended to take the initial score and increase Tom's score by 1 and decrease Bob's score by 1.
But something is wrong: the program outputs the scores without the change. */

import java.util.Scanner;

public class IncrementDecrement {

   public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);
       // taking initial score
       System.out.println("Which is the score?: ");
       int initScore = scanner.nextInt();
       int scoreTom = initScore;
       int scoreBob = initScore;
       
       System.out.println("Round 1 results:");
       //fix
       System.out.println("Tom: " + ++scoreTom);
       System.out.println("Bob: " + --scoreBob);
       scanner.close();
   }
}