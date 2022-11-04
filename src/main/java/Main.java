import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        Integer n = Integer.parseInt(number.nextLine());
        System.out.println("The sum of 1 to " + n  + " is " + sumOfNumbers(n));

    }
    
    public static int sumOfNumbers(int n) {
        Integer number = 0;
        for (int i = 0; i <= n; i++) {
            number+= i;
        }
        return number;
    }
    // for Extra Credit
    int gaussianSumOfNumbers(int n) {
        return 0;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    
}
