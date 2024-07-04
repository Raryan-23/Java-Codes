//code for the fibonacci series in java using recursion
package Recursion;
import java.util.Scanner;
public class FibonacciSeriesRecursion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series: ");
        System.out.print(fibonacci(n));
        sc.close();
        }

   public static int fibonacci(int n)
   {
    if (n <= 1) return 1;
    return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

 
