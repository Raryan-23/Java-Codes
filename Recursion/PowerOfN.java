package Recursion;
import java.util.*;
public class PowerOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        int base = sc.nextInt();
        System.out.print("Enter the power value: ");
        int power = sc.nextInt();
        int ans= powerOf(power,base);
        System.out.println("The power of "+base+" raised to "+power+" is "+ ans);
        int newans = OptimizedPowerOf(power, base);
        System.out.println("The power of "+base+" raised to "+power+" is "+ newans);
        sc.close();
    }

    public static int OptimizedPowerOf(int power,int base){
        if(power==0){
            return 1;
        }
        int ans = OptimizedPowerOf(power/2,base);
        if(power%2 == 0) return ans * ans;
        else return ans * ans * base;
    }
    public static int powerOf(int power, int base) {
        if(power==0){
            return 1;
        }
        return base*powerOf(power-1,base);
    }
}
