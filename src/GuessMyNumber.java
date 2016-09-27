/**
 * Created by bearden-tellez on 9/27/16.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String[] args) {



        System.out.println("GuessMyNumber is running!");
        // Ask the user for their number
        // and store it in an int variable


        while(true) {
            System.out.println("Please enter a number between 0 and 10");

            int userNumber;
            try {
                Scanner inputScanner = new Scanner(System.in);
                userNumber = inputScanner.nextInt();
//                userNumber = Integer.valueOf(inputScanner.nextLine()); //what Dom meant to provide


                System.out.println("You entered: " + userNumber);
                // Generate a random number between 0 and 10
                // and store it in another int variable
                int computerNumber = (int) (Math.random() * 10);
                System.out.println("Computer generated: " + computerNumber);

                // Compare the two and display who won
                if (userNumber > computerNumber) {
                    System.out.println("You win!");
                } else {
                    System.out.println("I win!");
                }
                System.out.println("Thank you for playing!");
            } catch (InputMismatchException ex) {
                System.out.println("Please try again and enter a number");
            }
        }
    }
}
