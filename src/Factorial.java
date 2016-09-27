import java.util.Scanner;

/**
 * Created by bearden-tellez on 9/27/16.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        //create scanner
        System.out.println("Please enter a number you would like to make a factorial");
        //input the number
        int userNumber = Integer.valueOf(inputScanner.nextLine());
        //save number to variable
        int calculatedFactorialNumber = createFactorial(userNumber);
        //make new int to save results of the calculation
        System.out.println("Factorial of " + userNumber + " "+ "is: " + calculatedFactorialNumber);
        //print out original & factorial number...
    }

    public static int createFactorial(int userNumber){ //do I need a max in this example?
        System.out.println(userNumber);
        if (userNumber <= 1){
            return 1;
        }
          return userNumber * createFactorial(userNumber-1);
    }

//    public int recursionTest(int count, int max) { //our class example
//        System.out.print(count + " ");
//        if (count >= max) {
//            return count;
//        }
//        return recursionTest(count+1, max); //calling itself with an additional value
//    }

}
