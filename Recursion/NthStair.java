package Recursion;
import java.util.*;
public class NthStair{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Stair number: ");
        int n = sc.nextInt();
        int ans = climbStairs(n);
        System.out.println("Number of ways to climb the stairs: "+ans);
        sc.close();
    }

    
    public static int climbStairs(int n) {
        if (n<=2) {
            return n;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }

}
