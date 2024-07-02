/* LeetCode 189.Rotate Array */
/*This code rotates the array from the specific index */

import java.util.Scanner;
public class RotateArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            }
        System.out.print("Enter the number of times you want to rotate the array: ");
        int k=sc.nextInt();
        k=k%n;

        //Using the concept of reverse an array from given part.
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

        System.out.print("Your array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
            }
        sc.close();
    }

    public static void reverse(int[] arr, int i, int j) {
       while(i<=j){
        swap(arr,i,j);
        i++;
        j--;
       }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}