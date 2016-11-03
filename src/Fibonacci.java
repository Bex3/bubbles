import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by bearden-tellez on 9/27/16.
 */
public class Fibonacci {
    int numInvocations = 0;

    public static void main(String[] args) {
//        System.out.println("Please enter a number for the ");
//        Scanner inputScanner = new Scanner(System.in);
//        long fibNum = Long.valueOf(inputScanner.nextLine());
        Fibonacci myFib = new Fibonacci();
//        long fibNum = myFib.getFib(2);
//
        long fibNum = myFib.getFibonacciEff(10);
        System.out.println(fibNum);

    }


    public long getFib(long fibNum){
        numInvocations ++;
        if (fibNum == 0 || fibNum == 1){
            return fibNum;
        }
        return getFib(fibNum -1) + getFib(fibNum -2);
    }

    static HashMap<Long, Long> cachedFibs = new HashMap<Long, Long>();

    public long getFibonacciEff (long fibNum){
        numInvocations++;
        if (fibNum ==0 || fibNum == 1){
            return fibNum;
        }
          Long fibNumMinus1 = cachedFibs.get(new Long (fibNum-1));
            if (fibNumMinus1 == null){
                fibNumMinus1 = getFibonacciEff(fibNum-1);
            }
            Long fibNumMinus2 = cachedFibs.get(new Long (fibNum-2));
            if (fibNumMinus2 == null){
                fibNumMinus2 = getFibonacciEff(fibNum - 2);
            }
            cachedFibs.put(fibNum, fibNumMinus1 + fibNumMinus2);
            return fibNumMinus1 + fibNumMinus2;

    }





}
