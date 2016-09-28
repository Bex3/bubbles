import java.util.Scanner;

/**
 * Created by bearden-tellez on 9/27/16.
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Please enter a number for the ");
        Scanner inputScanner = new Scanner(System.in);
        long fibSequenceNum = Long.valueOf(inputScanner.nextLine());
        long fibReturn = getFib(fibSequenceNum);
    }

    public static long getFib(long fibSequenceNum){
        if (fibSequenceNum == 0 || fibSequenceNum == 1){
            return fibSequenceNum;
        }
        return getFib(fibSequenceNum -1) + getFib(fibSequenceNum -2);
    }
}
