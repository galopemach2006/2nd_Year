package data_Structure_codes;
import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: "); // ask the user how many terms would he/she like
        int num = sc.nextInt();

        if (num <= 0) { // to reject negative numbers or 0
            System.out.println("Zero or negative numbers not allowed");
        } else {
            for (int i = 0; i <= num; i++) { // using a loop to print out every fibonacci number, if not it will just print the position of the fibonacci number
                System.out.println(fib(i));
            }
        }   
        sc.close();
    } 

    public static long fib(int n) {
        if (n <= 1) // base case to prevent it from looping different types of values
            return n;
        return fib(n - 1) + fib(n - 2); // this formula is needed to print out the succeeding terms
    }
}
