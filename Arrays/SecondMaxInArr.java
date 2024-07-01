// Code to calculate the second maximum element in the array.

import java.util.Scanner;
public class SecondMaxInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max =Math.max(max, arr[i]);
        }
        int secMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max)
            secMax = Math.max(arr[i], secMax);
            }

        System.out.println(secMax + " is the second largest element. ");
        sc.close();
    }
}
