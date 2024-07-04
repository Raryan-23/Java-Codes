package Recursion;
import java.util.*;
public class Sum_Parameterized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int ans=sum(n);
        System.out.println("The sum is: "+ ans);
        sc.close();
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n + sum(n-1);
    }
}
